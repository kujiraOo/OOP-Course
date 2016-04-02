package assignment7.firm;

public abstract class GeneralInfo {

	protected String name, phoneNumber;
	protected int id;

	public GeneralInfo() {
		
		super();

		name = "unknown";
		phoneNumber = "unknown";
	}

	public GeneralInfo(String name, int id, String phoneNumber) {

		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	protected String generateInfo() {

		return "Name: " + name + "\nid: " + id + "\nPhone number: "
				+ phoneNumber;
	}
	
	public abstract String getInfo(int id);
}
