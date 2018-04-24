package com.xcats.XcatsScoutingLib.Powerup2018.Enums;

public enum PowerupElementPos {
	LEFT, RIGHT;
	public static PowerupElementPos parseFromString(String in) {
		if(in.equalsIgnoreCase("left")) return PowerupElementPos.LEFT;
		else return PowerupElementPos.RIGHT;
	}
}
