package com.campaign_details.main;

import com.campaign_details.data.CampaignAdDetailsVO;
import com.campaign_details.data.CampaignDetailsTokenVO;
import com.campaign_details.data.CampaignDetailsVO;
import com.campaign_details.data.CampaignPlacementDetailsVO;
import com.campaign_details.data.CampaignVO;
import com.campaign_details.mappers.CampaignDetailsCSVWriter;
import com.campaign_details.util.CampaignDetailsRestClientUtil;

public class CampaignDetailsGetter
{
	public static void main(String[] args)
	{
		CampaignDetailsTokenVO campaignDetailsTokenVO = CampaignDetailsRestClientUtil.getCampaignDetailsTokenVO();
		
		CampaignDetailsVO campaignDetailsVO = CampaignDetailsRestClientUtil.getAllCampaignDetails(null, null, campaignDetailsTokenVO);
		
		for(CampaignVO campaignVO : campaignDetailsVO.getCampaignDetails())
		{
			System.err.println("campaign id:"+ campaignVO.getId());
			System.err.println("campaign name:"+ campaignVO.getName());
			
			for(CampaignPlacementDetailsVO campaignPlacementDetailsVO : campaignVO.getPlacements())
			{
				System.err.println("placement id:"+ campaignPlacementDetailsVO.getId());
				System.err.println("placement name:"+ campaignPlacementDetailsVO.getName());
				
				for(CampaignAdDetailsVO campaignAdDetailsVO : campaignPlacementDetailsVO.getAdDetails())
				{
					System.err.println("campaign ad id:"+ campaignAdDetailsVO.getId());
					System.err.println("campaign ad name:"+ campaignAdDetailsVO.getName());
				}
			}
		}
		
		CampaignDetailsCSVWriter.writeDetailsToCSVFiles(campaignDetailsVO);
	}
}