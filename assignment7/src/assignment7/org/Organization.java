package assignment7.org;

import java.util.Calendar;

import assignment7.emps.Employee;

public class Organization {

	public static void main(String[] args) {

		final Calendar cal = Calendar.getInstance();

		System.out.println("Instantiatig new Employee objects with different "
				+ "constructors is an example of compile-time polymorphysm");

		System.out.println("Calling parent class' methods "
				+ "is an example of run-time polymorphysm");

		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println("Instantiating employee with default constructor");

		Employee unknown = new Employee();

		System.out.println(unknown);

		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out
				.println("Instantiating employee with no hireDate constructor");

		Employee bob = new Employee("Bob", "Janitor", 0.2, 15.0, 24, 180);

		System.out.println(bob);

		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out
				.println("Instantiating employee with hireDate constructor, with hireDate as Date object");

		cal.set(2015, 5, 11);
		Employee jane = new Employee("Jane", "Assisstant", 0.3, 13.0, 6, 100,
				cal.getTime());

		System.out.println(jane);

		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out
				.println("Instantiating employee with hireDate constructor, with hireDate as year, month, date int values");

		Employee mark = new Employee("Mark", "Senior Programmer", 0.35, 35.0,
				48, 180, 2003, 6, 18);

		System.out.println(mark);

		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println("Testing getTotalTax methode");

		System.out.println("Amount of tax Mark is paying in month: "
				+ mark.getTotalTax());
		System.out.println("Amount of tax Mark is paying in 10 months: "
				+ mark.getTotalTax(6));

	}

}
