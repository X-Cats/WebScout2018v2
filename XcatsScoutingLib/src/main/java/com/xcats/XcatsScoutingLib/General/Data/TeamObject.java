package com.xcats.XcatsScoutingLib.General.Data;

import com.xcats.XcatsScoutingLib.General.Data.raw.MatchData;
import com.xcats.XcatsScoutingLib.General.Data.raw.PitData;
import com.xcats.XcatsScoutingLib.General.Data.raw.Team;
import com.xcats.XcatsScoutingLib.General.Stats.TeamStats;

import java.util.List;

public interface TeamObject extends Team {
	PitData getPitData();
	List<? extends MatchData> getMatchData();
	TeamStats getStats();
}
