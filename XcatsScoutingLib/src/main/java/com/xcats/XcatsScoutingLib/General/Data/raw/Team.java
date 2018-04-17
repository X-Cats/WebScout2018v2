package com.xcats.XcatsScoutingLib.General.Data.raw;

import com.xcats.XcatsScoutingLib.General.Stats.TeamStats;

import java.util.List;
import java.util.Set;

public interface Team<P extends PitData, M extends MatchData, S extends TeamStats> {
	public int getTeamNum();
	public String getTeamName();
	public P getPitData();
	public void setPitData(P pitData);
	public List<? extends M> getMatchData();
	public void addMatchData(M matchData);
	public S getStats();
}
