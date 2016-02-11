package assignment1;

public class problem6_2 {

	public static void main(String[] args) {

		String[] months = { "January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November",
				"December" };

		int[] numDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 0; i < months.length; i++) {
			switch (numDays[i]) {
			case 31:
				System.out.print(months[i] + " ");
			}
		}
	}
}
