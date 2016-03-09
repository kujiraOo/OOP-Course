package firm;

public class GeneralInfo {

	protected String name, phoneNumber;
	protected int id;

	public GeneralInfo() {

		name = "unknown";
		phoneNumber = "unknown";
	}

	public GeneralInfo(String name, int id, String phoneNumber) {

		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
	}

	public String getInfo(int id) {
		
		if (this.id == id)
			return generateInfo();
		
		return "Id does not match";
	}
	
	protected String generateInfo() {
		return "Name: " + name + "\nid: " + id + "\nPhone number: "
				+ phoneNumber;
	}

}
