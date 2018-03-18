/**
 * 
 */
package com.xcats.XcatsScoutingLib.Calc;

/**
 * @author Aidan Sciortino
 *
 */
public class Stats {
	/**
	 * Calculates a weighted average
	 * @param weight how many times higher the last item in the data array is weighted than the first is
	 * @param data the data to calculate the average for
	 * @return the weighted average of the data held in the object according to the weight parameter
	 */
	public static double getWeightedMean(double weight, boolean[] data) {
		double[] convertedData = new double[data.length];
		for(int i = 0; i < data.length; i++) {
			if(data[i]) convertedData[i] = 1;
			else convertedData[i] = 0;
		}
		return getWeightedMean(weight, convertedData);
	}

	public static double getWeightedMean(double weight, double[] data) { 
		double out = 0;
		double datSum = 0;
		double weightSum = 0;
		for(int i = 0; i<data.length; i++) {
			double weightMult = (((double)i) * (weight - 1))/(data.length - 1) + 1;
			weightSum += weightMult;
			datSum += data[i]*weightMult;
		}
		out = datSum/weightSum;
		return out;
	}
	
	/**
	 * Calculates an ordinary mean of the data
	 * @param data the data for which the mean should be calculated
	 * @return the standard mean for the data-set
	 */
	public static double getMean(double[] data) {
		return getWeightedMean(1,data);
	}

	public static double getMean(boolean[] data) {return getWeightedMean(1,data);}
	
	/**
	 * Calculates the variance of data based on it's ordinary mean
	 * @param data the data to calculate variance for.
	 * @return the variance of the data
	 */
	public static double getVariance(double[] data) {
		return getVariance(data,false,1);
	}
	
	/**
	 * Calculates the variance of the data, with an option of using the weighted mean instead of the standard mean
	 * @param data the data for which the variance should be calculated
	 * @param weighted whether or not the variance is to use the weighted mean
	 * @param weightnum the factor by which to weight the data
	 * @return
	 */
	public static double getVariance(double[] data, boolean weighted, double weightnum) {
		double out;
		double dataMean;
		
		if(weighted) dataMean = getWeightedMean(weightnum,data);
		else dataMean=getMean(data);
		
		double dataSize = data.length;
		double sumDiff = 0.0;
		for(int i = 0; i < dataSize; i++) {
			sumDiff += Math.pow(data[i] - dataMean,2.0);
		}
		out = sumDiff/dataSize;
		return out;
	}
	
	/**
	 * Calculates the standard deviation for a dataset
	 * @param data the dataset for which the standard deviation is to be calculated
	 * @return the standard deviation of the dataset
	 */
	public static double getStDev(double[] data) {
		double out;
		double var = getVariance(data);
		out = Math.sqrt(var);
		return out;
	}
	public static double get1VarWeightAvg(double[] data, double weight, int pointIndex) {
		double sum = 0;
		double out;

		for(int i = 0; i < data.length; i++) {
			if(i!=pointIndex) sum+= data[i];
			else sum += 0;
		}
		sum += data[pointIndex] * weight;
		return sum / ((data.length - 1) + weight);
	}
}
