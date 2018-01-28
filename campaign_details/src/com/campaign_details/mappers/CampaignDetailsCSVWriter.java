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
			csvWriter.writeNext(new String[]{"campaign_id","campaign_name", "placement_id", "placement_name", "ad_id", "ad_name"});
			
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

