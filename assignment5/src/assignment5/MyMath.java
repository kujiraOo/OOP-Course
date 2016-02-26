package assignment5;

import java.util.ArrayList;

public class MyMath {
	
	public double average(ArrayList<Double> nums) {
		
		return sum(nums) / nums.size();
	}
	
	public double standardDeviation(ArrayList<Double> nums){
		
		double sqr = 0.0;
		double average = average(nums);
		
		for (int i = 0; i < nums.size(); i++)
			sqr += (nums.get(i) - average) * (nums.get(i) - average);
		
		return Math.sqrt(sqr/nums.size());
	}
	
	private double sum(ArrayList<Double> nums) {
		
		double sum = 0.0;
		
		for (int i = 0; i < nums.size(); i++)
			sum += nums.get(i);
		
		return sum;
	}
}
