package com.campaign_details.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.campaign_details.data.CampaignAdDetailsVO;
import com.campaign_details.data.CampaignDetailsTokenVO;
import com.campaign_details.data.CampaignDetailsVO;
import com.campaign_details.data.CampaignPlacementDetailsVO;
import com.campaign_details.data.CampaignVO;

public class CampaignDetailsRestClientUtil
{
	public static CampaignDetailsTokenVO getCampaignDetailsTokenVO()
	{
		CampaignDetailsTokenVO campaignDetailsTokenVO = new CampaignDetailsTokenVO();
		
		try
		{
			URL url = new URL(CampaignDetailsConstants.TOKEN_URL);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod(CampaignDetailsConstants.API_TYPE_POST);
			conn.setRequestProperty(CampaignDetailsConstants.REQUEST_PROPERTY_CONTENT_TYPE, "application/x-www-form-urlencoded");
			conn.setRequestProperty(CampaignDetailsConstants.REQUEST_PROPERTY_CACHE_CONTROL, "no-cache");
			conn.setRequestProperty(CampaignDetailsConstants.REQUEST_PROPERTY_AUTHORIZATION, 
														CampaignDetailsConstants.REQUEST_PROPERTY_AUTHORIZATION_BASIC + CampaignDetailsConstants.BASIC_AUTH_VALUE);
	        
			String postData = CampaignDetailsConstants.REQUEST_PROPERTY_GRANT_TYPE + CampaignDetailsConstants.REQUEST_PROPERTY_GRANT_TYPE_VALUE;
			conn.setRequestProperty(CampaignDetailsConstants.REQUEST_PROPERTY_CONTENT_LENGTH,  String.valueOf(postData.length()));
			
			OutputStream outputStream = conn.getOutputStream();
			outputStream.write(postData.getBytes());
			outputStream.flush();
			
			// Read response
	        StringBuilder responseSB = new StringBuilder();
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((conn.getInputStream())));
	          
	        String line;
	        while ( (line = bufferedReader.readLine()) != null) {
	            responseSB.append(line);
	        }
	                 
	        // Close streams
	        bufferedReader.close();
	        outputStream.close();
	         
	        String responseJSON = responseSB.toString();
	        
	        System.err.println("responseJSON:"+responseJSON);
	        
	        JSONObject jsonObj = new JSONObject(responseJSON);

	        campaignDetailsTokenVO.setTokenType(jsonObj.getString("token_type"));
	        campaignDetailsTokenVO.setTokenValue(jsonObj.getString("token"));
	        
	        System.out.println(campaignDetailsTokenVO.getTokenValue());
	        System.out.println(campaignDetailsTokenVO.getTokenType());
	        
			conn.disconnect();
		}
		catch(Exception exception)
		{
			System.err.println("Exception occured while getting campaign details token:"+exception.getMessage());
		}
		
