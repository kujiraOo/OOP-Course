package peronalInfo;

public class PersonalInfo {
	private String name, phone;
	private int id;
	public static int objectCounter;

	// constructor with all attributes
	public PersonalInfo(String name, int id, String phone) {
		this.name = name;
		this.id = id;
		this.phone = phone;
		
		objectCounter++;
	}

	// constructor only with name and id
	public PersonalInfo(String name, int id) {
		this.name = name;
		this.id = id;
		this.phone = "unknown";
		
		objectCounter++;
	}

	// default constructor
	public PersonalInfo() {
		this.name = "unknown";
		this.id = 0;
		this.phone = "unknown";
		
		objectCounter++;
	}

	public String toString() {
		return "name: " + name + "\nid: " + id + "\nphone: " + phone;
	}

	PersonalInfo getInfo(int id) {
		if (this.id == id)
			return this;
		else
			return null;
	}

	PersonalInfo getInfo(String name) {
		if (this.name.equals(name))
			return this;
		else
			return null;
	}

	String modifyInfo(int id, String name, String phone) {
		if (this.id == id) {
			this.name = name;
			this.phone = phone;
			return "Personal info was successfully modified";
		} else
			return "Personal info was not modified";
	}
	
	

}
