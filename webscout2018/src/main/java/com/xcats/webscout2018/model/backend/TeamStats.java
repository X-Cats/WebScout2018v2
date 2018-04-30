package com.xcats.webscout2018.model.backend;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.MatchData;
import com.xcats.XcatsScoutingLib.Powerup2018.Enums.PowerupMatchFocus;
import com.xcats.XcatsScoutingLib.Powerup2018.Stats.Match;
import com.xcats.XcatsScoutingLib.Powerup2018.Stats.MatchStats;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TeamStats implements com.xcats.XcatsScoutingLib.Powerup2018.Stats.TeamStats {

	public TeamStats(List<MatchDataEntity> matchData) {
		this.matchData = matchData;

		this.scaleData = matchData.stream().map(MatchData::getCubesScale).collect(Collectors.toList());
		this.switchData = matchData.stream().map(MatchData::getCubesSwitch).collect(Collectors.toList());
		this.oppSwitchData = matchData.stream().map(MatchData::getCubesOppSwitch).collect(Collectors.toList());
		this.exchangeData = matchData.stream().map(MatchData::getCubesExchanged).collect(Collectors.toList());

		this.stats = matchData.stream().map(MatchStats::new).collect(Collectors.toList());
	}

	private List<? extends MatchData> matchData;

	private List<Integer> scaleData;
	private List<Integer> switchData;
	private List<Integer> oppSwitchData;
	private List<Integer> exchangeData;

	private List<MatchStats> stats;


	@Override
	public List<Integer> getScaleData() {
		return this.scaleData;
	}

	@Override
	public List<Integer> getSwitchData() {
		return this.switchData;
	}

	@Override
	public List<Integer> getOppSwitchData() {
		return this.oppSwitchData;
	}

	@Override
	public List<Integer> getExchangeData() {
		return this.exchangeData;
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

	private int getFocus(PowerupMatchFocus focus) {
		int ret = 0;
		for(MatchStats M : getMatchStats()) {
			if(M.getFocus().equals(focus)) ret += 1;
		}
		return ret;
	}

	@Override
	public int getFocusScale() {
		return getFocus(PowerupMatchFocus.SCALE);
	}

	@Override
	public int getFocusSwitch() {
		return getFocus(PowerupMatchFocus.OWN_SWITCH);
	}

	@Override
	public int getFocusOppSwitch() {
		return getFocus(PowerupMatchFocus.OPP_SWITCH);
	}

	@Override
	public int getFocusExchange() {
		return getFocus(PowerupMatchFocus.EXCHANGE);
	}

	@Override
	public double getPercentFocusScale() {
		if(stats.size() == 0) return 0;
		return ((double) getFocusScale() / (double) stats.size()) * 1E2;
	}

	@Override
	public double getPercentFocusSwitch() {
		if(stats.size() == 0) return 0;
		return ((double) getFocusSwitch() / (double) stats.size()) * 1E2;
	}

	@Override
	public double getPercentFocusOppSwitch() {
		if(stats.size() == 0) return 0;
		return ((double) getFocusOppSwitch() / (double) stats.size()) * 1E2;
	}

	@Override
	public double getPercentFocusExchange() {
		if(stats.size() == 0) return 0;
		return ((double) getFocusExchange() / (double) stats.size()) * 1E2;
	}

	@Override
	public PowerupMatchFocus getPrimaryFocus() {
		return null;
	}

	@Override
	public double getFocusedAverageScale() {
		double statCount = 0;
		double cubeCount = 0;
		for(MatchStats M : getMatchStats()) {
			if(M.getFocus().equals(PowerupMatchFocus.SCALE)) {
				statCount += 1;
				cubeCount += M.getData().getCubesScale();
			}
		}
		double out = cubeCount / statCount;
		if(statCount == 0) return 0;
		return out;
	}

	@Override
	public double getFocusedAverageSwitch() {
		double statCount = 0;
		double cubeCount = 0;
		for(MatchStats M : getMatchStats()) {
			if(M.getFocus().equals(PowerupMatchFocus.OWN_SWITCH)) {
				statCount += 1;
				cubeCount += M.getData().getCubesSwitch();
			}
		}
		double out = cubeCount / statCount;
		if(statCount == 0) return 0;
		return out;
	}

	@Override
	public double getFocusedAverageOppSwitch() {
		double statCount = 0;
		double cubeCount = 0;
		for(MatchStats M : getMatchStats()) {
			if(M.getFocus().equals(PowerupMatchFocus.OPP_SWITCH)) {
				statCount += 1;
				cubeCount += M.getData().getCubesOppSwitch();
			}
		}
		double out = cubeCount / statCount;
		if(statCount == 0) return 0;
		return out;
	}

	@Override
	public double getFocusedAverageExchange() {
		double statCount = 0;
		double cubeCount = 0;
		for(MatchStats M : getMatchStats()) {
			if(M.getFocus().equals(PowerupMatchFocus.EXCHANGE)) {
				statCount += 1;
				cubeCount += M.getData().getCubesExchanged();
			}
		}
		double out = cubeCount / statCount;
		if(statCount == 0) return 0;
		return out;
	}

	@Override
	public int getMaxCubesAutoSwitch() {
		int max = 0;
		for(MatchStats M : this.stats) {
			if(M.getAutoCubesSwitch() > max) {
				max = M.getAutoCubesSwitch();
			}
		}
		return max;
	}

	@Override
	public int getMaxCubesAutoScale() {
		int max = 0;
		for(MatchStats M : this.stats) {
			if(M.getAutoCubesScale() > max) {
				max = M.getAutoCubesScale();
			}
		}
		return max;
	}

	@Override
	public int getMaxCubesAutoCombined() {
		int max = 0;
		for(MatchStats M : this.stats) {
			int curr = M.getAutoCubesSwitch() + M.getAutoCubesScale();
			if(curr > max) {
				max = curr;
			}
		}
		return max;
	}

	@Override
	public boolean getScaleAutoCapability() {
		if(this.getMaxCubesAutoScale() > 0) return true;
		return false;
	}

	@Override
	public boolean getSwitchAutoCapability() {
		if(this.getMaxCubesAutoSwitch() > 0) return true;
		return false;
	}

	@Override
	public boolean getMulticubeAutoCapability() {
		if(this.getMaxCubesAutoCombined() > 1) return true;
		return false;
	}

	@Override
	public double getAverageTotalCubes() {
		double sumTotalCubes = 0;
		double ret = 0;
		for(MatchStats M : getMatchStats()) sumTotalCubes += M.getTotalCubes();
		ret = sumTotalCubes / (double) matchData.size();
		if(Double.isNaN(ret)) return 0;
		else return ret;
	}

	@JsonIgnore
	@Override
	public List<MatchStats> getMatchStats() {
		return stats;
	}

	@Override
	public int getTotalMatchesPlayed() {
		return this.matchData.size();
	}


}
