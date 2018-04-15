package com.xcats.XcatsScoutingLib.General.Data.processed;

import com.xcats.XcatsScoutingLib.General.Data.raw.MatchData;
import com.xcats.XcatsScoutingLib.General.Data.raw.PitData;
import com.xcats.XcatsScoutingLib.General.Data.raw.Team;
import com.xcats.XcatsScoutingLib.General.Stats.TeamStats;

import java.util.List;

public interface TeamObject<P extends PitData,M extends MatchData,T extends TeamStats> extends Team {
	P getPitData();
	List<M> getMatchData();
	T getStats();
}
