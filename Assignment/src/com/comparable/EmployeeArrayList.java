package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeArrayList {
	public static void main(String[] args) {
		ArrayList<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee("Aniket", "Manager", 35));
		employeeList.add(new Employee("Suraj", "Engineer", 28));
		employeeList.add(new Employee("Kailash", "Designer", 30));

		Collections.sort(employeeList);
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}
