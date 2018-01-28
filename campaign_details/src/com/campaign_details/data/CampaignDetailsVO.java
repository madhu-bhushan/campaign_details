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
					
					campaignDetailsArray.add(campaignDetailRecord.toArray(new String[campaignDetailRecord.size()]));
				}
			}
		}
		
		return campaignDetailsArray;
	}
}