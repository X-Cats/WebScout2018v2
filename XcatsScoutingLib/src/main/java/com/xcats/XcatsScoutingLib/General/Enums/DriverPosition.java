package com.xcats.XcatsScoutingLib.General.Enums;

public enum DriverPosition {
	CENTER,LEFT,RIGHT;

	public static DriverPosition parseFromString(String in) {
		if(in.equalsIgnoreCase(Values.LEFT)) return DriverPosition.LEFT;
		else if(in.equalsIgnoreCase(Values.CENTER)) return DriverPosition.CENTER;
		else return DriverPosition.RIGHT;
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
