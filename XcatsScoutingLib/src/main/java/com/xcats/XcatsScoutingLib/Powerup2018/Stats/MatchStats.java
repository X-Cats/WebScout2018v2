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
		return null;
	}

	public MatchData getMatchData() {
		return this.matchData;
	}
	public PowerupMatchFocus getFocus(){
		int cubesScale = matchData.getCubesScale();
		int cubesSwitch = matchData.getCubesSwitch();
		int cubesOppSwitch = matchData.getCubesOppSwitch();
		int cubesExchanged = matchData.getCubesExchanged();

		int max = Math.max(Math.max(cubesScale,cubesSwitch),Math.max(cubesOppSwitch,cubesExchanged));

		if(cubesScale == max) return PowerupMatchFocus.SCALE;
		if(cubesSwitch == max) return PowerupMatchFocus.OWN_SWITCH;
		if(cubesOppSwitch == max) return PowerupMatchFocus.OPP_SWITCH;
		if(cubesExchanged == max) return PowerupMatchFocus.EXCHANGE;

		return null;
	}
}
