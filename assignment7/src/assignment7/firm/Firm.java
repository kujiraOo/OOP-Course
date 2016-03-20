package assignment7.firm;

public class Firm {

	public static void main(String[] args) {

		System.out.println("Testing GeneralInfo");

		System.out.println("\nDefault constructor:");
		GeneralInfo dgi = new GeneralInfo();

		System.out.println(dgi.getInfo(0));

		System.out.println("\nConstructor with parameters:");
		GeneralInfo pgi = new GeneralInfo("Sam", 10, "+8649545");

		System.out.println("Calling getInfo with matching id:");
		System.out.println(pgi.getInfo(10));

		System.out.println("\nCalling getInfo with not matching id:");
		System.out.println(pgi.getInfo(0));

		// *******************************************************

		System.out.println("Testing Employee");

		System.out.println("\nDefault constructor:");
		Employee demp = new Employee();

		System.out.println(demp.getInfo(0));

		System.out.println("\nConstructor with parameters:");
		Employee pemp = new Employee("Tad", 20, "+3333333", "programmer", 3000);

		System.out.println("Calling getInfo with matching id:");
		System.out.println(pemp.getInfo(20));

		System.out.println("\nCalling getInfo with not matching id:");
		System.out.println(pemp.getInfo(0));

		// *******************************************************

		System.out.println("Testing Manager");

		System.out.println("\nDefault constructor:");
		Manager dmgr = new Manager();

		System.out.println(dmgr.getInfo(0));

		System.out.println("\nConstructor with parameters:");
		Manager pmgr = new Manager("Bob", 30, "+777777775", "programmer", 3000, new String[] {"CS:GO", "Fatal Frame"});

		System.out.println("Calling getInfo with matching id:");
		System.out.println(pmgr.getInfo(30));

		System.out.println("\nCalling getInfo with not matching id:");
		System.out.println(pmgr.getInfo(0));
	}

}
