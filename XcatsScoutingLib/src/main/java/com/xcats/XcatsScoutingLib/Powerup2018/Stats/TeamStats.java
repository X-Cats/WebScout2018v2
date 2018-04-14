package com.xcats.XcatsScoutingLib.Powerup2018.Stats;

import com.xcats.XcatsScoutingLib.Powerup2018.Enums.*;

public interface TeamStats extends com.xcats.XcatsScoutingLib.General.Stats.TeamStats {

	//Methods for returning raw data
	int[] getScaleData();
	int[] getSwitchData();
	int[] getOppSwitchData();
	int[] getExchangeData();
	boolean[] getClimbData();

	//Methods for returning capabilities
	boolean canDoSwitch();
	boolean canDoScale();
	boolean canDoExchange();
	boolean canClimb();

	//Methods for returning foci
	int getFocusScale();
	int getFocusSwitch();
	int getFocusOppSwitch();
	int getFocusExchange();

	//Methods for returning percent foci
	double getPercentFocusScale();
	double getPercentFocusSwitch();
	double getPercentFocusOppSwitch();
	double getPercentFocusExchange();

	PowerupMatchFocus getPrimaryFocus();

	//Methods for returning focused averages
	double getFocusedAverageScale();
	double getFocusedAverageSwitch();
	double getFocusedAverageOppSwitch();
	double getFocusedAverageExchange();

}
