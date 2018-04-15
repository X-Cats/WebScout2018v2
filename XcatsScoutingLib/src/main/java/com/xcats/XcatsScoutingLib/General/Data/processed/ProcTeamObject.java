package com.xcats.XcatsScoutingLib.General.Data.processed;

import com.xcats.XcatsScoutingLib.General.Data.raw.MatchData;
import com.xcats.XcatsScoutingLib.General.Data.raw.PitData;
import com.xcats.XcatsScoutingLib.General.Data.raw.Team;
import com.xcats.XcatsScoutingLib.General.Stats.TeamStats;

import java.util.List;

public abstract class ProcTeamObject<P extends PitData, M extends MatchData, T extends TeamStats> implements TeamObject<P,M,T> {

	private P pitData;
	private List<M> matchData;
	private T stats;
	private Team team;

	public ProcTeamObject(P pitData, List<M> matchData, T stats, Team team) {
		this.pitData = pitData;
		this.matchData = matchData;
		this.stats = stats;
		this.team = team;
	}

	@Override
	public P getPitData() {
		return pitData;
	}

	@Override
	public List<M> getMatchData() {
		return matchData;
	}

	@Override
	public T getStats() {
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
