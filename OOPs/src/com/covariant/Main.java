package com.covariant;

class Employee1 {
	int id;
	String name;
	int salary;

	Employee1() {

	}

	Employee1(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	static Employee1 display() {
	//using this we will not need to create object in main method
	    //Employee1 display() {
		Employee1 e = new Employee1(101, "Hrishikesh", 720000);
		return e;

	}

	@Override
	public String toString() {
		return "id=" + id + "\nname=" + name + "\nsalary=" + salary;
	}

}

public class Main {

	public static void main(String[] args) {

		//Employee1 e = new Employee1();
		//System.out.println(e.display());
		
		System.out.println(Employee1.display());
		
		

	}

}
