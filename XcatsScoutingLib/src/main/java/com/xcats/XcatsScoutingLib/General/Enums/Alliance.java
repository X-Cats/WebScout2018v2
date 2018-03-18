package com.xcats.XcatsScoutingLib.General.Enums;

public enum Alliance {
	RED,BLUE;

	public static Alliance parseFromString(String in) {
		if(in.equalsIgnoreCase(Value.RED)) return Alliance.RED;
		else if(in.equalsIgnoreCase(Value.BLUE)) return Alliance.BLUE;
		throw new IllegalArgumentException("Input String does not satisfy any known Alliance value");
	}

	public String toString() {
		if(this.equals(Alliance.RED)) return Value.RED;
		else if(this.equals(Alliance.BLUE)) return Value.BLUE;
		else throw new IllegalStateException("Cannot convert current Alliance value to string");
	}

	public class Value {
		public static final String RED = "Red";
		public static final String BLUE = "Blue";
	}
}
