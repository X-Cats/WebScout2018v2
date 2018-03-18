/**
 * 
 */
package com.xcats.XcatsScoutingLib.Calc;

/**
 * @author Aidan Sciortino
 *
 */
public class UnitVector extends Vector {

	/**
	 * @param inData
	 */
	public UnitVector(double[] inData) {
		super(inData);
		if(this.calcMagnitude() != 1) {
			throw new RuntimeException("Unit Vector length greater than 1");
		}
	}

	/**
	 * @param size
	 */
	public UnitVector(int size) {
		super(size);
	}
	

}
