package assignment7.workers;

public abstract class Worker {

	protected String name, job;
	protected double taxRate, hourWage;

	public Worker() {
		this.name = "unknown";
		this.job = "unknown";
	}

	public Worker(String name, String job, double taxRate, double hourWage) {
		this.name = name;
		this.job = job;
		this.taxRate = taxRate;
		this.hourWage = hourWage;
	}

	public String toString() {
		return "name: " + name + "\njob: " + job + "\ntax rate: " + taxRate
				+ "\nhour wage: " + hourWage;
	}

	public abstract double getNetSalary();

	public abstract double getTotalTax();
}
