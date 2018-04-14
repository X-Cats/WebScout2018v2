package com.xcats.webscout2018.controller.backend;

import com.xcats.XcatsScoutingLib.General.Data.TeamObject;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.MatchData;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.PitData;
import com.xcats.XcatsScoutingLib.Powerup2018.Stats.TeamStats;
import com.xcats.webscout2018.model.backend.TeamEntity;

import java.util.List;

public class ProcTeamObject implements TeamObject {

	private PitData pitData;
	private List<MatchData> matchData;
	private TeamStats stats;
	private TeamEntity team;

	public ProcTeamObject(PitData pitData, List<MatchData> matchData, TeamStats stats, TeamEntity team) {
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
