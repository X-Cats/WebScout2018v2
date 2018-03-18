/**
 * 
 */
package com.xcats.XcatsScoutingLib.Calc;

/**
 * Holds a numerical vector for which a magnitude and direction unit vector can be calculated.
 * 
 * This class is designed to make it easy to implement a vector based ranking system for 
 * @author Aidan Sciortino
 *
 */
public class Vector {
	protected double[] data;
	protected int size;
	
	/**
	 * Constructs a new Vector object using a preconstructed array of data.
	 * @param inData
	 */
	public Vector(double[] inData) {
		data = inData;
		this.size = inData.length;
	}
	
	/**
	 * Constructs a new empty Vector with a predetermined size
	 * @param size
	 */
	public Vector(int size) {
		data = new double[size];
	}
	
	/**
	 * Returns the value at an index of the vector
	 * 
	 * @param index
	 * @return the data value at the desired index, or -1 if the index is out of bounds.
	 */
	public double getAtIndex(int index) {
		if(index > this.size) return -1;
		return data[index];
	}
	
	/**
	 * 
	 * @param in
	 * @param index
	 * @return true if the operation was successful, false if it was not
	 */
	public boolean setAtIndex(double in, int index) {
		if(index > this.size) return false;
		data[index] = in;
		return true;
	}
	
	/**
	 * Gets the array of data held within the vector
	 * 
	 * @return the double[] array that is held within the vector
	 */
	public double[] getData() {
		return this.data;
	}
	
	/**
	 * Calculates the magnitude of the vector.
	 * 
	 * @return the magnitude of the vector as a double
	 */
	public double calcMagnitude() {
		double sum = 0;
		double out;
		for(double i:this.data) {
			sum += Math.pow(i,2);
		}
		out = Math.sqrt(sum);
		return out;
	}
	
	/**
	 * Calculates the direction vector for the vector
	 * 
	 * @return A UnitVector object holding the direction data.
	 * @see UnitVector
	 */
	public UnitVector calcDirection() {
		double[] outData = new double[this.size];
		double mag = this.calcMagnitude();
		for(int i = 0; i < data.length; i++) {
			outData[i] = data[i]/mag;
		}
		try {
			return new UnitVector(outData);
		}
		catch(RuntimeException e) {
			e.printStackTrace();
			System.err.println("Something is very wrong with the math in the Vector class. Might wanna check that out.");
			return null;
		}
	}

}
