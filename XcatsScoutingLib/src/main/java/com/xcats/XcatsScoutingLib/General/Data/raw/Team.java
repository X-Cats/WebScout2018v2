package com.xcats.XcatsScoutingLib.General.Data.raw;

import com.xcats.XcatsScoutingLib.General.Stats.TeamStats;

import java.util.Set;

public interface Team<P extends PitData, M extends MatchData, S extends TeamStats> {
	public int getTeamNum();
	public String getTeamName();
	public P getPitData();
	public Set<? extends M> getMatchData();
	public S getStats();
}
