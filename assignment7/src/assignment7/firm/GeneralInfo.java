package assignment7.firm;

public class GeneralInfo extends Info {

	protected String name, phoneNumber;
	protected int id;

	public GeneralInfo() {
		
		super();

		name = "unknown";
		phoneNumber = "unknown";
	}

	public GeneralInfo(String name, int id, String phoneNumber) {

		super(id);

		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	protected String generateInfo() {

		return "Name: " + name + "\nid: " + id + "\nPhone number: "
				+ phoneNumber;
	}

}
