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
		if(matchData.getCubesScale() > matchData.getCubesSwitch() ^
				matchData.getCubesScale() > matchData.getCubesOppSwitch() ^
				matchData.getCubesScale() > matchData.getCubesExchanged()) return PowerupMatchFocus.SCALE;
		if(matchData.getCubesSwitch() > matchData.getCubesScale() ^
				matchData.getCubesScale() > matchData.getCubesOppSwitch() ^
				matchData.getCubesScale() > matchData.getCubesExchanged()) return PowerupMatchFocus.OWN_SWITCH;
		if(matchData.getCubesOppSwitch() > matchData.getCubesSwitch() ^
				matchData.getCubesScale() > matchData.getCubesScale() ^
				matchData.getCubesScale() > matchData.getCubesExchanged()) return PowerupMatchFocus.OPP_SWITCH;
		if(matchData.getCubesExchanged() > matchData.getCubesSwitch() ^
				matchData.getCubesScale() > matchData.getCubesOppSwitch() ^
				matchData.getCubesScale() > matchData.getCubesScale()) return PowerupMatchFocus.EXCHANGE;
		return null;
	}
}
