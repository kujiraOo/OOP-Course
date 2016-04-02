package assignment7.firm;

public class Employee extends GeneralInfo {

	protected String job;
	protected double salary;

	public Employee() {
		super();
		job = "not-known";
	}

	public Employee(String name, int id, String phoneNumber, String job,
			double salary) {
		super(name, id, phoneNumber);
		this.job = job;
		this.salary = salary;
	}
	
	public String getInfo(int id) {
		if (this.id == id)
			return generateInfo();
		
		return "Id does not match";
	}

	protected String generateInfo() {
		return super.generateInfo() + "\nJob: " + job + "\nSalary: " + salary;
	}
}
