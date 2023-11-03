package com.comparable;

import java.util.ArrayList;

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
