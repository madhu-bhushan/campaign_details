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
