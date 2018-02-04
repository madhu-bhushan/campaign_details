package com.campaign_details.data;

import java.util.ArrayList;
import java.util.List;

public class CampaignPlacementDetailsVO
{
	private String 						id			= null;
	private String 						name		= null;
	private List<CampaignAdDetailsVO> 	adDetails	= null;
	/**
	 * @return the id
	 */
	public String getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id)
	{
		if(id != null)
		{
			this.id = id.trim();
		}
		else
		{
			this.id = id;
		}
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		if(name != null)
		{
			this.name = name.trim();
		}
		else
		{
			this.name = name;
		}
	}
	/**
	 * @return the adDetails
	 */
	public List<CampaignAdDetailsVO> getAdDetails()
	{
		if(adDetails == null)
		{
			adDetails = new ArrayList<>();
		}
		
		return adDetails;
	}
	/**
	 * @param adDetails the adDetails to set
	 */
	public void setAdDetails(List<CampaignAdDetailsVO> adDetails)
	{
		this.adDetails = adDetails;
	}
}