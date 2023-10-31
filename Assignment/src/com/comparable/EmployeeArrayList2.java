package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

class Employee3 implements Comparable<Employee3> {
	private String name;
	private String designation;
	private int age;
	private int id; 

	public Employee3(String name, String designation, int age, int id) {
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.id = id;
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

	public int getId() {
		return id;
	}

	@Override
	public int compareTo(Employee3 other) {
		// Compare based on the ID attribute
		if (this.id < other.id) {
			return -1;
		} else if (this.id > other.id) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", designation='" + designation + '\'' + ", age=" + age + ", id="
				+ id + '}';
	}
}

public class EmployeeArrayList2 {
	public static void main(String[] args) {
		ArrayList<Employee3> employeeList = new ArrayList<>();

		// Create and add Employee objects to the ArrayList
		Employee3 employee1 = new Employee3("Aniket", "Manager", 35, 101);
		Employee3 employee2 = new Employee3("Suraj", "Engineer", 28, 102);
		Employee3 employee3 = new Employee3("Kailash", "Designer", 30, 103);

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);

		Collections.sort(employeeList);

		for (Employee3 employee : employeeList) {
			System.out.println(employee);
		}
	}
}
