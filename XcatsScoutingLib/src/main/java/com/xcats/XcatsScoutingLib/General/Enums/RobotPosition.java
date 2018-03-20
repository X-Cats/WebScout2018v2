package com.xcats.XcatsScoutingLib.General.Enums;

public enum RobotPosition {
	CENTER,LEFT,RIGHT;

	public static RobotPosition parseFromString(String in) {
		if(in.equalsIgnoreCase(Values.LEFT)) return RobotPosition.LEFT;
		else if(in.equalsIgnoreCase(Values.CENTER)) return RobotPosition.CENTER;
		else return RobotPosition.RIGHT;
	}

	public String toString() {
		if(this == this.CENTER) return Values.CENTER;
		else if (this == this.LEFT) return Values.LEFT;
		else return Values.RIGHT;
	}

	public class Values {
		public static final String LEFT = "LEFT";
		public static final String CENTER = "CENTER";
		public static final String RIGHT = "RIGHT";
	}
}
