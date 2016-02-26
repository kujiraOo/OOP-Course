package assignment5;

import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		selectItemToCheck(sc);
	}

	private static void checkRegex(String message, String regex, Scanner sc) {
		String input = "";

		System.out.println(message);

		input = sc.nextLine();

		if (input.matches(regex))
			System.out.println("The input matches the regex");
		else
			System.out.println("The input doesn't match the regex");

		System.out.println("Continue checking? y/n");

		input = sc.nextLine();

		if (input.equals("y"))
			checkRegex(message, regex, sc);
	}

	private static void selectItemToCheck(Scanner sc) {

		System.out.println("Please select item to check:"
				+ "\n1 - International phone number"
				+ "\n2 - Finnish personal identity code"
				+ "\n3 - Number less than 1000" + "\n4 - Date"
				+ "\nq - To quit");

		String input = sc.nextLine();

		switch (input) {
		// Check phone number
		case "1":
			String phoneNumCheckMessage = "Please enter a phone number in "
					+ "international format to check"
					+ "\nFor example +358-40-1345678";
			String interPhoneNumRegex = "\\+\\d{1,3}-\\d{1,5}-\\d{4,8}";

			checkRegex(phoneNumCheckMessage, interPhoneNumRegex, sc);
			selectItemToCheck(sc);
			break;
		case "2":
			// Check Finnish id code
			String personalIdCheckMessage = "Please enter Finnish personal identity number to check"
					+ "\nFor example 120570-467W";
			String personalIdCodeRegex = "\\d{6}-\\d{3}[A-Z]";

			checkRegex(personalIdCheckMessage, personalIdCodeRegex, sc);
			selectItemToCheck(sc);
			break;
		case "3":
			// Check a number less than 1000
			String numberCheckMessage = "Please enter a number less than 1000";
			String numberLessThan1000Regex = "0|[1-9]\\d{1,2}|-[1-9]\\d*";

			checkRegex(numberCheckMessage, numberLessThan1000Regex, sc);
			selectItemToCheck(sc);
			break;
		case "4":
			// Check date, no leap years
			String dateCheckMessage = "Please enter date to check,"
					+ "\nFor example Jan. 1. 2014";
			String dateRegex = "(((Jan|Mar|May|Jul|Aug|Oct|Dec). ([1-9]|[1-2][0-9]|3[0-1]))|"
					+ "((Apr|Jun|Sep|Nov). ([1-9]|[1-2][0-9]|30))|"
					+ "Feb. ([1-9]|1[0-9]|2[0-9]))" + ". [1-2]\\d{1,3}";

			checkRegex(dateCheckMessage, dateRegex, sc);
			selectItemToCheck(sc);
			break;
		case "q":
			System.out.println("Quitting the program...");
			break;
		default:
			selectItemToCheck(sc);
		}
	}

}
