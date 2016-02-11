package assignment2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person[] persons = { new Person("Bob", 1.75, 75),
				new Person("Jack", 2.0, 100), new Person("Jane", 1.6, 45),
				new Person("Coolguy", 1.81, 105),
				new Person("Bestfriend", 1.78, 61) };

		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i].name + ": " + persons[i].identify());
		}

		// Creating clones array
		Person[] clones = new Person[5];

		// Copying every person from persons array to clones array
		for (int i = 0; i < persons.length; i++) {
			clones[i] = new Person(persons[i]);
		}

		System.out.println("\nTesting clone method");

		System.out.println("\nperson:");
		System.out.println(persons[0].info());

		System.out.println("\nclone:");
		System.out.println(clones[0].info());

		System.out.println("\nChangin clone\n");

		clones[0].name = "newBob";
		clones[0].height = 3.0;
		clones[0].weight = 333;

		System.out.println("\nperson:");
		System.out.println(persons[0].info());

		System.out.println("\nclone:");
		System.out.println(clones[0].info());

		System.out.println("\nHeight of person didn't change\n\n");

		// Testing checkHeight method
		double heightLimit = 2.0;
		System.out.println("Height limit is: " + heightLimit + "m, "
				+ persons[0].name + "' height is " + persons[0].height);
		
		if (persons[0].isInHeightLimit(heightLimit))
			System.out.println(persons[0].name
					+ "'s height doesn't exceed the height limit");
		else
			System.out.println(persons[0].name
					+ "'s height exceeds the height limit");
		
		heightLimit = 1.5;
		System.out.println("Height limit is: " + heightLimit + "m, "
				+ persons[0].name + "' height is " + persons[0].height);
		
		if (persons[0].isInHeightLimit(heightLimit))
			System.out.println(persons[0].name
					+ "'s height doesn't exceed the height limit");
		else
			System.out.println(persons[0].name
					+ "'s height exceeds the height limit");

	}
}
