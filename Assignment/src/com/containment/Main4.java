package com.containment;

class Dept {
	private int deptid;
	private String deptname;

	public Dept(int dept_id, String dept_name) {
		this.deptid = dept_id;
		this.deptname = dept_name;
	}

	public int getDeptId() {
		return deptid;
	}

	public String getDeptName() {
		return deptname;
	}
}

class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
}

class Employee {
	private int id;
	private String name;
	private double salary;
	private Dept dept;
	private MyDate mydate;

	public Employee(int id, String name, double salary, Dept dept, MyDate mydate) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.mydate = mydate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Dept getDept() {
		return dept;
	}

	public MyDate getMyDate() {
		return mydate;
	}
}

public class Main4 {
	public static void main(String[] args) {
		Dept department = new Dept(1, "Human Resources");
		MyDate hireDate = new MyDate(15, 9, 2023);
		Employee employee = new Employee(101, "Hrishikesh", 50000.0, department, hireDate);

		System.out.println("Employee ID: " + employee.getId());
		System.out.println("Employee Name: " + employee.getName());
		System.out.println("Employee Salary: " + employee.getSalary());
		System.out.println("Department ID: " + employee.getDept().getDeptId());
		System.out.println("Department Name: " + employee.getDept().getDeptName());
		System.out.println("Hire Date: " + employee.getMyDate().getDay() + "/" + employee.getMyDate().getMonth() + "/"
				+ employee.getMyDate().getYear());
	}
}
