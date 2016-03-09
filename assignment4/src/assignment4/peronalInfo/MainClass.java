package assignment4.peronalInfo;

public class MainClass {
	public static void main(String[] args) {

		// defining array to hold 5 PersonalInfo objects
		PersonalInfo[] personalInfos = new PersonalInfo[5];

		// initializing 5 different PersonalInfo objects using different
		// constructors
		generateObject(personalInfos, 0, "Jack", 1, "112");
		generateObject(personalInfos, 1);
		generateObject(personalInfos, 2, "Zhihao", 2);
		generateObject(personalInfos, 3, "Kim Gordon", 3, "777 7777");
		generateObject(personalInfos, 4, "Bob The Bob", 4, "123 4567");
	}

	// uses PersonalInfo constructor with full set of arguments
	private static void generateObject(PersonalInfo[] p, int i, String name,
			int id, String phone) {
		p[i] = new PersonalInfo(name, id, phone);

		System.out.println("There are " + PersonalInfo.objectCounter
				+ " PersonalInfo objects");
	}

	// uses PersonalInfo constructor with name and id arguments only
	private static void generateObject(PersonalInfo[] p, int i, String name,
			int id) {
		p[i] = new PersonalInfo(name, id);

		System.out.println("There are " + PersonalInfo.objectCounter
				+ " PersonalInfo objects");
	}

	// uses default PersonalInfo constructor
	private static void generateObject(PersonalInfo[] p, int i) {
		p[i] = new PersonalInfo();

		System.out.println("There are " + PersonalInfo.objectCounter
				+ " PersonalInfo objects");
	}
}