		return campaignDetailsTokenVO;
	}
	
	/**
	 * @param startDay
	 * @param endDay
	 * @param campaignDetailsTokenVO
	 * @return
	 */
	public static CampaignDetailsVO getAllCampaignDetails(String startDay, String endDay, CampaignDetailsTokenVO campaignDetailsTokenVO)
	{
		CampaignDetailsVO campaignDetailsVO = new CampaignDetailsVO();
		
		try
		{
			//start_day=2017-01-01&end_day=2017-01-01&
			String urlString = CampaignDetailsConstants.CAMPAIGN_DETAILS_URL;
			
			urlString = appendStartAndEndDaysInUrl(startDay, endDay, urlString);
			
			URL url = new URL(urlString);
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod(CampaignDetailsConstants.API_TYPE_GET);
			conn.setRequestProperty(CampaignDetailsConstants.REQUEST_PROPERTY_ACCEPT, CampaignDetailsConstants.REQUEST_PROPERTY_ACCEPT_JSON);
			conn.setRequestProperty(CampaignDetailsConstants.REQUEST_PROPERTY_AUTHORIZATION, 
														CampaignDetailsConstants.REQUEST_PROPERTY_AUTHORIZATION_BEARER + campaignDetailsTokenVO.getTokenValue());
			// Read response
	        StringBuilder responseSB = new StringBuilder();
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((conn.getInputStream())));
	          
	        String line;
	        while ( (line = bufferedReader.readLine()) != null) {
	            responseSB.append(line);
	        }
	                 
	        // Close streams
	        bufferedReader.close();
	         
	        String responseJSON = responseSB.toString();
	        
	        System.err.println("responseJSON:"+responseJSON);
	        
	        JSONObject jsonObj = new JSONObject(responseJSON);
	        JSONArray jsonArray = jsonObj.getJSONArray("items");
	        
	        Iterator<Object> iterator = jsonArray.iterator();
	        
            while (iterator.hasNext()) 
            {
               JSONObject campaignDetailJsonObj = (JSONObject)iterator.next();
               
               CampaignVO campaignVO = new CampaignVO();
               
               campaignVO.setId(campaignDetailJsonObj.getString("campaign_id"));
               campaignVO.setName(campaignDetailJsonObj.getString("campaign_name"));
               campaignVO.setPlacements(getPlacementDetailsForAnCampaignID(startDay, endDay, campaignDetailsTokenVO, campaignDetailJsonObj.getString("campaign_id")));
               
               campaignDetailsVO.getCampaignDetails().add(campaignVO);
            }
		}
		catch(Exception exception)
		{
			System.err.println("Exception occured while getting campaign details: "+exception.getMessage());
		}
		
		return campaignDetailsVO;
	}

	/**
	 * @param startDay
	 * @param endDay
	 * @param campaignDetailsTokenVO
	 * @param campaignID
	 * @return
	 */
	public static List<CampaignPlacementDetailsVO> getPlacementDetailsForAnCampaignID(String startDay, String endDay, CampaignDetailsTokenVO campaignDetailsTokenVO, String campaignID)
	{
		List<CampaignPlacementDetailsVO> placementDetails = new ArrayList<>();
		
		try
		{
			String urlString = CampaignDetailsConstants.CAMPAIGN_PLACEMENT_DETAILS_URL.replace("${campaign_id}", campaignID);
			
			urlString = appendStartAndEndDaysInUrl(startDay, endDay, urlString);
			
			URL url = new URL(urlString);
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod(CampaignDetailsConstants.API_TYPE_GET);
			conn.setRequestProperty(CampaignDetailsConstants.REQUEST_PROPERTY_ACCEPT, CampaignDetailsConstants.REQUEST_PROPERTY_ACCEPT_JSON);
			conn.setRequestProperty(CampaignDetailsConstants.REQUEST_PROPERTY_AUTHORIZATION, 
														CampaignDetailsConstants.REQUEST_PROPERTY_AUTHORIZATION_BEARER + campaignDetailsTokenVO.getTokenValue());
			// Read response
	        StringBuilder responseSB = new StringBuilder();
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((conn.getInputStream())));
	          
	        String line;
	        while ( (line = bufferedReader.readLine()) != null) {
	            responseSB.append(line);
	        }
	                 
	        // Close streams
	        bufferedReader.close();
	         
	        String responseJSON = responseSB.toString();
	        
	        System.err.println("responseJSON:"+responseJSON);
	        
	        JSONObject jsonObj = new JSONObject(responseJSON);
	        JSONArray jsonArray = jsonObj.getJSONArray("items");
	        
	        Iterator<Object> iterator = jsonArray.iterator();
	        
            while (iterator.hasNext()) 
            {
               JSONObject campaignPlacementDetailJsonObj = (JSONObject)iterator.next();
               
               CampaignPlacementDetailsVO campaignPlacementDetailsVO = new CampaignPlacementDetailsVO();
               
               campaignPlacementDetailsVO.setId(campaignPlacementDetailJsonObj.getString("placement_id"));
               campaignPlacementDetailsVO.setName(campaignPlacementDetailJsonObj.getString("placement_name"));
               campaignPlacementDetailsVO.setAdDetails(getCampaignAdDetailsForAnPlacementID(startDay, endDay, campaignDetailsTokenVO, campaignPlacementDetailJsonObj.getString("placement_id")));
               
               placementDetails.add(campaignPlacementDetailsVO);
            }
		}
		catch(Exception exception)
		{
			System.err.println("Exception occured while getting campaign placement details: "+exception.getMessage());
		}
		
		return placementDetails;
	}
	
	/**
	 * @param startDay
	 * @param endDay
	 * @param campaignDetailsTokenVO
	 * @param placementID
	 * @return
	 */
	public static List<CampaignAdDetailsVO> getCampaignAdDetailsForAnPlacementID(String startDay, String endDay, CampaignDetailsTokenVO campaignDetailsTokenVO, String placementID)
	{
		List<CampaignAdDetailsVO> adDetails = new ArrayList<>();
		
		try
		{
			String urlString = CampaignDetailsConstants.CAMPAIGN_AD_DETAILS_URL.replace("${placement_id}", placementID);
			
			urlString = appendStartAndEndDaysInUrl(startDay, endDay, urlString);
			
			URL url = new URL(urlString);
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod(CampaignDetailsConstants.API_TYPE_GET);
			conn.setRequestProperty(CampaignDetailsConstants.REQUEST_PROPERTY_ACCEPT, CampaignDetailsConstants.REQUEST_PROPERTY_ACCEPT_JSON);
			conn.setRequestProperty(CampaignDetailsConstants.REQUEST_PROPERTY_AUTHORIZATION, 
														CampaignDetailsConstants.REQUEST_PROPERTY_AUTHORIZATION_BEARER + campaignDetailsTokenVO.getTokenValue());
			// Read response
	        StringBuilder responseSB = new StringBuilder();
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((conn.getInputStream())));
	          
	        String line;
	        while ( (line = bufferedReader.readLine()) != null) {
	            responseSB.append(line);
	        }
	                 
	        // Close streams
	        bufferedReader.close();
	         
	        String responseJSON = responseSB.toString();
	        
	        System.err.println("responseJSON:"+responseJSON);
	        
	        JSONObject jsonObj = new JSONObject(responseJSON);
	        JSONArray jsonArray = jsonObj.getJSONArray("items");
	        
	        Iterator<Object> iterator = jsonArray.iterator();
	        
            while (iterator.hasNext()) 
            {
               JSONObject campaignAdDetailJsonObj = (JSONObject)iterator.next();
               
               CampaignAdDetailsVO campaignAdDetailsVO = new CampaignAdDetailsVO();
               
               
               campaignAdDetailsVO.setId(campaignAdDetailJsonObj.getString("ad_id"));
               campaignAdDetailsVO.setName(campaignAdDetailJsonObj.getString("ad_name"));
               
               JSONObject statsJsonObj = campaignAdDetailJsonObj.getJSONObject("stats");
               
               campaignAdDetailsVO.setStart_day(statsJsonObj.getString("start_day"));
               campaignAdDetailsVO.setEnd_day(statsJsonObj.getString("end_day"));
               
               JSONArray bucketsJsonArray = jsonObj.getJSONArray("buckets");
               Iterator<Object> bucketsIterator = bucketsJsonArray.iterator();
               
               while(bucketsIterator.hasNext())
               {
            	   JSONObject bucketsJsonObj = (JSONObject)bucketsIterator.next();
            	   
            	   JSONObject bucketsDataJsonObj = bucketsJsonObj.getJSONObject("data");
            	   
            	   campaignAdDetailsVO.setImpressions(bucketsDataJsonObj.getString("impressions"));
            	   campaignAdDetailsVO.setViews(bucketsDataJsonObj.getString("views"));
            	   campaignAdDetailsVO.setPlay_rate(bucketsDataJsonObj.getString("play_rate"));
            	   campaignAdDetailsVO.setViewed_minutes(bucketsDataJsonObj.getString("viewed_minutes"));
            	   campaignAdDetailsVO.setPlaytime_per_view(bucketsDataJsonObj.getString("playtime_per_view"));
            	   campaignAdDetailsVO.setPct_viewed_avg(bucketsDataJsonObj.getString("pct_viewed_avg"));
            	   campaignAdDetailsVO.setCompletions25(bucketsDataJsonObj.getString("completions25"));
            	   campaignAdDetailsVO.setCompletions50(bucketsDataJsonObj.getString("completions50"));
            	   campaignAdDetailsVO.setCompletions75(bucketsDataJsonObj.getString("completions75"));
            	   campaignAdDetailsVO.setCompletions100(bucketsDataJsonObj.getString("completions100"));
            	   campaignAdDetailsVO.setPct_completions25(bucketsDataJsonObj.getString("pct_completions25"));
            	   campaignAdDetailsVO.setPct_completions50(bucketsDataJsonObj.getString("pct_completions50"));
            	   campaignAdDetailsVO.setPct_completions75(bucketsDataJsonObj.getString("pct_completions75"));
            	   campaignAdDetailsVO.setPct_completions100(bucketsDataJsonObj.getString("pct_completions100"));
            	   campaignAdDetailsVO.setShares_facebook(bucketsDataJsonObj.getString("shares_facebook"));
            	   campaignAdDetailsVO.setShares_twitter(bucketsDataJsonObj.getString("shares_twitter"));
            	   campaignAdDetailsVO.setEngagements(bucketsDataJsonObj.getString("engagements"));
            	   campaignAdDetailsVO.setFacebook_fan_page_clicks(bucketsDataJsonObj.getString("facebook_fan_page_clicks"));
            	   campaignAdDetailsVO.setVideo_and_overlay_clicks(bucketsDataJsonObj.getString("video_and_overlay_clicks"));
            	   campaignAdDetailsVO.setTotal_click_throughs(bucketsDataJsonObj.getString("total_click_throughs"));
            	   campaignAdDetailsVO.setCtr(bucketsDataJsonObj.getString("ctr"));
            	   campaignAdDetailsVO.setCompanion_impressions(bucketsDataJsonObj.getString("companion_impressions"));
            	   campaignAdDetailsVO.setCompanion_click_throughs(bucketsDataJsonObj.getString("companion_click_throughs"));
            	   campaignAdDetailsVO.setCompanion_ctr(bucketsDataJsonObj.getString("companion_ctr"));
            	   campaignAdDetailsVO.setConversions_impressions(bucketsDataJsonObj.getString("conversions_impressions"));
            	   campaignAdDetailsVO.setConversions_impressions_avg_days(bucketsDataJsonObj.getString("conversions_impressions_avg_days"));
            	   campaignAdDetailsVO.setConversions_view(bucketsDataJsonObj.getString("conversions_view"));
            	   campaignAdDetailsVO.setConversions_view_avg_days(bucketsDataJsonObj.getString("conversions_view_avg_days"));
            	   campaignAdDetailsVO.setConversions_click_through(bucketsDataJsonObj.getString("conversions_click_through"));
            	   campaignAdDetailsVO.setConversions_click_through_avg_days(bucketsDataJsonObj.getString("conversions_click_through_avg_days"));
            	   campaignAdDetailsVO.setViewability_instrumented_impressions(bucketsDataJsonObj.getString("viewability_instrumented_impressions"));
            	   campaignAdDetailsVO.setViewability_unmeasurable_iframe(bucketsDataJsonObj.getString("viewability_unmeasurable_iframe"));
            	   campaignAdDetailsVO.setViewability_unmeasurable_other(bucketsDataJsonObj.getString("viewability_unmeasurable_other"));
            	   campaignAdDetailsVO.setViewable_impressions(bucketsDataJsonObj.getString("viewable_impressions"));
            	   campaignAdDetailsVO.setViewable_impression_rate(bucketsDataJsonObj.getString("viewable_impression_rate"));
            	   campaignAdDetailsVO.setViewable_pct_impressions(bucketsDataJsonObj.getString("viewable_pct_impressions"));
            	   campaignAdDetailsVO.setViewable_views(bucketsDataJsonObj.getString("viewable_views"));
            	   campaignAdDetailsVO.setViewable_complete25(bucketsDataJsonObj.getString("viewable_complete25"));
            	   campaignAdDetailsVO.setViewable_complete50(bucketsDataJsonObj.getString("viewable_complete50"));
            	   campaignAdDetailsVO.setViewable_complete75(bucketsDataJsonObj.getString("viewable_complete75"));
            	   campaignAdDetailsVO.setViewable_complete100(bucketsDataJsonObj.getString("viewable_complete100"));
            	   campaignAdDetailsVO.setViewable_pct_complete25(bucketsDataJsonObj.getString("viewable_pct_complete25"));
            	   campaignAdDetailsVO.setViewable_pct_complete50(bucketsDataJsonObj.getString("viewable_pct_complete50"));
            	   campaignAdDetailsVO.setViewable_pct_complete75(bucketsDataJsonObj.getString("viewable_pct_complete75"));
            	   campaignAdDetailsVO.setViewable_pct_complete100(bucketsDataJsonObj.getString("viewable_pct_complete100"));
            	   campaignAdDetailsVO.setNot_viewable_impressions(bucketsDataJsonObj.getString("not_viewable_impressions"));
            	   campaignAdDetailsVO.setNot_viewable_pct_impressions(bucketsDataJsonObj.getString("not_viewable_pct_impressions"));
            	   campaignAdDetailsVO.setPlayer_width_avg(bucketsDataJsonObj.getString("player_width_avg"));
            	   campaignAdDetailsVO.setPlayer_height_avg(bucketsDataJsonObj.getString("player_height_avg"));
            	   campaignAdDetailsVO.setMobile_installs(bucketsDataJsonObj.getString("mobile_installs"));
            	   campaignAdDetailsVO.setFacebook_page_likes(bucketsDataJsonObj.getString("facebook_page_likes"));
            	   campaignAdDetailsVO.setFacebook_post_comments(bucketsDataJsonObj.getString("facebook_post_comments"));
            	   campaignAdDetailsVO.setFacebook_post_likes(bucketsDataJsonObj.getString("facebook_post_likes"));
            	   campaignAdDetailsVO.setFacebook_post_shares(bucketsDataJsonObj.getString("facebook_post_shares"));
            	   campaignAdDetailsVO.setClick_through_view_rate(bucketsDataJsonObj.getString("click_through_view_rate"));
            	   campaignAdDetailsVO.setViewable_measurable_impressions(bucketsDataJsonObj.getString("viewable_measurable_impressions"));
            	   campaignAdDetailsVO.setViewable_measurable_rate(bucketsDataJsonObj.getString("viewable_measurable_rate"));
            	   campaignAdDetailsVO.setViewable_unmeasurable_impressions(bucketsDataJsonObj.getString("viewable_unmeasurable_impressions"));
            	   campaignAdDetailsVO.setViewable_unmeasurable_rate_iframe(bucketsDataJsonObj.getString("viewable_unmeasurable_rate_iframe"));
            	   campaignAdDetailsVO.setViewable_unmeasurable_rate_not_supported(bucketsDataJsonObj.getString("viewable_unmeasurable_rate_not_supported"));
            	   campaignAdDetailsVO.setViewable_unmeasurable_rate_other(bucketsDataJsonObj.getString("viewable_unmeasurable_rate_other"));
            	   campaignAdDetailsVO.setViewable_unmeasurable_rate_total(bucketsDataJsonObj.getString("viewable_unmeasurable_rate_total"));
            	   campaignAdDetailsVO.setSurvey_starts(bucketsDataJsonObj.getString("survey_starts"));
            	   campaignAdDetailsVO.setSurvey_completions(bucketsDataJsonObj.getString("survey_completions"));
            	   campaignAdDetailsVO.setTotal_fees(bucketsDataJsonObj.getString("total_fees"));
            	   campaignAdDetailsVO.setBillable_total_fees(bucketsDataJsonObj.getString("billable_total_fees"));
            	   campaignAdDetailsVO.setNon_billable_total_fees(bucketsDataJsonObj.getString("non_billable_total_fees"));
            	   campaignAdDetailsVO.setBillable_media_fees(bucketsDataJsonObj.getString("billable_media_fees"));
            	   campaignAdDetailsVO.setBillable_data_fees(bucketsDataJsonObj.getString("billable_data_fees"));
            	   campaignAdDetailsVO.setBillable_other_fees(bucketsDataJsonObj.getString("billable_other_fees"));
            	   campaignAdDetailsVO.setNon_billable_data_fees(bucketsDataJsonObj.getString("non_billable_data_fees"));
            	   campaignAdDetailsVO.setNon_billable_media_fees(bucketsDataJsonObj.getString("non_billable_media_fees"));
            	   campaignAdDetailsVO.setNon_billable_other_fees(bucketsDataJsonObj.getString("non_billable_other_fees"));
            	   campaignAdDetailsVO.setAdvertiser_data_fees(bucketsDataJsonObj.getString("advertiser_data_fees"));
            	   campaignAdDetailsVO.setAdvertiser_media_fees(bucketsDataJsonObj.getString("advertiser_media_fees"));
            	   campaignAdDetailsVO.setAdvertiser_other_fees(bucketsDataJsonObj.getString("advertiser_other_fees"));
            	   campaignAdDetailsVO.setAdvertiser_total_fees(bucketsDataJsonObj.getString("advertiser_total_fees"));
            	   campaignAdDetailsVO.setCpa(bucketsDataJsonObj.getString("cpa"));
            	   campaignAdDetailsVO.setCpc(bucketsDataJsonObj.getString("cpc"));
            	   campaignAdDetailsVO.setCpcv(bucketsDataJsonObj.getString("cpcv"));
            	   campaignAdDetailsVO.setCpi(bucketsDataJsonObj.getString("cpi"));
            	   campaignAdDetailsVO.setCpm(bucketsDataJsonObj.getString("cpm"));
            	   campaignAdDetailsVO.setCpv(bucketsDataJsonObj.getString("cpv"));
            	   campaignAdDetailsVO.setVcpm(bucketsDataJsonObj.getString("vcpm"));
            	   campaignAdDetailsVO.setMedia_spend_total(bucketsDataJsonObj.getString("media_spend_total"));
            	   campaignAdDetailsVO.setMedia_spend_cpm(bucketsDataJsonObj.getString("media_spend_cpm"));
            	   campaignAdDetailsVO.setData_spend_total(bucketsDataJsonObj.getString("data_spend_total"));
            	   campaignAdDetailsVO.setData_spend_cpm(bucketsDataJsonObj.getString("data_spend_cpm"));
            	   campaignAdDetailsVO.setOther_spend_cpm(bucketsDataJsonObj.getString("other_spend_cpm"));
            	   campaignAdDetailsVO.setOther_spend_total(bucketsDataJsonObj.getString("other_spend_total"));
            	   
            	   break;
               }
               
               adDetails.add(campaignAdDetailsVO);
            }
		}
		catch(Exception exception)
		{
			System.err.println("Exception occured while getting campaign ad details: "+exception.getMessage());
		}
		
		return adDetails;
	}
	
	/**
	 * @param startDay
	 * @param endDay
	 * @param urlString
	 * @return
	 */
	private static String appendStartAndEndDaysInUrl(String startDay,
			String endDay, String urlString)
	{
		if(startDay == null)
		{
			urlString = urlString.concat("&start_day=").concat("2017-01-01");
		}
		else
		{
			urlString = urlString.concat("&start_day=").concat(startDay);
		}
		
		if(endDay == null)
		{
			urlString = urlString.concat("&end_day=").concat("2017-01-01");
		}
		else
		{
			urlString = urlString.concat("&end_day=").concat(endDay);
		}
		return urlString;
	}
}
