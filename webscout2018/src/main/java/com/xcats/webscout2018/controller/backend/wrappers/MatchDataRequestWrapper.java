package com.xcats.webscout2018.controller.backend.wrappers;

import com.xcats.XcatsScoutingLib.General.Data.raw.Team;
import com.xcats.XcatsScoutingLib.General.Enums.Alliance;
import com.xcats.XcatsScoutingLib.General.Enums.DriverPosition;
import com.xcats.XcatsScoutingLib.General.Enums.RobotPosition;
import com.xcats.XcatsScoutingLib.Powerup2018.Enums.PowerupElementPos;
import com.xcats.webscout2018.model.backend.MatchDataEntity;
import com.xcats.webscout2018.model.backend.TeamEntity;

public class MatchDataRequestWrapper {
	private int teamNum;
	private int matchNum;

	private Alliance alliance;
	private String scoutName;
	private DriverPosition driverPos;
	private RobotPosition robotPos;
	private PowerupElementPos blueSwitchPos;
	private PowerupElementPos redSwitchPos;
	private PowerupElementPos scalePos;

	//Auto Data
	private boolean baselineCross;
	private int autoCubesSwitch;
	private int autoCubesSwitchFail;
	private int autoCubesScale;
	private int autoCubesScaleFail;

	//Teleop Data
	private int cubesSwitch;
	private int cubesSwitchFail;
	private int cubesScale;
	private int cubesScaleFail;
	private int cubesOppSwitch;
	private int cubesOppSwitchFail;

	private int cubesExchanged;

	//Endgame Data
	private boolean climb;
	private int climbsAssisted;

	public MatchDataEntity toMatchDataEntity(TeamEntity team) {
		return new MatchDataEntity(team, matchNum, alliance, scoutName,driverPos,
				robotPos, blueSwitchPos, redSwitchPos, scalePos, baselineCross,
				autoCubesSwitch, autoCubesSwitchFail, autoCubesScale, autoCubesScaleFail,
				cubesSwitch, cubesSwitchFail, cubesScale, cubesScaleFail,
				cubesOppSwitch, cubesOppSwitchFail, cubesExchanged, climb, climbsAssisted);
	}

	public int getTeamNum() {
		return teamNum;
	}
}
