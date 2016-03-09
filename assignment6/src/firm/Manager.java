package firm;

import java.util.Arrays;

public class Manager extends Employee {
	
	private String[] projects;

	public Manager() {
		super();
		projects = new String[] {"no projects"};
	}

	public Manager(String name, int id, String phoneNumber, String job,
			double salary, String[] projects) {
		super(name, id, phoneNumber, job, salary);
		this.projects = projects;
	}
	
	protected String generateInfo() {
		return super.generateInfo() + "\nProjects: " + Arrays.toString(projects);
	}
}
