package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

class Employee2 implements Comparable<Employee2> {
	private String name;
	private String designation;
	private int age;
	private int id; // Add an ID field

	public Employee2(String name, String designation, int age, int id) {
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
	public int compareTo(Employee2 other) {
		
		if (this.id < other.id) 
		{
			return -1;
		} 
		else if (this.id > other.id) 
		{
			return 1;
		} 
		else 
		{
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", designation='" + designation + '\'' + ", age=" + age + ", id="
				+ id + '}';
	}
}

public class EmployeeArrayList1 {
	public static void main(String[] args) {
		ArrayList<Employee2> employeeList = new ArrayList<>();

		// Create and add Employee objects to the ArrayList
		Employee2 employee1 = new Employee2("Aniket", "Manager", 35, 101);
		Employee2 employee2 = new Employee2("Suraj", "Engineer", 28, 102);
		Employee2 employee3 = new Employee2("Kailash", "Designer", 30, 103);

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);

		Collections.sort(employeeList);

		for (Employee2 employee : employeeList) {
			System.out.println(employee);
		}
	}
}
