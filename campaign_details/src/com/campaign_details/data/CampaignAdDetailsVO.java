package com.campaign_details.data;

public class CampaignAdDetailsVO
{
	private String id				=	null;
	private String name				=	null;
	private String start_day			=	null;
	private String end_day			=	null;
	private String impressions		=	null;
	private String views			=	null;
	private String play_rate					=	null;
	private String viewed_minutes				=	null;
	private String playtime_per_view			=	null;
	private String pct_viewed_avg				=	null;
	private String completions25				=	null;
	private String completions50				=	null;
	private String completions75				=	null;
	private String completions100				=	null;
	private String pct_completions25			=	null;
	private String pct_completions50			=	null;
	private String pct_completions75			=	null;
	private String pct_completions100			=	null;
	private String shares_facebook				=	null;
	private String shares_twitter				=	null;
	private String engagements					=	null;
	private String facebook_fan_page_clicks		=	null;
	private String video_and_overlay_clicks		=	null;
	private String total_click_throughs			=	null;
	private String ctr							=	null;
	private String companion_impressions		=	null;
	private String companion_click_throughs		=	null;
	private String companion_ctr				=	null;
	private String conversions_impressions		=	null;
	private String conversions_impressions_avg_days			=	null;
	private String conversions_view							=	null;
	private String conversions_view_avg_days				=	null;
	private String conversions_click_through				=	null;
	private String conversions_click_through_avg_days		=	null;
	private String viewability_instrumented_impressions		=	null;
	private String viewability_unmeasurable_iframe			=	null;
	private String viewability_unmeasurable_other			=	null;
	private String viewable_impressions				=	null;
	private String viewable_impression_rate			=	null;
	private String viewable_pct_impressions			=	null;
	private String viewable_views					=	null;
	private String viewable_complete25				=	null;
	private String viewable_complete50				=	null;
	private String viewable_complete75				=	null;
	private String viewable_complete100				=	null;
	private String viewable_pct_complete25			=	null;
	private String viewable_pct_complete50			=	null;
	private String viewable_pct_complete75			=	null;
	private String viewable_pct_complete100			=	null;
	private String not_viewable_impressions			=	null;
	private String not_viewable_pct_impressions		=	null;
	private String player_width_avg					=	null;
	private String player_height_avg				=	null;
	private String mobile_installs					=	null;
	private String facebook_page_likes				=	null;
	private String facebook_post_comments			=	null;
	private String facebook_post_likes				=	null;
	private String facebook_post_shares				=	null;
	private String click_through_view_rate			=	null;
	private String viewable_measurable_impressions					=	null;
	private String viewable_measurable_rate							=	null;
	private String viewable_unmeasurable_impressions				=	null;
	private String viewable_unmeasurable_rate_total					=	null;
	private String viewable_unmeasurable_rate_not_supported			=	null;
	private String viewable_unmeasurable_rate_other					=	null;
	private String viewable_unmeasurable_rate_iframe				=	null;
	private String survey_starts				=	null;
	private String survey_completions			=	null;
	private String total_fees					=	null;
	private String billable_total_fees			=	null;
	private String non_billable_total_fees		=	null;
	private String billable_media_fees			=	null;
	private String billable_data_fees			=	null;
	private String billable_other_fees			=	null;
	private String non_billable_media_fees		=	null;
	private String non_billable_data_fees		=	null;
	private String non_billable_other_fees		=	null;
	private String advertiser_media_fees		=	null;
	private String advertiser_data_fees			=	null;
	private String advertiser_other_fees		=	null;
	private String advertiser_total_fees		=	null;
	private String cpm							=	null;
	private String cpv							=	null;
	private String cpcv							=	null;
	private String cpc							=	null;
	private String cpi							=	null;
	private String cpa							=	null;
	private String vcpm							=	null;
	private String media_spend_total			=	null;
	private String media_spend_cpm				=	null;
	private String data_spend_total			=	null;
	private String data_spend_cpm			=	null;
	private String other_spend_total		=	null;
	private String other_spend_cpm			=	null;
	
	
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
	 * @return the start_day
	 */
	public String getStart_day()
	{
		return start_day;
	}
	/**
	 * @param start_day the start_day to set
	 */
	public void setStart_day(String start_day)
	{
		this.start_day = start_day;
	}
	/**
	 * @return the end_day
	 */
	public String getEnd_day()
	{
		return end_day;
	}
	/**
	 * @param end_day the end_day to set
	 */
	public void setEnd_day(String end_day)
	{
		this.end_day = end_day;
	}
	/**
	 * @return the impressions
	 */
	public String getImpressions()
	{
		return impressions;
	}
	/**
	 * @param impressions the impressions to set
	 */
	public void setImpressions(String impressions)
	{
		this.impressions = impressions;
	}
	/**
	 * @return the views
	 */
	public String getViews()
	{
		return views;
	}
	/**
	 * @param views the views to set
	 */
	public void setViews(String views)
	{
		this.views = views;
	}
	/**
	 * @return the play_rate
	 */
	public String getPlay_rate()
	{
		return play_rate;
	}
	/**
	 * @param play_rate the play_rate to set
	 */
	public void setPlay_rate(String play_rate)
	{
		this.play_rate = play_rate;
	}
	/**
	 * @return the viewed_minutes
	 */
	public String getViewed_minutes()
	{
		return viewed_minutes;
	}
	/**
	 * @param viewed_minutes the viewed_minutes to set
	 */
	public void setViewed_minutes(String viewed_minutes)
	{
		this.viewed_minutes = viewed_minutes;
	}
	/**
	 * @return the playtime_per_view
	 */
	public String getPlaytime_per_view()
	{
		return playtime_per_view;
	}
	/**
	 * @param playtime_per_view the playtime_per_view to set
	 */
	public void setPlaytime_per_view(String playtime_per_view)
	{
		this.playtime_per_view = playtime_per_view;
	}
	/**
	 * @return the pct_viewed_avg
	 */
	public String getPct_viewed_avg()
	{
		return pct_viewed_avg;
	}
	/**
	 * @param pct_viewed_avg the pct_viewed_avg to set
	 */
	public void setPct_viewed_avg(String pct_viewed_avg)
	{
		this.pct_viewed_avg = pct_viewed_avg;
	}
	/**
	 * @return the completions25
	 */
	public String getCompletions25()
	{
		return completions25;
	}
	/**
	 * @param completions25 the completions25 to set
	 */
	public void setCompletions25(String completions25)
	{
		this.completions25 = completions25;
	}
	/**
	 * @return the completions50
	 */
	public String getCompletions50()
	{
		return completions50;
	}
	/**
	 * @param completions50 the completions50 to set
	 */
	public void setCompletions50(String completions50)
	{
		this.completions50 = completions50;
	}
	/**
	 * @return the completions75
	 */
	public String getCompletions75()
	{
		return completions75;
	}
	/**
	 * @param completions75 the completions75 to set
	 */
	public void setCompletions75(String completions75)
	{
		this.completions75 = completions75;
	}
	/**
	 * @return the completions100
	 */
	public String getCompletions100()
	{
		return completions100;
	}
	/**
	 * @param completions100 the completions100 to set
	 */
	public void setCompletions100(String completions100)
	{
		this.completions100 = completions100;
	}
	/**
	 * @return the pct_completions25
	 */
	public String getPct_completions25()
	{
		return pct_completions25;
	}
	/**
	 * @param pct_completions25 the pct_completions25 to set
	 */
	public void setPct_completions25(String pct_completions25)
	{
		this.pct_completions25 = pct_completions25;
	}
	/**
	 * @return the pct_completions50
	 */
	public String getPct_completions50()
	{
		return pct_completions50;
	}
	/**
	 * @param pct_completions50 the pct_completions50 to set
	 */
	public void setPct_completions50(String pct_completions50)
	{
		this.pct_completions50 = pct_completions50;
	}
	/**
	 * @return the pct_completions75
	 */
	public String getPct_completions75()
	{
		return pct_completions75;
	}
	/**
	 * @param pct_completions75 the pct_completions75 to set
	 */
	public void setPct_completions75(String pct_completions75)
	{
		this.pct_completions75 = pct_completions75;
	}
	/**
	 * @return the pct_completions100
	 */
	public String getPct_completions100()
	{
		return pct_completions100;
	}
	/**
	 * @param pct_completions100 the pct_completions100 to set
	 */
	public void setPct_completions100(String pct_completions100)
	{
		this.pct_completions100 = pct_completions100;
	}
	/**
	 * @return the shares_facebook
	 */
	public String getShares_facebook()
	{
		return shares_facebook;
	}
	/**
	 * @param shares_facebook the shares_facebook to set
	 */
	public void setShares_facebook(String shares_facebook)
	{
		this.shares_facebook = shares_facebook;
	}
	/**
	 * @return the shares_twitter
	 */
	public String getShares_twitter()
	{
		return shares_twitter;
	}
	/**
	 * @param shares_twitter the shares_twitter to set
	 */
	public void setShares_twitter(String shares_twitter)
	{
		this.shares_twitter = shares_twitter;
	}
	/**
	 * @return the engagements
	 */
	public String getEngagements()
	{
		return engagements;
	}
	/**
	 * @param engagements the engagements to set
	 */
	public void setEngagements(String engagements)
	{
		this.engagements = engagements;
	}
	/**
	 * @return the facebook_fan_page_clicks
	 */
	public String getFacebook_fan_page_clicks()
	{
		return facebook_fan_page_clicks;
	}
	/**
	 * @param facebook_fan_page_clicks the facebook_fan_page_clicks to set
	 */
	public void setFacebook_fan_page_clicks(String facebook_fan_page_clicks)
	{
		this.facebook_fan_page_clicks = facebook_fan_page_clicks;
	}
	/**
	 * @return the video_and_overlay_clicks
	 */
	public String getVideo_and_overlay_clicks()
	{
		return video_and_overlay_clicks;
	}
	/**
	 * @param video_and_overlay_clicks the video_and_overlay_clicks to set
	 */
	public void setVideo_and_overlay_clicks(String video_and_overlay_clicks)
	{
		this.video_and_overlay_clicks = video_and_overlay_clicks;
	}
	/**
	 * @return the total_click_throughs
	 */
	public String getTotal_click_throughs()
	{
		return total_click_throughs;
	}
	/**
	 * @param total_click_throughs the total_click_throughs to set
	 */
	public void setTotal_click_throughs(String total_click_throughs)
	{
		this.total_click_throughs = total_click_throughs;
	}
	/**
	 * @return the ctr
	 */
	public String getCtr()
	{
		return ctr;
	}
	/**
	 * @param ctr the ctr to set
	 */
	public void setCtr(String ctr)
	{
		this.ctr = ctr;
	}
	/**
	 * @return the companion_impressions
	 */
	public String getCompanion_impressions()
	{
		return companion_impressions;
	}
	/**
	 * @param companion_impressions the companion_impressions to set
	 */
	public void setCompanion_impressions(String companion_impressions)
	{
		this.companion_impressions = companion_impressions;
	}
	/**
	 * @return the companion_click_throughs
	 */
	public String getCompanion_click_throughs()
	{
		return companion_click_throughs;
	}
	/**
	 * @param companion_click_throughs the companion_click_throughs to set
	 */
	public void setCompanion_click_throughs(String companion_click_throughs)
	{
		this.companion_click_throughs = companion_click_throughs;
	}
	/**
	 * @return the companion_ctr
	 */
	public String getCompanion_ctr()
	{
		return companion_ctr;
	}
	/**
	 * @param companion_ctr the companion_ctr to set
	 */
	public void setCompanion_ctr(String companion_ctr)
	{
		this.companion_ctr = companion_ctr;
	}
	/**
	 * @return the conversions_impressions
	 */
	public String getConversions_impressions()
	{
		return conversions_impressions;
	}
	/**
	 * @param conversions_impressions the conversions_impressions to set
	 */
	public void setConversions_impressions(String conversions_impressions)
	{
		this.conversions_impressions = conversions_impressions;
	}
	/**
	 * @return the conversions_impressions_avg_days
	 */
	public String getConversions_impressions_avg_days()
	{
		return conversions_impressions_avg_days;
	}
	/**
	 * @param conversions_impressions_avg_days the conversions_impressions_avg_days to set
	 */
	public void setConversions_impressions_avg_days(
			String conversions_impressions_avg_days)
	{
		this.conversions_impressions_avg_days = conversions_impressions_avg_days;
	}
	/**
	 * @return the conversions_view
	 */
	public String getConversions_view()
	{
		return conversions_view;
	}
	/**
	 * @param conversions_view the conversions_view to set
	 */
	public void setConversions_view(String conversions_view)
	{
		this.conversions_view = conversions_view;
	}
	/**
	 * @return the conversions_view_avg_days
	 */
	public String getConversions_view_avg_days()
	{
		return conversions_view_avg_days;
	}
	/**
	 * @param conversions_view_avg_days the conversions_view_avg_days to set
	 */
	public void setConversions_view_avg_days(String conversions_view_avg_days)
	{
		this.conversions_view_avg_days = conversions_view_avg_days;
	}
	/**
	 * @return the conversions_click_through
	 */
	public String getConversions_click_through()
	{
		return conversions_click_through;
	}
	/**
	 * @param conversions_click_through the conversions_click_through to set
	 */
	public void setConversions_click_through(String conversions_click_through)
	{
		this.conversions_click_through = conversions_click_through;
	}
	/**
	 * @return the conversions_click_through_avg_days
	 */
	public String getConversions_click_through_avg_days()
	{
		return conversions_click_through_avg_days;
	}
	/**
	 * @param conversions_click_through_avg_days the conversions_click_through_avg_days to set
	 */
	public void setConversions_click_through_avg_days(
			String conversions_click_through_avg_days)
	{
		this.conversions_click_through_avg_days = conversions_click_through_avg_days;
	}
	/**
	 * @return the viewability_instrumented_impressions
	 */
	public String getViewability_instrumented_impressions()
	{
		return viewability_instrumented_impressions;
	}
	/**
	 * @param viewability_instrumented_impressions the viewability_instrumented_impressions to set
	 */
	public void setViewability_instrumented_impressions(
			String viewability_instrumented_impressions)
	{
		this.viewability_instrumented_impressions = viewability_instrumented_impressions;
	}
	/**
	 * @return the viewability_unmeasurable_iframe
	 */
	public String getViewability_unmeasurable_iframe()
	{
		return viewability_unmeasurable_iframe;
	}
	/**
	 * @param viewability_unmeasurable_iframe the viewability_unmeasurable_iframe to set
	 */
	public void setViewability_unmeasurable_iframe(
			String viewability_unmeasurable_iframe)
	{
		this.viewability_unmeasurable_iframe = viewability_unmeasurable_iframe;
	}
	/**
	 * @return the viewability_unmeasurable_other
	 */
	public String getViewability_unmeasurable_other()
	{
		return viewability_unmeasurable_other;
	}
	/**
	 * @param viewability_unmeasurable_other the viewability_unmeasurable_other to set
	 */
	public void setViewability_unmeasurable_other(
			String viewability_unmeasurable_other)
	{
		this.viewability_unmeasurable_other = viewability_unmeasurable_other;
	}
	/**
	 * @return the viewable_impressions
	 */
	public String getViewable_impressions()
	{
		return viewable_impressions;
	}
	/**
	 * @param viewable_impressions the viewable_impressions to set
	 */
	public void setViewable_impressions(String viewable_impressions)
	{
		this.viewable_impressions = viewable_impressions;
	}
	/**
	 * @return the viewable_impression_rate
	 */
	public String getViewable_impression_rate()
	{
		return viewable_impression_rate;
	}
	/**
	 * @param viewable_impression_rate the viewable_impression_rate to set
	 */
	public void setViewable_impression_rate(String viewable_impression_rate)
	{
		this.viewable_impression_rate = viewable_impression_rate;
	}
	/**
	 * @return the viewable_pct_impressions
	 */
	public String getViewable_pct_impressions()
	{
		return viewable_pct_impressions;
	}
	/**
	 * @param viewable_pct_impressions the viewable_pct_impressions to set
	 */
	public void setViewable_pct_impressions(String viewable_pct_impressions)
	{
		this.viewable_pct_impressions = viewable_pct_impressions;
	}
	/**
	 * @return the viewable_views
	 */
	public String getViewable_views()
	{
		return viewable_views;
	}
	/**
	 * @param viewable_views the viewable_views to set
	 */
	public void setViewable_views(String viewable_views)
	{
		this.viewable_views = viewable_views;
	}
	/**
	 * @return the viewable_complete25
	 */
	public String getViewable_complete25()
	{
		return viewable_complete25;
	}
	/**
	 * @param viewable_complete25 the viewable_complete25 to set
	 */
	public void setViewable_complete25(String viewable_complete25)
	{
		this.viewable_complete25 = viewable_complete25;
	}
	/**
	 * @return the viewable_complete50
	 */
	public String getViewable_complete50()
	{
		return viewable_complete50;
	}
	/**
	 * @param viewable_complete50 the viewable_complete50 to set
	 */
	public void setViewable_complete50(String viewable_complete50)
	{
		this.viewable_complete50 = viewable_complete50;
	}
	/**
	 * @return the viewable_complete75
	 */
	public String getViewable_complete75()
	{
		return viewable_complete75;
	}
	/**
	 * @param viewable_complete75 the viewable_complete75 to set
	 */
	public void setViewable_complete75(String viewable_complete75)
	{
		this.viewable_complete75 = viewable_complete75;
	}
	/**
	 * @return the viewable_complete100
	 */
	public String getViewable_complete100()
	{
		return viewable_complete100;
	}
	/**
	 * @param viewable_complete100 the viewable_complete100 to set
	 */
	public void setViewable_complete100(String viewable_complete100)
	{
		this.viewable_complete100 = viewable_complete100;
	}
	/**
	 * @return the viewable_pct_complete25
	 */
	public String getViewable_pct_complete25()
	{
		return viewable_pct_complete25;
	}
	/**
	 * @param viewable_pct_complete25 the viewable_pct_complete25 to set
	 */
	public void setViewable_pct_complete25(String viewable_pct_complete25)
	{
		this.viewable_pct_complete25 = viewable_pct_complete25;
	}
	/**
	 * @return the viewable_pct_complete50
	 */
	public String getViewable_pct_complete50()
	{
		return viewable_pct_complete50;
	}
	/**
	 * @param viewable_pct_complete50 the viewable_pct_complete50 to set
	 */
	public void setViewable_pct_complete50(String viewable_pct_complete50)
	{
		this.viewable_pct_complete50 = viewable_pct_complete50;
	}
	/**
	 * @return the viewable_pct_complete75
	 */
	public String getViewable_pct_complete75()
	{
		return viewable_pct_complete75;
	}
	/**
	 * @param viewable_pct_complete75 the viewable_pct_complete75 to set
	 */
	public void setViewable_pct_complete75(String viewable_pct_complete75)
	{
		this.viewable_pct_complete75 = viewable_pct_complete75;
	}
	/**
	 * @return the viewable_pct_complete100
	 */
	public String getViewable_pct_complete100()
	{
		return viewable_pct_complete100;
	}
	/**
	 * @param viewable_pct_complete100 the viewable_pct_complete100 to set
	 */
	public void setViewable_pct_complete100(String viewable_pct_complete100)
	{
		this.viewable_pct_complete100 = viewable_pct_complete100;
	}
	/**
	 * @return the not_viewable_impressions
	 */
	public String getNot_viewable_impressions()
	{
		return not_viewable_impressions;
	}
	/**
	 * @param not_viewable_impressions the not_viewable_impressions to set
	 */
	public void setNot_viewable_impressions(String not_viewable_impressions)
	{
		this.not_viewable_impressions = not_viewable_impressions;
	}
	/**
	 * @return the not_viewable_pct_impressions
	 */
	public String getNot_viewable_pct_impressions()
	{
		return not_viewable_pct_impressions;
	}
	/**
	 * @param not_viewable_pct_impressions the not_viewable_pct_impressions to set
	 */
	public void setNot_viewable_pct_impressions(String not_viewable_pct_impressions)
	{
		this.not_viewable_pct_impressions = not_viewable_pct_impressions;
	}
	/**
	 * @return the player_width_avg
	 */
	public String getPlayer_width_avg()
	{
		return player_width_avg;
	}
	/**
	 * @param player_width_avg the player_width_avg to set
	 */
	public void setPlayer_width_avg(String player_width_avg)
	{
		this.player_width_avg = player_width_avg;
	}
	/**
	 * @return the player_height_avg
	 */
	public String getPlayer_height_avg()
	{
		return player_height_avg;
	}
	/**
	 * @param player_height_avg the player_height_avg to set
	 */
	public void setPlayer_height_avg(String player_height_avg)
	{
		this.player_height_avg = player_height_avg;
	}
	/**
	 * @return the mobile_installs
	 */
	public String getMobile_installs()
	{
		return mobile_installs;
	}
	/**
	 * @param mobile_installs the mobile_installs to set
	 */
	public void setMobile_installs(String mobile_installs)
	{
		this.mobile_installs = mobile_installs;
	}
	/**
	 * @return the facebook_page_likes
	 */
	public String getFacebook_page_likes()
	{
		return facebook_page_likes;
	}
	/**
	 * @param facebook_page_likes the facebook_page_likes to set
	 */
	public void setFacebook_page_likes(String facebook_page_likes)
	{
		this.facebook_page_likes = facebook_page_likes;
	}
	/**
	 * @return the facebook_post_comments
	 */
	public String getFacebook_post_comments()
	{
		return facebook_post_comments;
	}
	/**
	 * @param facebook_post_comments the facebook_post_comments to set
	 */
	public void setFacebook_post_comments(String facebook_post_comments)
	{
		this.facebook_post_comments = facebook_post_comments;
	}
	/**
	 * @return the facebook_post_likes
	 */
	public String getFacebook_post_likes()
	{
		return facebook_post_likes;
	}
	/**
	 * @param facebook_post_likes the facebook_post_likes to set
	 */
	public void setFacebook_post_likes(String facebook_post_likes)
	{
		this.facebook_post_likes = facebook_post_likes;
	}
	/**
	 * @return the facebook_post_shares
	 */
	public String getFacebook_post_shares()
	{
		return facebook_post_shares;
	}
	/**
	 * @param facebook_post_shares the facebook_post_shares to set
	 */
	public void setFacebook_post_shares(String facebook_post_shares)
	{
		this.facebook_post_shares = facebook_post_shares;
	}
	/**
	 * @return the click_through_view_rate
	 */
	public String getClick_through_view_rate()
	{
		return click_through_view_rate;
	}
	/**
	 * @param click_through_view_rate the click_through_view_rate to set
	 */
	public void setClick_through_view_rate(String click_through_view_rate)
	{
		this.click_through_view_rate = click_through_view_rate;
	}
	/**
	 * @return the viewable_measurable_impressions
	 */
	public String getViewable_measurable_impressions()
	{
		return viewable_measurable_impressions;
	}
	/**
	 * @param viewable_measurable_impressions the viewable_measurable_impressions to set
	 */
	public void setViewable_measurable_impressions(
			String viewable_measurable_impressions)
	{
		this.viewable_measurable_impressions = viewable_measurable_impressions;
	}
	/**
	 * @return the viewable_measurable_rate
	 */
	public String getViewable_measurable_rate()
	{
		return viewable_measurable_rate;
	}
	/**
	 * @param viewable_measurable_rate the viewable_measurable_rate to set
	 */
	public void setViewable_measurable_rate(String viewable_measurable_rate)
	{
		this.viewable_measurable_rate = viewable_measurable_rate;
	}
	/**
	 * @return the viewable_unmeasurable_impressions
	 */
	public String getViewable_unmeasurable_impressions()
	{
		return viewable_unmeasurable_impressions;
	}
	/**
	 * @param viewable_unmeasurable_impressions the viewable_unmeasurable_impressions to set
	 */
	public void setViewable_unmeasurable_impressions(
			String viewable_unmeasurable_impressions)
	{
		this.viewable_unmeasurable_impressions = viewable_unmeasurable_impressions;
	}
	/**
	 * @return the viewable_unmeasurable_rate_total
	 */
	public String getViewable_unmeasurable_rate_total()
	{
		return viewable_unmeasurable_rate_total;
	}
	/**
	 * @param viewable_unmeasurable_rate_total the viewable_unmeasurable_rate_total to set
	 */
	public void setViewable_unmeasurable_rate_total(
			String viewable_unmeasurable_rate_total)
	{
		this.viewable_unmeasurable_rate_total = viewable_unmeasurable_rate_total;
	}
	/**
	 * @return the viewable_unmeasurable_rate_not_supported
	 */
	public String getViewable_unmeasurable_rate_not_supported()
	{
		return viewable_unmeasurable_rate_not_supported;
	}
	/**
	 * @param viewable_unmeasurable_rate_not_supported the viewable_unmeasurable_rate_not_supported to set
	 */
	public void setViewable_unmeasurable_rate_not_supported(
			String viewable_unmeasurable_rate_not_supported)
	{
		this.viewable_unmeasurable_rate_not_supported = viewable_unmeasurable_rate_not_supported;
	}
	/**
	 * @return the viewable_unmeasurable_rate_other
	 */
	public String getViewable_unmeasurable_rate_other()
	{
		return viewable_unmeasurable_rate_other;
	}
	/**
	 * @param viewable_unmeasurable_rate_other the viewable_unmeasurable_rate_other to set
	 */
	public void setViewable_unmeasurable_rate_other(
			String viewable_unmeasurable_rate_other)
	{
		this.viewable_unmeasurable_rate_other = viewable_unmeasurable_rate_other;
	}
	/**
	 * @return the viewable_unmeasurable_rate_iframe
	 */
	public String getViewable_unmeasurable_rate_iframe()
	{
		return viewable_unmeasurable_rate_iframe;
	}
	/**
	 * @param viewable_unmeasurable_rate_iframe the viewable_unmeasurable_rate_iframe to set
	 */
	public void setViewable_unmeasurable_rate_iframe(
			String viewable_unmeasurable_rate_iframe)
	{
		this.viewable_unmeasurable_rate_iframe = viewable_unmeasurable_rate_iframe;
	}
	/**
	 * @return the survey_starts
	 */
	public String getSurvey_starts()
	{
		return survey_starts;
	}
	/**
	 * @param survey_starts the survey_starts to set
	 */
	public void setSurvey_starts(String survey_starts)
	{
		this.survey_starts = survey_starts;
	}
	/**
	 * @return the survey_completions
	 */
	public String getSurvey_completions()
	{
		return survey_completions;
	}
	/**
	 * @param survey_completions the survey_completions to set
	 */
	public void setSurvey_completions(String survey_completions)
	{
		this.survey_completions = survey_completions;
	}
	/**
	 * @return the total_fees
	 */
	public String getTotal_fees()
	{
		return total_fees;
	}
	/**
	 * @param total_fees the total_fees to set
	 */
	public void setTotal_fees(String total_fees)
	{
		this.total_fees = total_fees;
	}
	/**
	 * @return the billable_total_fees
	 */
	public String getBillable_total_fees()
	{
		return billable_total_fees;
	}
	/**
	 * @param billable_total_fees the billable_total_fees to set
	 */
	public void setBillable_total_fees(String billable_total_fees)
	{
		this.billable_total_fees = billable_total_fees;
	}
	/**
	 * @return the non_billable_total_fees
	 */
	public String getNon_billable_total_fees()
	{
		return non_billable_total_fees;
	}
	/**
	 * @param non_billable_total_fees the non_billable_total_fees to set
	 */
	public void setNon_billable_total_fees(String non_billable_total_fees)
	{
		this.non_billable_total_fees = non_billable_total_fees;
	}
	/**
	 * @return the billable_media_fees
	 */
	public String getBillable_media_fees()
	{
		return billable_media_fees;
	}
	/**
	 * @param billable_media_fees the billable_media_fees to set
	 */
	public void setBillable_media_fees(String billable_media_fees)
	{
		this.billable_media_fees = billable_media_fees;
	}
	/**
	 * @return the billable_data_fees
	 */
	public String getBillable_data_fees()
	{
		return billable_data_fees;
	}
	/**
	 * @param billable_data_fees the billable_data_fees to set
	 */
	public void setBillable_data_fees(String billable_data_fees)
	{
		this.billable_data_fees = billable_data_fees;
	}
	/**
	 * @return the billable_other_fees
	 */
	public String getBillable_other_fees()
	{
		return billable_other_fees;
	}
	/**
	 * @param billable_other_fees the billable_other_fees to set
	 */
	public void setBillable_other_fees(String billable_other_fees)
	{
		this.billable_other_fees = billable_other_fees;
	}
	/**
	 * @return the non_billable_media_fees
	 */
	public String getNon_billable_media_fees()
	{
		return non_billable_media_fees;
	}
	/**
	 * @param non_billable_media_fees the non_billable_media_fees to set
	 */
	public void setNon_billable_media_fees(String non_billable_media_fees)
	{
		this.non_billable_media_fees = non_billable_media_fees;
	}
	/**
	 * @return the non_billable_data_fees
	 */
	public String getNon_billable_data_fees()
	{
		return non_billable_data_fees;
	}
	/**
	 * @param non_billable_data_fees the non_billable_data_fees to set
	 */
	public void setNon_billable_data_fees(String non_billable_data_fees)
	{
		this.non_billable_data_fees = non_billable_data_fees;
	}
	/**
	 * @return the non_billable_other_fees
	 */
	public String getNon_billable_other_fees()
	{
		return non_billable_other_fees;
	}
	/**
	 * @param non_billable_other_fees the non_billable_other_fees to set
	 */
	public void setNon_billable_other_fees(String non_billable_other_fees)
	{
		this.non_billable_other_fees = non_billable_other_fees;
	}
	/**
	 * @return the advertiser_media_fees
	 */
	public String getAdvertiser_media_fees()
	{
		return advertiser_media_fees;
	}
	/**
	 * @param advertiser_media_fees the advertiser_media_fees to set
	 */
	public void setAdvertiser_media_fees(String advertiser_media_fees)
	{
		this.advertiser_media_fees = advertiser_media_fees;
	}
	/**
	 * @return the advertiser_data_fees
	 */
	public String getAdvertiser_data_fees()
	{
		return advertiser_data_fees;
	}
	/**
	 * @param advertiser_data_fees the advertiser_data_fees to set
	 */
	public void setAdvertiser_data_fees(String advertiser_data_fees)
	{
		this.advertiser_data_fees = advertiser_data_fees;
	}
	/**
	 * @return the advertiser_other_fees
	 */
	public String getAdvertiser_other_fees()
	{
		return advertiser_other_fees;
	}
	/**
	 * @param advertiser_other_fees the advertiser_other_fees to set
	 */
	public void setAdvertiser_other_fees(String advertiser_other_fees)
	{
		this.advertiser_other_fees = advertiser_other_fees;
	}
	/**
	 * @return the advertiser_total_fees
	 */
	public String getAdvertiser_total_fees()
	{
		return advertiser_total_fees;
	}
	/**
	 * @param advertiser_total_fees the advertiser_total_fees to set
	 */
	public void setAdvertiser_total_fees(String advertiser_total_fees)
	{
		this.advertiser_total_fees = advertiser_total_fees;
	}
	/**
	 * @return the cpm
	 */
	public String getCpm()
	{
		return cpm;
	}
	/**
	 * @param cpm the cpm to set
	 */
	public void setCpm(String cpm)
	{
		this.cpm = cpm;
	}
	/**
	 * @return the cpv
	 */
	public String getCpv()
	{
		return cpv;
	}
	/**
	 * @param cpv the cpv to set
	 */
	public void setCpv(String cpv)
	{
		this.cpv = cpv;
	}
	/**
	 * @return the cpcv
	 */
	public String getCpcv()
	{
		return cpcv;
	}
	/**
	 * @param cpcv the cpcv to set
	 */
	public void setCpcv(String cpcv)
	{
		this.cpcv = cpcv;
	}
	/**
	 * @return the cpc
	 */
	public String getCpc()
	{
		return cpc;
	}
	/**
	 * @param cpc the cpc to set
	 */
	public void setCpc(String cpc)
	{
		this.cpc = cpc;
	}
	/**
	 * @return the cpi
	 */
	public String getCpi()
	{
		return cpi;
	}
	/**
	 * @param cpi the cpi to set
	 */
	public void setCpi(String cpi)
	{
		this.cpi = cpi;
	}
	/**
	 * @return the cpa
	 */
	public String getCpa()
	{
		return cpa;
	}
	/**
	 * @param cpa the cpa to set
	 */
	public void setCpa(String cpa)
	{
		this.cpa = cpa;
	}
	/**
	 * @return the vcpm
	 */
	public String getVcpm()
	{
		return vcpm;
	}
	/**
	 * @param vcpm the vcpm to set
	 */
	public void setVcpm(String vcpm)
	{
		this.vcpm = vcpm;
	}
	/**
	 * @return the media_spend_total
	 */
	public String getMedia_spend_total()
	{
		return media_spend_total;
	}
	/**
	 * @param media_spend_total the media_spend_total to set
	 */
	public void setMedia_spend_total(String media_spend_total)
	{
		this.media_spend_total = media_spend_total;
	}
	/**
	 * @return the media_spend_cpm
	 */
	public String getMedia_spend_cpm()
	{
		return media_spend_cpm;
	}
	/**
	 * @param media_spend_cpm the media_spend_cpm to set
	 */
	public void setMedia_spend_cpm(String media_spend_cpm)
	{
		this.media_spend_cpm = media_spend_cpm;
	}
	/**
	 * @return the data_spend_total
	 */
	public String getData_spend_total()
	{
		return data_spend_total;
	}
	/**
	 * @param data_spend_total the data_spend_total to set
	 */
	public void setData_spend_total(String data_spend_total)
	{
		this.data_spend_total = data_spend_total;
	}
	/**
	 * @return the data_spend_cpm
	 */
	public String getData_spend_cpm()
	{
		return data_spend_cpm;
	}
	/**
	 * @param data_spend_cpm the data_spend_cpm to set
	 */
	public void setData_spend_cpm(String data_spend_cpm)
	{
		this.data_spend_cpm = data_spend_cpm;
	}
	/**
	 * @return the other_spend_total
	 */
	public String getOther_spend_total()
	{
		return other_spend_total;
	}
	/**
	 * @param other_spend_total the other_spend_total to set
	 */
	public void setOther_spend_total(String other_spend_total)
	{
		this.other_spend_total = other_spend_total;
	}
	/**
	 * @return the other_spend_cpm
	 */
	public String getOther_spend_cpm()
	{
		return other_spend_cpm;
	}
	/**
	 * @param other_spend_cpm the other_spend_cpm to set
	 */
	public void setOther_spend_cpm(String other_spend_cpm)
	{
		this.other_spend_cpm = other_spend_cpm;
	}
}