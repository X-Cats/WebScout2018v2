package com.xcats.XcatsScoutingLib.General.Stats;

import com.xcats.XcatsScoutingLib.General.Data.raw.Team;

import java.util.List;

/**
 * Designed to be initialized and then directly passed into a display object. Not for storing data
 */
public interface TeamStats<M extends MatchStats> {
	public List<M> getMatchStats();
	public int getTotalMatchesPlayed();
}
