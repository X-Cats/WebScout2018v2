package com.xcats.XcatsScoutingLib.Powerup2018.Data;

import com.xcats.XcatsScoutingLib.General.Enums.Alliance;
import com.xcats.XcatsScoutingLib.Powerup2018.Enums.PowerupElementPos;

public interface MatchData extends com.xcats.XcatsScoutingLib.General.Data.MatchData {
	//General Info
	public PowerupElementPos getBlueSwitchPos();
	public PowerupElementPos getRedSwitchPos();
	public PowerupElementPos getScalePos();

	//Autonomous info
	public boolean getBaselineCross();

	public int getAutoCubesSwitch();
	public int getAutoCubesSwitchFail();

	public int getAutoCubesScale();
	public int getAutoCubesScaleFail();

	//Teleop Info

	public int getCubesSwitch();
	public int getCubesSwitchFail();

	public int getCubesScale();
	public int getCubesScaleFail();

	public int getCubesOppSwitch();
	public int getCubesOppSwitchFail();

	public int getCubesExchanged();

	//Endgame Info
	public boolean getClimb();
	public int getClimbsAssisted();

}
