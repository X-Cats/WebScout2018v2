package com.xcats.XcatsScoutingLib.Powerup2018.Data.processed;

import com.xcats.XcatsScoutingLib.General.Data.raw.Team;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.MatchData;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.PitData;
import com.xcats.XcatsScoutingLib.Powerup2018.Stats.TeamStats;

import java.util.List;

public class ProcTeamObject extends com.xcats.XcatsScoutingLib.General.Data.processed.ProcTeamObject<PitData, MatchData, TeamStats> {
	public ProcTeamObject(PitData pitData, List<MatchData> matchData, TeamStats stats, Team team) {
		super(pitData, matchData, stats, team);
	}
}
