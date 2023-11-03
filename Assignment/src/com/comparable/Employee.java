package com.comparable;

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
