package com.abstracttandinterface;

interface Employee {
	String getName();

	int getEmployeeID();

	double calculateSalary(double hoursWorked);
}

class PartTimeEmployee implements Employee {
	private String name;
	private int employeeID;

	public PartTimeEmployee(String name, int employeeID) {
		this.name = name;
		this.employeeID = employeeID;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getEmployeeID() {
		return employeeID;
	}

	@Override
	public double calculateSalary(double hoursWorked) {
		return 200.0 * hoursWorked;
	}
}

class FullTimeEmployee implements Employee {
	private String name;
	private int employeeID;

	public FullTimeEmployee(String name, int employeeID) {
		this.name = name;
		this.employeeID = employeeID;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getEmployeeID() {
		return employeeID;
	}

	@Override
	public double calculateSalary(double hoursWorked) {
		return 500.0 * hoursWorked;
	}
}

public class CompanyEmployeeTracker {
	public static void main(String[] args) {

		Employee partTimeEmployee = new PartTimeEmployee("John Doe", 101);
		Employee fullTimeEmployee = new FullTimeEmployee("Jane Smith", 102);

		double partTimeSalary = partTimeEmployee.calculateSalary(10); // Part-time employee worked 10 hours
		double fullTimeSalary = fullTimeEmployee.calculateSalary(8); // Full-time employee worked 8 hours

		System.out.println("Part-Time Employee:");
		System.out.println("Name: " + partTimeEmployee.getName());
		System.out.println("Employee ID: " + partTimeEmployee.getEmployeeID());
		System.out.println("Salary: Rs. " + partTimeSalary);

		System.out.println("\nFull-Time Employee:");
		System.out.println("Name: " + fullTimeEmployee.getName());
		System.out.println("Employee ID: " + fullTimeEmployee.getEmployeeID());
		System.out.println("Salary: Rs. " + fullTimeSalary);
	}
}
