package assignment1;

import java.util.ArrayList;

class Month {
	String name;
	int days;

	static ArrayList<Month> monthsWith29Days;
	static ArrayList<Month> monthsWith30Days;
	static ArrayList<Month> monthsWith31Days;

	static Month[] months = { new Month("January", 31),
			new Month("February", 28), new Month("March", 31),
			new Month("April", 30), new Month("May", 31),
			new Month("June", 30), new Month("July", 31),
			new Month("August", 31), new Month("September", 30),
			new Month("October", 31), new Month("November", 30),
			new Month("December", 31), };

	public Month(String name, int days) {
		this.name = name;
		this.days = days;
	}

	public String toString() {
		return name;
	}

	// Group month in three groups according to the number of
	// days in each month
	static void groupMonths() {

		monthsWith29Days = new ArrayList<Month>();
		monthsWith30Days = new ArrayList<Month>();
		monthsWith31Days = new ArrayList<Month>();

		for (int i = 0; i < months.length; i++) {

			switch (months[i].days) {
			case 29:
				monthsWith29Days.add(months[i]);
				break;

			case 30:
				monthsWith30Days.add(months[i]);
				break;

			case 31:
				monthsWith31Days.add(months[i]);
				break;
			}
		}
	}

	// Print a list of months with specified amount of days
	static void printMonthsWithNDays(int days) {
		groupMonths();

		switch (days) {
		case 29:
			printMonthsGroup(monthsWith29Days);
			break;

		case 30:
			printMonthsGroup(monthsWith30Days);
			break;

		case 31:
			printMonthsGroup(monthsWith31Days);
			break;
		}
	}

	static void printMonthsGroup(ArrayList<Month> monthsGroup) {
		for (int i = 0; i < monthsGroup.size(); i++) {
			System.out.println(monthsGroup.get(i).toString());
		}
	}
}

public class problem6 {

	public static void main(String[] args) {

		Month.printMonthsWithNDays(31);
	}
}
