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
		return new MatchDataEntity(team, this.getMatchNum(), alliance, scoutName,driverPos,
				robotPos, blueSwitchPos, redSwitchPos, scalePos, baselineCross,
				autoCubesSwitch, autoCubesSwitchFail, autoCubesScale, autoCubesScaleFail,
				cubesSwitch, cubesSwitchFail, cubesScale, cubesScaleFail,
				cubesOppSwitch, cubesOppSwitchFail, cubesExchanged, climb, climbsAssisted);
	}

	public int getTeamNum() {
		return teamNum;
	}
	public int getMatchNum() { return matchNum; }

	public Alliance getAlliance() {
		return alliance;
	}

	public String getScoutName() {
		return scoutName;
	}

	public DriverPosition getDriverPos() {
		return driverPos;
	}

	public RobotPosition getRobotPos() {
		return robotPos;
	}

	public PowerupElementPos getBlueSwitchPos() {
		return blueSwitchPos;
	}

	public PowerupElementPos getRedSwitchPos() {
		return redSwitchPos;
	}

	public PowerupElementPos getScalePos() {
		return scalePos;
	}

	public boolean isBaselineCross() {
		return baselineCross;
	}

	public int getAutoCubesSwitch() {
		return autoCubesSwitch;
	}

	public int getAutoCubesSwitchFail() {
		return autoCubesSwitchFail;
	}

	public int getAutoCubesScale() {
		return autoCubesScale;
	}

	public int getAutoCubesScaleFail() {
		return autoCubesScaleFail;
	}

	public int getCubesSwitch() {
		return cubesSwitch;
	}

	public int getCubesSwitchFail() {
		return cubesSwitchFail;
	}

	public int getCubesScale() {
		return cubesScale;
	}

	public int getCubesScaleFail() {
		return cubesScaleFail;
	}

	public int getCubesOppSwitch() {
		return cubesOppSwitch;
	}

	public int getCubesOppSwitchFail() {
		return cubesOppSwitchFail;
	}

	public int getCubesExchanged() {
		return cubesExchanged;
	}

	public boolean isClimb() {
		return climb;
	}

	public int getClimbsAssisted() {
		return climbsAssisted;
	}
}
