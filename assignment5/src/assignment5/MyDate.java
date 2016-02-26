package assignment5;

import java.util.Date;
import java.util.Random;

public class MyDate {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		
		if (n > 0){
			
			Random random = new Random();
			
			Date currentDate = new Date();
			long currentTime = currentDate.getTime();
			
			System.out.println("Current date: " + currentDate);
			
			for (int i = 0; i < n; i++){
				Date date = new Date(currentTime + random.nextInt());
				System.out.print("Randomized date: " + date);
				
				if (date.compareTo(currentDate) < 0)
					System.out.print(", is before\n");
				else 
					System.out.print(", is after\n");
			}
		} else {
			System.out.println("n must be an integer greater than 0");
		}
	}

}
