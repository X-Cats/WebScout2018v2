package com.xcats.XcatsScoutingLib.General.Stats;

import com.xcats.XcatsScoutingLib.General.Data.Team;

import java.util.List;

public interface Match {
	public int getMatchNum();
	public List<Team> getTeamsPlaying();
	public List<MatchStats> getCalcMatchStats();
}
