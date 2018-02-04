package com.campaign_details.data;

import java.util.ArrayList;
import java.util.List;

public class CampaignDetailsVO
{
	private List<CampaignVO> campaignDetails = null;

	/**
	 * @return the campaignDetails
	 */
	public List<CampaignVO> getCampaignDetails()
	{
		if(campaignDetails == null)
		{
			campaignDetails = new ArrayList<>();
		}
		
		return campaignDetails;
	}

	/**
	 * @param campaignDetails the campaignDetails to set
	 */
	public void setCampaignDetails(List<CampaignVO> campaignDetails)
	{
		this.campaignDetails = campaignDetails;
	}
	
	public List<String[]> getCampaignDetailsArray()
	{
		List<String[]> campaignDetailsArray = new ArrayList<>();
		
		for(CampaignVO campaignVO : getCampaignDetails())
		{
			String campaign_id = campaignVO.getId();
			String campaign_name = campaignVO.getName();
			
			for(CampaignPlacementDetailsVO campaignPlacementDetailsVO : campaignVO.getPlacements())
			{
				String placement_id = campaignPlacementDetailsVO.getId();
				String placement_name = campaignPlacementDetailsVO.getName();
				
				for(CampaignAdDetailsVO campaignAdDetailsVO : campaignPlacementDetailsVO.getAdDetails())
				{
					String campaign_ad_id = campaignAdDetailsVO.getId();
					String campaign_ad_name = campaignAdDetailsVO.getName();

					List<String> campaignDetailRecord = new ArrayList<>();
					
					campaignDetailRecord.add(campaign_id);
					campaignDetailRecord.add(campaign_name);
					campaignDetailRecord.add(placement_id);
					campaignDetailRecord.add(placement_name);

					campaignDetailRecord.add(campaign_ad_id);
					campaignDetailRecord.add(campaign_ad_name);
					campaignDetailRecord.add(campaignAdDetailsVO.getStart_day());
					campaignDetailRecord.add(campaignAdDetailsVO.getEnd_day());
					campaignDetailRecord.add(campaignAdDetailsVO.getImpressions());
					campaignDetailRecord.add(campaignAdDetailsVO.getViews());
					campaignDetailRecord.add(campaignAdDetailsVO.getPlay_rate());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewed_minutes());
					campaignDetailRecord.add(campaignAdDetailsVO.getPlaytime_per_view());
					campaignDetailRecord.add(campaignAdDetailsVO.getPct_viewed_avg());
					campaignDetailRecord.add(campaignAdDetailsVO.getCompletions25());
					campaignDetailRecord.add(campaignAdDetailsVO.getCompletions50());
					campaignDetailRecord.add(campaignAdDetailsVO.getCompletions75());
					campaignDetailRecord.add(campaignAdDetailsVO.getCompletions100());
					campaignDetailRecord.add(campaignAdDetailsVO.getPct_completions25());
					campaignDetailRecord.add(campaignAdDetailsVO.getPct_completions50());
					campaignDetailRecord.add(campaignAdDetailsVO.getPct_completions75());
					campaignDetailRecord.add(campaignAdDetailsVO.getPct_completions100());
					campaignDetailRecord.add(campaignAdDetailsVO.getShares_facebook());
					campaignDetailRecord.add(campaignAdDetailsVO.getShares_twitter());
					campaignDetailRecord.add(campaignAdDetailsVO.getEngagements());
					campaignDetailRecord.add(campaignAdDetailsVO.getFacebook_fan_page_clicks());
					campaignDetailRecord.add(campaignAdDetailsVO.getVideo_and_overlay_clicks());
					campaignDetailRecord.add(campaignAdDetailsVO.getTotal_click_throughs());
					campaignDetailRecord.add(campaignAdDetailsVO.getCtr());
					campaignDetailRecord.add(campaignAdDetailsVO.getCompanion_impressions());
					campaignDetailRecord.add(campaignAdDetailsVO.getCompanion_click_throughs());
					campaignDetailRecord.add(campaignAdDetailsVO.getCompanion_ctr());
					campaignDetailRecord.add(campaignAdDetailsVO.getConversions_impressions());
					campaignDetailRecord.add(campaignAdDetailsVO.getConversions_click_through_avg_days());
					campaignDetailRecord.add(campaignAdDetailsVO.getConversions_view());
					campaignDetailRecord.add(campaignAdDetailsVO.getConversions_view_avg_days());
					campaignDetailRecord.add(campaignAdDetailsVO.getConversions_click_through());
					campaignDetailRecord.add(campaignAdDetailsVO.getConversions_click_through_avg_days());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewability_instrumented_impressions());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewability_unmeasurable_iframe());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewability_unmeasurable_other());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewable_impressions());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewable_impression_rate());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewable_pct_impressions());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewable_views());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewable_complete25());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewable_complete50());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewable_complete75());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewable_complete100());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewable_pct_complete25());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewable_pct_complete50());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewable_pct_complete75());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewable_pct_complete100());
					campaignDetailRecord.add(campaignAdDetailsVO.getNot_viewable_impressions());
					campaignDetailRecord.add(campaignAdDetailsVO.getNot_viewable_pct_impressions());
					campaignDetailRecord.add(campaignAdDetailsVO.getPlayer_width_avg());
					campaignDetailRecord.add(campaignAdDetailsVO.getPlayer_height_avg());
					campaignDetailRecord.add(campaignAdDetailsVO.getMobile_installs());
					campaignDetailRecord.add(campaignAdDetailsVO.getFacebook_fan_page_clicks());
					campaignDetailRecord.add(campaignAdDetailsVO.getFacebook_post_likes());
					campaignDetailRecord.add(campaignAdDetailsVO.getFacebook_post_comments());
					campaignDetailRecord.add(campaignAdDetailsVO.getFacebook_post_shares());
					campaignDetailRecord.add(campaignAdDetailsVO.getClick_through_view_rate());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewable_measurable_impressions());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewable_measurable_rate());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewable_unmeasurable_impressions());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewable_unmeasurable_rate_total());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewable_unmeasurable_rate_not_supported());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewable_unmeasurable_rate_other());
					campaignDetailRecord.add(campaignAdDetailsVO.getViewable_unmeasurable_rate_iframe());
					campaignDetailRecord.add(campaignAdDetailsVO.getSurvey_starts());
					campaignDetailRecord.add(campaignAdDetailsVO.getSurvey_completions());
					campaignDetailRecord.add(campaignAdDetailsVO.getTotal_fees());
					campaignDetailRecord.add(campaignAdDetailsVO.getBillable_total_fees());
					campaignDetailRecord.add(campaignAdDetailsVO.getNon_billable_total_fees());
					campaignDetailRecord.add(campaignAdDetailsVO.getBillable_media_fees());
					campaignDetailRecord.add(campaignAdDetailsVO.getBillable_data_fees());
					campaignDetailRecord.add(campaignAdDetailsVO.getBillable_other_fees());
					campaignDetailRecord.add(campaignAdDetailsVO.getNon_billable_media_fees());
					campaignDetailRecord.add(campaignAdDetailsVO.getNon_billable_data_fees());
					campaignDetailRecord.add(campaignAdDetailsVO.getNon_billable_other_fees());
					campaignDetailRecord.add(campaignAdDetailsVO.getAdvertiser_media_fees());
					campaignDetailRecord.add(campaignAdDetailsVO.getAdvertiser_data_fees());
					campaignDetailRecord.add(campaignAdDetailsVO.getAdvertiser_other_fees());
					campaignDetailRecord.add(campaignAdDetailsVO.getAdvertiser_total_fees());
					campaignDetailRecord.add(campaignAdDetailsVO.getCpm());
					campaignDetailRecord.add(campaignAdDetailsVO.getCpv());
					campaignDetailRecord.add(campaignAdDetailsVO.getCpcv());
					campaignDetailRecord.add(campaignAdDetailsVO.getCpc());
					campaignDetailRecord.add(campaignAdDetailsVO.getCpi());
					campaignDetailRecord.add(campaignAdDetailsVO.getCpa());
					campaignDetailRecord.add(campaignAdDetailsVO.getVcpm());
					campaignDetailRecord.add(campaignAdDetailsVO.getMedia_spend_total());
					campaignDetailRecord.add(campaignAdDetailsVO.getMedia_spend_cpm());
					campaignDetailRecord.add(campaignAdDetailsVO.getData_spend_total());
					campaignDetailRecord.add(campaignAdDetailsVO.getData_spend_cpm());
					campaignDetailRecord.add(campaignAdDetailsVO.getOther_spend_total());
					campaignDetailRecord.add(campaignAdDetailsVO.getOther_spend_cpm());
					
					campaignDetailsArray.add(campaignDetailRecord.toArray(new String[campaignDetailRecord.size()]));
				}
			}
		}
		
		return campaignDetailsArray;
	}
}