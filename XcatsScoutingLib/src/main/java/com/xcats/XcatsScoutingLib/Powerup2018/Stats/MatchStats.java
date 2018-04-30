package com.xcats.XcatsScoutingLib.Powerup2018.Stats;

import com.xcats.XcatsScoutingLib.General.Data.raw.Team;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.MatchData;
import com.xcats.XcatsScoutingLib.Powerup2018.Enums.*;

public class MatchStats implements com.xcats.XcatsScoutingLib.General.Stats.MatchStats<MatchData> {

	private MatchData matchData;

	public MatchStats(MatchData matchData) {
		this.matchData = matchData;
	}


	@Override
	public Team getTeam() {
		return null;
	}

	@Override
	public int getMatchNum() {
		return 0;
	}

	@Override
	public MatchData getData() {
		return this.matchData;
	}

	@Override
	public int getTotalCubes() {
		int out = 0;
		out = this.matchData.getCubesExchanged() +
				this.matchData.getCubesOppSwitch() +
				this.matchData.getCubesSwitch() +
				this.matchData.getCubesScale();
		return out;
	}

	public boolean getBaselineCross() {
		return matchData.getBaselineCross();
	}

	public int getAutoCubesSwitch() {
		return this.matchData.getAutoCubesSwitch();
	}

	public int getAutoCubesScale() {
		return this.matchData.getAutoCubesScale();
	}

	public PowerupMatchFocus getFocus(){
		int cubesScale = matchData.getCubesScale();
		int cubesSwitch = matchData.getCubesSwitch();
		int cubesOppSwitch = matchData.getCubesOppSwitch();
		int cubesExchanged = matchData.getCubesExchanged();

		int max = Math.max(Math.max(cubesScale,cubesSwitch),Math.max(cubesOppSwitch,cubesExchanged));

		if(max == 0) return PowerupMatchFocus.NONE;
		else if(cubesScale == max) return PowerupMatchFocus.SCALE;
		else if(cubesSwitch == max) return PowerupMatchFocus.OWN_SWITCH;
		else if(cubesOppSwitch == max) return PowerupMatchFocus.OPP_SWITCH;
		else if(cubesExchanged == max) return PowerupMatchFocus.EXCHANGE;
		else return PowerupMatchFocus.NONE;
	}
}
