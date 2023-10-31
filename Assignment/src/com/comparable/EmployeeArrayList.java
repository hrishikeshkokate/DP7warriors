package com.comparable;

import java.util.ArrayList;

class Employee {
	private String name;
	private String designation;
	private int age;

	public Employee(String name, String designation, int age) {
		this.name = name;
		this.designation = designation;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", designation='" + designation + '\'' + ", age=" + age + '}';
	}
}

public class EmployeeArrayList {
	public static void main(String[] args) {
		ArrayList<Employee> employeeList = new ArrayList<>();

		Employee employee1 = new Employee("Aniket", "Manager", 35);
		Employee employee2 = new Employee("Suraj", "Engineer", 28);
		Employee employee3 = new Employee("Kailash", "Designer", 30);

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);

		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}
