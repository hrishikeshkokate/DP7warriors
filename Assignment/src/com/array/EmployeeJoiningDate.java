package com.array;

import java.util.ArrayList;
import java.util.List;

class Date {
	int day;
	int month;
	int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
}

class Employee {
	int id;
	String name;
	double salary;
	Date joiningDate;

	public Employee(int id, String name, double salary, Date joiningDate) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}
}

public class EmployeeJoiningDate {
	public static void findEmployeesWithSameJoiningDate(List<Employee> employees) {
		for (int i = 0; i < employees.size(); i++) {
			Employee currentEmployee = employees.get(i);
			boolean hasSameJoiningDate = false;

			for (int j = i + 1; j < employees.size(); j++) {
				Employee otherEmployee = employees.get(j);

				if (isSameDate(currentEmployee.joiningDate, otherEmployee.joiningDate)) {
					hasSameJoiningDate = true;
					break;
				}
			}

			if (hasSameJoiningDate) {
				System.out.println("Employee with the same joining date: " + currentEmployee.name);
			}
		}
	}

	public static boolean isSameDate(Date date1, Date date2) {
		return date1.day == date2.day && date1.month == date2.month && date1.year == date2.year;
	}
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		// Add Employee objects to the array
		employees.add(new Employee(1, "Aniket", 50000, new Date(10, 3, 2022)));
		employees.add(new Employee(2, "Suraj", 55000, new Date(15, 3, 2022)));
		employees.add(new Employee(3, "vishal", 60000, new Date(10, 3, 2022)));
		employees.add(new Employee(4, "pralay", 48000, new Date(20, 4, 2022)));
		employees.add(new Employee(5, "anuj", 52000, new Date(15, 3, 2022)));

		// Find and print employees with the same joining date
		findEmployeesWithSameJoiningDate(employees);
	}

	
}
