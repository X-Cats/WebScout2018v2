package com.xcats.XcatsScoutingLib.General.Stats;

import com.xcats.XcatsScoutingLib.General.Data.MatchData;
import com.xcats.XcatsScoutingLib.General.Data.Team;

public interface MatchStats {
	public Team getTeam();
	public int getMatchNum();
	public MatchData getData();
}
