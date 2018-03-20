package com.xcats.webscout2018.Backend.Entities;

import com.xcats.XcatsScoutingLib.General.Enums.Alliance;
import com.xcats.XcatsScoutingLib.General.Enums.DriverPosition;
import com.xcats.XcatsScoutingLib.Powerup2018.Data.MatchData;
import com.xcats.XcatsScoutingLib.Powerup2018.Enums.PowerupElementPos;
import com.xcats.webscout2018.Backend.Entities.id.MatchDataID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="match_data",schema = "event")
public class MatchDataEntity implements Serializable, MatchData {

	@Id
	private MatchDataID id;

	public MatchDataID getId() {
		return id;
	}

	public Alliance getAlliance() {
		return alliance;
	}

	private Alliance alliance;
	private PowerupElementPos blueSwitchPos;
	private PowerupElementPos redSwitchPos;
	private PowerupElementPos scalePos;
	private boolean baselineCross;
	private boolean climb;
	private int autoCubesSwitch;
	private int autoCubesSwitchFail;
	private int autoCubesScale;
	private int autoCubesScaleFail;
	private int cubesSwitch;
	private int cubesSwitchFail;
	private int cubesScale;
	private int cubesScaleFail;
	private int cubesOppSwitch;
	private int cubesOppSwitchFail;
	private int cubesExchanged;
	private int climbAssist;
	private DriverPosition driverPos;
	private RobotPos robotPos;

	private MatchDataEntity() {}

	public MatchDataEntity(int matchNum, TeamEntity team, Alliance alliance, PowerupElementPos blueSwitchPos, PowerupElementPos redSwitchPos,
						   PowerupElementPos scalePos, boolean baselineCross, boolean climb, int autoCubesSwitch,
						   int autoCubesSwitchFail, int autoCubesScale, int autoCubesScaleFail, int cubesSwitch,
						   int cubesSwitchFail, int cubesScale, int cubesScaleFail, int cubesOppSwitch,
						   int cubesOppSwitchFail, int cubesExchanged, int climbAssist, DriverPosition driverPos,
						   RobotPos robotPos) {
		this.id = new MatchDataID(team, matchNum);
		this.blueSwitchPos = blueSwitchPos;
		this.redSwitchPos = redSwitchPos;
		this.scalePos = scalePos;
		this.baselineCross = baselineCross;
		this.climb = climb;
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
		this.climbAssist = climbAssist;
		this.driverPos = driverPos;
		this.robotPos = robotPos;
	}

	public TeamEntity getTeam() {
		return id.getTeam();
	}

	public int getMatchNum() {
		return id.getMatchNum();
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

	public boolean isClimb() {
		return climb;
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

	public int getClimbAssist() {
		return climbAssist;
	}

	public DriverPosition getDriverPos() {
		return driverPos;
	}

	public RobotPos getRobotPos() {
		return robotPos;
	}

	public String toCSVString() {
		StringBuilder out = new StringBuilder();
		out.append(Integer.toString(this.getTeam().getTeamNum()) + ",");
		out.append(this.getMatchNum() + ",");
		out.append(" ,");
		out.append(this.getBlueSwitchPos().toString() + ",");
		out.append(this.getRedSwitchPos().toString() + ",");
		out.append(this.getScalePos().toString() + ",");
		out.append(this.getDriverPos().toString() + ",");
		out.append(Boolean.toString(this.isBaselineCross()) + ",");
		out.append(this.getAutoCubesSwitch() + ",");
		out.append(this.getAutoCubesScale() + ",");
		out.append(this.getAutoCubesSwitchFail() + ",");
		out.append(this.getAutoCubesScaleFail() + ",");
		out.append(this.getCubesSwitch() + ",");
		out.append(this.getCubesSwitchFail() + ",");
		out.append(this.getCubesScale() + ",");
		out.append(this.getCubesScaleFail()+ ",");
		out.append(this.getCubesOppSwitch() + ",");
		out.append(this.getCubesOppSwitchFail()+ ",");
		out.append(this.getCubesExchanged() + ",");
		out.append(this.isClimb() + ",");
		out.append(this.getClimbAssist() + ",");
		out.append(" ,");

		return out.toString();
	}

	public static final String CSV_HEADER = "TeamNumber," +
			"MatchNumber," +
			"Alliance," +
			"BlueSwitchPos," +
			"RedSwitchPos," +
			"ScalePos," +
			"DriverPos," +
			"RobotPos," +
			"AutoLineCrossed," +
			"AutoCubesSwitch," +
			"AutoCubesScale," +
			"AutoCubesSwitchFail," +
			"AutoCubesScaleFail," +
			"CubesOwnSwitch," +
			"CubesOwnSwitchFail," +
			"CubesScale," +
			"CubesScaleFail," +
			"CubesOppSwitch," +
			"CubesOppSwitchFail," +
			"CubesExchanged," +
			"Climb," +
			"ClimbAssist," +
			"ClimbAssisted";
}
