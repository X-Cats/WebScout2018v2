package com.xcats.webscout2018.model.backend;

import com.xcats.XcatsScoutingLib.General.Stats.MatchStats;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.MatchData;
import com.xcats.XcatsScoutingLib.Powerup2018.Enums.PowerupMatchFocus;

import java.util.List;

public class TeamStats implements com.xcats.XcatsScoutingLib.Powerup2018.Stats.TeamStats {

	public TeamStats(List<MatchDataEntity> matchData) {
		this.matchData = matchData;
		scaleData =
	}

	private List<? extends MatchData> matchData;

	private int[] scaleData;
	private int[] switchData;
	private int[] oppSwitchData;
	private int[] exchangeData;



	@Override
	public int[] getScaleData() {
		return new int[0];
	}

	@Override
	public int[] getSwitchData() {
		return new int[0];
	}

	@Override
	public int[] getOppSwitchData() {
		return new int[0];
	}

	@Override
	public int[] getExchangeData() {
		return new int[0];
	}

	@Override
	public boolean[] getClimbData() {
		return new boolean[0];
	}

	@Override
	public boolean canDoSwitch() {
		return false;
	}

	@Override
	public boolean canDoScale() {
		return false;
	}

	@Override
	public boolean canDoExchange() {
		return false;
	}

	@Override
	public boolean canClimb() {
		return false;
	}

	@Override
	public int getFocusScale() {
		return 0;
	}

	@Override
	public int getFocusSwitch() {
		return 0;
	}

	@Override
	public int getFocusOppSwitch() {
		return 0;
	}

	@Override
	public int getFocusExchange() {
		return 0;
	}

	@Override
	public double getPercentFocusScale() {
		return 0;
	}

	@Override
	public double getPercentFocusSwitch() {
		return 0;
	}

	@Override
	public double getPercentFocusOppSwitch() {
		return 0;
	}

	@Override
	public double getPercentFocusExchange() {
		return 0;
	}

	@Override
	public PowerupMatchFocus getPrimaryFocus() {
		return null;
	}

	@Override
	public double getFocusedAverageScale() {
		return 0;
	}

	@Override
	public double getFocusedAverageSwitch() {
		return 0;
	}

	@Override
	public double getFocusedAverageOppSwitch() {
		return 0;
	}

	@Override
	public double getFocusedAverageExchange() {
		return 0;
	}

	@Override
	public List<MatchStats> getMatchStats() {
		return null;
	}

	@Override
	public int getTotalMatchesPlayed() {
		return 0;
	}
}
