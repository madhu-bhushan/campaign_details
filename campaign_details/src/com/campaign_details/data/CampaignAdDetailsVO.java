package com.campaign_details.data;

public class CampaignAdDetailsVO
{
	private String id	=	null;
	private String name	=	null;
	
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
}