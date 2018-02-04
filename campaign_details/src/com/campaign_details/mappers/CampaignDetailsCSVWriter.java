package com.campaign_details.mappers;

import java.io.FileWriter;

import com.campaign_details.data.CampaignDetailsVO;
import com.opencsv.CSVWriter;

public class CampaignDetailsCSVWriter
{
	public static void writeDetailsToCSVFiles(CampaignDetailsVO campaignDetailsVO)
	{
		try
		{
			CSVWriter csvWriter = new CSVWriter(new FileWriter(System.getProperty("user.dir")+"\\campaignDetails.csv"));
			
			//Headers
			csvWriter.writeNext(new String[]{"campaign_id","campaign_name", "placement_id", "placement_name", "ad_id", "ad_name","start_day","end_day","impressions","views","play_rate","viewed_minutes","playtime_per_view","pct_viewed_avg","completions25","completions50","completions75","completions100","pct_completions25","pct_completions50","pct_completions75","pct_completions100","shares_facebook","shares_twitter","engagements","facebook_fan_page_clicks","video_and_overlay_clicks","total_click_throughs","ctr","companion_impressions","companion_click_throughs","companion_ctr","conversions_impressions","conversions_impressions_avg_days","conversions_view","conversions_view_avg_days","conversions_click_through","conversions_click_through_avg_days","viewability_instrumented_impressions","viewability_unmeasurable_iframe","viewability_unmeasurable_other","viewable_impressions","viewable_impression_rate","viewable_pct_impressions","viewable_views","viewable_complete25","viewable_complete50","viewable_complete75","viewable_complete100","viewable_pct_complete25","viewable_pct_complete50","viewable_pct_complete75","viewable_pct_complete100","not_viewable_impressions","not_viewable_pct_impressions","player_width_avg","player_height_avg","mobile_installs","facebook_page_likes","facebook_post_comments","facebook_post_likes","facebook_post_shares","click_through_view_rate","viewable_measurable_impressions","viewable_measurable_rate","viewable_unmeasurable_impressions","viewable_unmeasurable_rate_total","viewable_unmeasurable_rate_not_supported","viewable_unmeasurable_rate_other","viewable_unmeasurable_rate_iframe","survey_starts","survey_completions","total_fees","billable_total_fees","non_billable_total_fees","billable_media_fees","billable_data_fees","billable_other_fees","non_billable_media_fees","non_billable_data_fees","non_billable_other_fees","advertiser_media_fees","advertiser_data_fees","advertiser_other_fees","advertiser_total_fees","cpm","cpv","cpcv","cpc","cpi","cpa","vcpm","media_spend_total","media_spend_cpm","data_spend_total","data_spend_cpm","other_spend_total","other_spend_cpm"});
			
			// Records
			for(String[] record: campaignDetailsVO.getCampaignDetailsArray())
			{
				csvWriter.writeNext(record);
			}
			
			csvWriter.close();
		}
		catch (Exception exception)
		{
			System.err.println("Exception occured while writing to CSV file : "+exception.getMessage());
		}
	}
}

