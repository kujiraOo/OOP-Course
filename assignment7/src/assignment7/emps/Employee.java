package assignment7.emps;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import assignment7.workers.Worker;

public class Employee extends Worker {

	private static final DateFormat df = DateFormat
			.getDateInstance(DateFormat.MEDIUM);

	private Date hireDate;
	private int jobDuration; // months
	private int monthlyWorkHour; // hours

	// default constructor
	public Employee() {

		super();

		hireDate = new Date();
	}

	// constructor without hireDate, hireDate is set to current date
	public Employee(String name, String job, double taxRate, double hourWage,
			int jobDuration, int monthlyWorkHour) {

		super(name, job, taxRate, hourWage);

		this.jobDuration = jobDuration;
		this.monthlyWorkHour = monthlyWorkHour;

		hireDate = new Date();

	}

	// constructor that accepts date object to set hireDate
	public Employee(String name, String job, double taxRate, double hourWage,
			int jobDuration, int monthlyWorkHour, Date hireDate) {

		super(name, job, taxRate, hourWage);

		this.jobDuration = jobDuration;
		this.monthlyWorkHour = monthlyWorkHour;
		this.hireDate = hireDate;
	}

	// constructor that accepts hireDate in year, month, date int format
	public Employee(String name, String job, double taxRate, double hourWage,
			int jobDuration, int monthlyWorkHour, int year, int month, int date) {

		this.name = name;
		this.job = job;
		this.taxRate = taxRate;
		this.hourWage = hourWage;
		this.jobDuration = jobDuration;
		this.monthlyWorkHour = monthlyWorkHour;

		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		hireDate = cal.getTime();
	}

	public double getNetSalary() {

		double grossSalary = hourWage * monthlyWorkHour;

		return grossSalary - grossSalary * taxRate;
	}

	// tax payed in one months
	public double getTotalTax() {

		return hourWage * monthlyWorkHour * taxRate;
	}

	// tax payed in specified amount of months
	public double getTotalTax(int months) {

		return hourWage * monthlyWorkHour * months * taxRate;
	}

	public String toString() {

		return super.toString() + "\nhire date: " + df.format(hireDate)
				+ "\njob duration: " + jobDuration + "\nmonthly work hours: "
				+ monthlyWorkHour + "\nnet salary: " + getNetSalary()
				+ "\ntotal tax: " + getTotalTax();
	}
}
