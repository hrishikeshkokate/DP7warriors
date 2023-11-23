package com.comparable;

class Employee implements Comparable<Employee> {
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

	@Override
	public int compareTo(Employee e) {
		if(this.getAge()==e.getAge())
			return this.getName().compareTo(e.getName());
			else
				if(this.getAge()>e.getAge())
					return 1;
				else
					return -1;
	}
	
	
	
}
