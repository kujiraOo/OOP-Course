package assignment5;

import java.util.ArrayList;
import java.util.Random;

public class RandomInt {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		
		if (n > 0) {
			
			ArrayList<Double> nums = new ArrayList<Double>();
			Random random = new Random();
			MyMath myMath = new MyMath();
			
			for (int i = 0; i < n; i++)
				nums.add((double)random.nextInt(8) - 3);
				
			System.out.println("Average of " + n + " random numbers in range from -3 to 5: "
					+ myMath.average(nums));
			System.out.println("Standard deviation of " + n + " random numbers in range from -3 to 5: "
					+ myMath.standardDeviation(nums));
			
		} else {
			System.out.println("n must be an integer greater than 0");
		}
	}
}
