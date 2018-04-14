package com.xcats.XcatsScoutingLib.General.Data.raw;

import com.xcats.XcatsScoutingLib.General.Enums.Alliance;
import com.xcats.XcatsScoutingLib.General.Enums.DriverPosition;
import com.xcats.XcatsScoutingLib.General.Enums.RobotPosition;

import java.util.Comparator;

public interface MatchData {
	public Team getTeam();
	public int getMatchNum();
	public Alliance getAlliance();
	public String getScoutName();
	public DriverPosition getDriverPosition();
	public RobotPosition getRobotPosition();

	static final class SortByTeamNum implements Comparator<MatchData> {
		public int compare(MatchData a, MatchData b) {
			if(a.getTeam().getTeamNum() < b.getTeam().getTeamNum()) return -1;
			else if(a.getTeam().getTeamNum() > b.getTeam().getTeamNum()) return 1;
			else return 0;
		}
	}

	static final class SortByMatchNum implements Comparator<MatchData> {
		public int compare(MatchData a, MatchData b) {
			if(a.getMatchNum() < b.getMatchNum()) return -1;
			else if(a.getMatchNum() > b.getMatchNum()) return 1;
			else return 0;
		}
	}
}
