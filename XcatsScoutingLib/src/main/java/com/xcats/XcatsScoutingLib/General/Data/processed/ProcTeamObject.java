package com.xcats.XcatsScoutingLib.General.Data.processed;

import com.xcats.XcatsScoutingLib.General.Data.TeamObject;
import com.xcats.XcatsScoutingLib.General.Data.raw.Team;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.MatchData;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.PitData;
import com.xcats.XcatsScoutingLib.Powerup2018.Stats.TeamStats;

import java.util.List;

public class ProcTeamObject implements TeamObject {

	private PitData pitData;
	private List<MatchData> matchData;
	private TeamStats stats;
	private Team team;

	public ProcTeamObject(PitData pitData, List<MatchData> matchData, TeamStats stats, Team team) {
		this.pitData = pitData;
		this.matchData = matchData;
		this.stats = stats;
		this.team = team;
	}

	@Override
	public PitData getPitData() {
		return pitData;
	}

	@Override
	public List<MatchData> getMatchData() {
		return matchData;
	}

	@Override
	public TeamStats getStats() {
		return stats;
	}

	@Override
	public int getTeamNum() {
		return team.getTeamNum();
	}

	@Override
	public String getTeamName() {
		return team.getTeamName();
	}
}
