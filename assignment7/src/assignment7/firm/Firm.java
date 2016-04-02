package assignment7.firm;

public class Firm {

	public static void main(String[] args) {
		
		System.out.println("Instantiatig objects with different "
				+ "constructors is an example of compile-time polymorphysm");

		System.out.println("Calling inherited methods "
				+ "is an example of run-time polymorphysm");
		

		// *******************************************************

		System.out.println("Testing Employee");

		System.out.println("\nDefault constructor:");
		Employee demp = new Employee();

		System.out.println(demp.getInfo(0));

		System.out.println("\nConstructor with parameters:");
		Employee employee = new Employee("Tad", 30, "+3333333", "programmer", 3000);

		System.out.println("Calling getInfo with matching id:");
		System.out.println(employee.getInfo(20));

		System.out.println("\nCalling getInfo with not matching id:");
		System.out.println(employee.getInfo(0));

		// *******************************************************

		System.out.println("Testing Manager");

		System.out.println("\nDefault constructor:");
		Manager dmgr = new Manager();

		System.out.println(dmgr.getInfo(0));

		System.out.println("\nConstructor with parameters:");
		Manager manager = new Manager("Bob", 30, "+777777775", "programmer", 3000, new String[] {"CS:GO", "Fatal Frame"});

		System.out.println("Calling getInfo with matching id:");
		System.out.println(manager.getInfo(30));

		System.out.println("\nCalling getInfo with not matching id:");
		System.out.println(manager.getInfo(0));
		
		// *******************************************************
		// Example of run time polymorphism 
		
		System.out.print("\n\n\n");
		
		GeneralInfo person;
		
		person = manager;
		
		System.out.println(person.getInfo(30));
		
		System.out.println();
		
		person = employee;
		
		System.out.println(person.getInfo(30));
	}

}
