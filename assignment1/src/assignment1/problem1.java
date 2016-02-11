package assignment1;

public class problem1 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 249; i++) {
			sum += i;
		}

		System.out.println("Sum of numbers belonging to interval [1, 249] is "
				+ sum);
	}

}
