package assignment5;

import java.util.ArrayList;
import java.util.Random;

public class Gaussian {

	public static void main(String[] args) {

		Random random = new Random();
		MyMath myMath = new MyMath();

		int n = Integer.parseInt(args[0]);

		if (n > 30) {

			ArrayList<Double> gaussianNums = new ArrayList<Double>();

			for (int i = 0; i < n; i++)
				gaussianNums.add(random.nextGaussian());

			System.out.println("Average of " + n + " Gaussian numbers: "
					+ myMath.average(gaussianNums));
			System.out.println("Standard deviation of " + n + " Gaussian numbers: "
					+ myMath.standardDeviation(gaussianNums));

			
		} else {
			System.out.println("n must be greater than 30");
		}
		
		
	}
}
