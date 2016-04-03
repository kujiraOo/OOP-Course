package assignment9.problem4;

import assignment9.problem2.Member;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;

public abstract class Club {

    private static final Scanner sc = new Scanner(System.in);
    private static final String prompt = "-> ";
    private static Hashtable<Integer, Member> members = new Hashtable();
    private static boolean quit = false;
    private static String input;
    private static int id = 0;

    public static void main(String[] args) {
        System.out.println("Enter 'help' to list command");

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
        else if (input.equals("amd"))
            addDefaultMember();
        else if (input.equals("ls"))
            listMembers();
        else if (input.equals("quit"))
            quit = true;
        else if (input.matches("rm[ ]*.*"))
            removeMember(input);
        else if (input.matches("up[ ]*.*"))
            updatePrice(input);
        else if (input.matches("id[ ]*.*"))
            displayMemberInfo(input);
        else
            System.out.println("Invalid command");
    }

    private static void displayMemberInfo(String input) {
        if (input.matches("id \\d+")) {
            int key = Integer.parseInt(input.replaceAll("[^\\d]", ""));

            Member member = members.get(key);

            if (member != null) {
                System.out.println("id: " + key + "\n" + member);;
            } else
                System.out.println("No member with such id");
        } else
            System.out.println("Please specify index of member to display info");
    }

    private static void updatePrice(String input) {
        if (input.matches("up \\d+")) {
            int key = Integer.parseInt(input.replaceAll("[^\\d]", ""));

            Member member = members.get(key);

            if (member != null) {
                System.out.println("Enter new membership price");
                member.updatePrice(enterDouble());
            } else
                System.out.println("No member with such id");
        } else
            System.out.println("Please specify index of member to update price");
    }

    private static void removeMember(String input) {
        if (input.matches("rm \\d+")) {
            int key = Integer.parseInt(input.replaceAll("[^\\d]", ""));

            if (members.remove(key) == null)
                System.out.println("No member with such id");
        } else
            System.out.println("Please specify id of member to remove");
    }

    private static void listMembers() {
        Iterator<Map.Entry<Integer, Member>> iterator = members.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry e = iterator.next();

            System.out.println("id: " + e.getKey() + "\n" + e.getValue() + "\n");
        }
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

        members.put(Integer.valueOf(id),
                new Member(name, dateStart, dateEnd,
                        price, street, house,
                        city, postalCode));

        id++;
    }

    private static void addDefaultMember() {
        members.put(Integer.valueOf(id), new Member());

        id++;
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
