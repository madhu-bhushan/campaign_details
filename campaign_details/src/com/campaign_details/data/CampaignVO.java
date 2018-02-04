package com.campaign_details.data;

import java.util.ArrayList;
import java.util.List;

public class CampaignVO
{
	private String id									=	null;
	private String date									=	null;
	private String name									=	null;
	private List<CampaignPlacementDetailsVO> placements	= 	null;
	
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
	 * @return the date
	 */
	public String getDate()
	{
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date)
	{
		this.date = date;
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
	 * @return the placements
	 */
	public List<CampaignPlacementDetailsVO> getPlacements()
	{
		if(placements == null)
		{
			placements = new ArrayList<>();
		}
		
		return placements;
	}
	/**
	 * @param placements the placements to set
	 */
	public void setPlacements(List<CampaignPlacementDetailsVO> placements)
	{
		this.placements = placements;
	}
}
