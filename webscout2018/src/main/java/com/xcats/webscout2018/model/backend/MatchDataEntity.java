package com.xcats.webscout2018.model.backend;

import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.Team;
import com.xcats.XcatsScoutingLib.General.Enums.Alliance;
import com.xcats.XcatsScoutingLib.General.Enums.DriverPosition;
import com.xcats.XcatsScoutingLib.General.Enums.RobotPosition;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.MatchData;
import com.xcats.XcatsScoutingLib.Powerup2018.Enums.PowerupElementPos;
import com.xcats.webscout2018.model.backend.id.MatchDataID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="match_data",schema = "event")
public class MatchDataEntity implements Serializable, MatchData {

	public MatchDataEntity(TeamEntity team, int matchNum, Alliance alliance, String scoutName, DriverPosition driverPos, RobotPosition robotPos, PowerupElementPos blueSwitchPos, PowerupElementPos redSwitchPos, PowerupElementPos scalePos, boolean baselineCross, int autoCubesSwitch, int autoCubesSwitchFail, int autoCubesScale, int autoCubesScaleFail, int cubesSwitch, int cubesSwitchFail, int cubesScale, int cubesScaleFail, int cubesOppSwitch, int cubesOppSwitchFail, int cubesExchanged, boolean climb, int climbsAssisted) {
		this.id = new MatchDataID(team,matchNum);
		this.alliance = alliance;
		this.scoutName = scoutName;
		this.driverPos = driverPos;
		this.robotPos = robotPos;
		this.blueSwitchPos = blueSwitchPos;
		this.redSwitchPos = redSwitchPos;
		this.scalePos = scalePos;
		this.baselineCross = baselineCross;
		this.autoCubesSwitch = autoCubesSwitch;
		this.autoCubesSwitchFail = autoCubesSwitchFail;
		this.autoCubesScale = autoCubesScale;
		this.autoCubesScaleFail = autoCubesScaleFail;
		this.cubesSwitch = cubesSwitch;
		this.cubesSwitchFail = cubesSwitchFail;
		this.cubesScale = cubesScale;
		this.cubesScaleFail = cubesScaleFail;
		this.cubesOppSwitch = cubesOppSwitch;
		this.cubesOppSwitchFail = cubesOppSwitchFail;
		this.cubesExchanged = cubesExchanged;
		this.climb = climb;
		this.climbsAssisted = climbsAssisted;
	}

	//General Data
	@Id
	MatchDataID id;
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


	@Override
	public Team getTeam() {
		return id.getTeam();
	}

	@Override
	public int getMatchNum() {
		return id.getMatchNum();
	}

	@Override
	public Alliance getAlliance() {
		return this.alliance;
	}

	@Override
	public String getScoutName() {
		return this.scoutName;
	}

	@Override
	public DriverPosition getDriverPosition() {
		return this.driverPos;
	}

	@Override
	public RobotPosition getRobotPosition() {
		return this.robotPos;
	}

	@Override
	public PowerupElementPos getBlueSwitchPos() {
		return this.blueSwitchPos;
	}

	@Override
	public PowerupElementPos getRedSwitchPos() {
		return this.redSwitchPos;
	}

	@Override
	public PowerupElementPos getScalePos() {
		return this.scalePos;
	}

	@Override
	public boolean getBaselineCross() {
		return this.baselineCross;
	}

	@Override
	public int getAutoCubesSwitch() {
		return this.autoCubesSwitch;
	}

	@Override
	public int getAutoCubesSwitchFail() {
		return this.autoCubesSwitchFail;
	}

	@Override
	public int getAutoCubesScale() {
		return this.autoCubesScale;
	}

	@Override
	public int getAutoCubesScaleFail() {
		return this.autoCubesScaleFail;
	}

	@Override
	public int getCubesSwitch() {
		return this.cubesSwitch;
	}

	@Override
	public int getCubesSwitchFail() {
		return this.cubesSwitchFail;
	}

	@Override
	public int getCubesScale() {
		return this.cubesScale;
	}

	@Override
	public int getCubesScaleFail() {
		return this.cubesScaleFail;
	}

	@Override
	public int getCubesOppSwitch() {
		return this.cubesOppSwitch;
	}

	@Override
	public int getCubesOppSwitchFail() {
		return this.cubesOppSwitchFail;
	}

	@Override
	public int getCubesExchanged() {
		return this.cubesExchanged;
	}

	@Override
	public boolean getClimb() {
		return this.climb;
	}

	@Override
	public int getClimbsAssisted() {
		return this.climbsAssisted;
	}

}
