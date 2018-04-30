package com.xcats.webscout2018.controller.backend.wrappers;

import com.xcats.XcatsScoutingLib.Powerup2018.Data.raw.PitData;

public class PitDataRequestWrapper implements PitData {
	int teamNum;
	boolean autoBaselineCross;

	public int getTeamNum() {
		return teamNum;
	}

	public boolean getAutoBaselineCross() {
		return autoBaselineCross;
	}
}
