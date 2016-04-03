package assignment9.problem3;


import assignment9.problem2.Member;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.Vector;

public abstract class Club {

    private static final Scanner sc = new Scanner(System.in);
    private static final String prompt = "-> ";
    private static Vector<Member> members = new Vector();
    private static boolean quit = false;
    private static String input;

    public static void main(String[] args) {
        System.out.printf("Enter 'help' to list command\n");

        while (!quit) {
            askNextCommand();
        }
    }

    private static void askNextCommand() {
        System.out.print(prompt);

        input = sc.nextLine();

        if (input.equals("help"))
            help();
        else if (input.equals("am"))
            addMember();
        else if (input.equals("ls"))
            listMembers();
        else if (input.equals("quit"))
            quit = true;
        else if (input.matches("rm .*"))
            removeMember(input);
        else if (input.matches("up .*"))
            updatePrice(input);
        else
            System.out.println("Invalid command");
    }

    private static void updatePrice(String input) {
        if (input.matches("up \\d+")) {
            int index = Integer.parseInt(input.replaceAll("[^\\d]", ""));

            if (index < 0 || index >= members.size())
                System.out.println("No such entry");
            else {
                System.out.println("Enter new membership price");
                members.get(index).updatePrice(enterDouble());
            }
        }
        else
            System.out.println("Please specify index of member to remove");

    }

    private static void removeMember(String input) {
        if (input.matches("rm \\d+")) {
            int index = Integer.parseInt(input.replaceAll("[^\\d]", ""));

            if (index < 0 || index >= members.size())
                System.out.println("No such entry");
            else
                members.remove(index);
        }
        else
            System.out.println("Please specify index of member to remove");
    }

    private static void listMembers() {
        for (Member member : members)
            System.out.println(member + "\n");
    }

    private static void help() {
        System.out.println("am - adds new member" +
                "\nhelp - displays this help" +
                "\nrm index - removes member ar specified index from the list" +
                "\nquit - quit program");
    }

    private static void addMember() {

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter address\nStreet: ");
        String street = sc.nextLine();
        System.out.println("House: ");
        int house = enterInt();
        System.out.println("City: ");
        String city = sc.nextLine();
        System.out.println("Postal code: ");
        int postalCode = enterInt();

        System.out.println("Enter membership start date in format yyyy-mm-dd: ");
        LocalDate dateStart = enterDate();

        System.out.println("Enter membership end date in format yyyy-mm-dd: ");
        LocalDate dateEnd = enterDate();

        System.out.println("Enter membership price: ");
        double price = enterDouble();

        members.add(new Member(name, dateStart, dateEnd,
                price, street, house,
                city, postalCode));
    }

    private static LocalDate enterDate() {
        LocalDate date = null;
        String input = sc.nextLine();

        while (date == null) {
            try {
                date = LocalDate.parse(input);
            } catch (DateTimeParseException e) {
                System.out.println("Please enter valid date in format yyyy-mm-dd");
                input = sc.nextLine();
            }
        }

        return date;
    }

    private static int enterInt() {

        while (!sc.hasNextInt()) {
            System.out.println("Please enter an integer");
            sc.next();
        }

        int input = sc.nextInt();

        sc.nextLine(); // move scanner to next line, to reset buffer

        return input;
    }

    private static double enterDouble() {

        while (!sc.hasNextDouble()) {
            System.out.println("Please enter a number");
            sc.next();
        }

        double input = sc.nextDouble();

        sc.nextLine(); // move scanner to next line, to reset buffer

        return input;
    }
}
