package com.xcats.XcatsScoutingLib.General.Stats;

import com.xcats.XcatsScoutingLib.General.Data.raw.MatchData;
import com.xcats.XcatsScoutingLib.General.Data.raw.Team;

public interface MatchStats<M extends MatchData> {
	public Team getTeam();
	public int getMatchNum();
	public M getData();
}
