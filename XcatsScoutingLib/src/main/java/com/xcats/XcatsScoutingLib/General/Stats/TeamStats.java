package com.xcats.XcatsScoutingLib.General.Stats;

import com.xcats.XcatsScoutingLib.General.Data.Team;

import java.util.List;

/**
 * Designed to be initialized and then directly passed into a display object. Not for storing data
 */
public interface TeamStats {
	public Team getTeam();
	public List<MatchStats> getMatchStats();
	public int getTotalMatchesPlayed();
}
