package com.campaign_details.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CampaignDetailsUtil
{
	public static String getCurrentDate()
	{
		Date currentDate = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return simpleDateFormat.format(currentDate);
	}
}
