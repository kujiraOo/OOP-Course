package assignment3;

public class MainClass {

	public static void main(String[] args) {

		// Task 1
		Person[] persons = { new Person("Bob", 1.75, 75),
				new Person("Jack", 2.0, 100), new Person("Jane", 1.6, 45),
				new Person("Coolguy", 1.81, 105),
				new Person("Bestfriend", 1.78, 61) };

		System.out.println("Task 1\n");

		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i].name + ": " + persons[i].identify());
		}

		// Task 2
		System.out.println("\nTask 2\n");
		Person bobClone = new Person(persons[0]);
		System.out.println(bobClone);

		// Task 3
		System.out.println("\nTask 3\n");
		System.out.println("Testing compaterTo method:");
		System.out.println(persons[0] + "\n");
		System.out.println(persons[1]);

		System.out.println("\nCompare Jack to Bob: "
				+ persons[1].compareTo(persons[0]));

		double weight = 120.0;
		double height = 3.0;

		System.out.println("\nCompare jack to: " + weight + "kg, " + height
				+ "m: " + persons[1].compareTo(weight, height));

		// Task 4
		System.out.println("\nTask 4\n");
		System.out.println("Testing getHeavierPerson method: ");

		System.out.println("Who has greater weight: Bob or Jack?");
		System.out.println(persons[1].getHeavierPerson(persons[0]));

	}
}
