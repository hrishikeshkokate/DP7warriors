package com.arraylist;

import java.util.ArrayList;

class Emp {
	private int id;
	private String name;
	private double sal;

	public Emp(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getSal() {
		return sal;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
}

public class Employeesalary {
	public static void main(String[] args) {
		ArrayList<Emp> empList = new ArrayList<>();

		Emp emp1 = new Emp(1, "Pralay", 5000.0);
		Emp emp2 = new Emp(2, "Anuj", 15000.0);
		Emp emp3 = new Emp(3, "Sachin", 12000.0);
		Emp emp4 = new Emp(4, "Aniket", 8000.0);

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);

		System.out.println("Employees with salary > 10000:");

		// salary greater than 10000
		for (Emp emp : empList) {
			if (emp.getSal() > 10000) {
				System.out.println(emp);
			}
		}

		System.out.println("----------------------------------");
		// whos name is sachin
		for (Emp emp : empList) {
			if (emp.getName().equals("Sachin")) {
				System.out.println("whos name is sachin :" + emp);
			}
		}

		System.out.println("----------------------------------");
		// print Emp who have highest number of salary
		Emp highestSalaryEmp = empList.get(0);

		for (Emp emp : empList) {
			if (emp.getSal() > highestSalaryEmp.getSal()) {
				highestSalaryEmp = emp;
			}
		}

		System.out.println("Employee with the highest salary:");
		System.out.println(highestSalaryEmp);

	}
}
