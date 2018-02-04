package com.campaign_details.util;

public class CampaignDetailsConstants
{
	// rest service helpers
	public static final String API_TYPE_GET		=	"GET";
	public static final String API_TYPE_POST	=	"POST";
	public static final String REQUEST_PROPERTY_CONTENT_TYPE = "Content-Type";
	public static final String REQUEST_PROPERTY_ACCEPT	= "Accept";
	public static final String REQUEST_PROPERTY_CACHE_CONTROL = "Cache-Control";
	public static final String REQUEST_PROPERTY_AUTHORIZATION = "Authorization";
	public static final String REQUEST_PROPERTY_GRANT_TYPE = "grant_type=";
	public static final String REQUEST_PROPERTY_GRANT_TYPE_VALUE = "client_credentials";
	public static final String REQUEST_PROPERTY_CONTENT_LENGTH = "Content-Length";
	
	public static final String REQUEST_PROPERTY_AUTHORIZATION_BASIC = "Basic ";
	public static final String BASIC_AUTH_VALUE = "NDczMzQ3OnJzeElyVGJtajNuTnVnNGV3ME9ZRnIzNjRBbnAxeUthS0Nxc0Q1R3BGZjQ9";
	public static final String REQUEST_PROPERTY_AUTHORIZATION_BEARER = "bearer ";
	public static final String REQUEST_PROPERTY_ACCEPT_JSON	= "application/json";
	
	
	//urls for data
	public static final String TOKEN_URL				=	"https://api.tubemogul.com/oauth/token";
	public static final String CAMPAIGN_DETAILS_URL		=	"https://api.tubemogul.com/v1/reporting/campaigns?timezone=Australia/Sydney&bucketed_by=day&offset=0&limit=1000";
	public static final String CAMPAIGN_PLACEMENT_DETAILS_URL = "https://api.tubemogul.com/v1/reporting/campaigns/${campaign_id}/placements?timezone=Australia/Sydney&bucketed_by=day&offset=0&limit=1000";
	public static final String CAMPAIGN_AD_DETAILS_URL	= "https://api.tubemogul.com/v1/reporting/placements/${placement_id}/ads?timezone=Australia/Sydney&bucketed_by=day&offset=0&limit=1000";
	
}
