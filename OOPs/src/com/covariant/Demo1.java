package com.covariant;

class Person {
	int id;
	String name;

	Person() {

	}

	Person(int id, String name) {
		this.id = id;
		this.name = name;

	}

	Person showDetails() {
		name = name + "India";
		return this;
	}

	public String display() {
		return "Id" + id + "Name" + name;
	}

}

class Employee extends Person {
	float salary;

	Employee() {

	}

	Employee(int id, String name, float salary) {
		super(id, name);
		this.salary = salary;

	}

	// Person showDetails()
	Employee showDetails() {
		name = name + "ThinkQ";
		salary = salary + 1000;
		return this;
	}

	public String show() {
		return "Id" + id + "Name" + name + "salary" + salary;
	}

}

public class Demo1 {

	public static void main(String[] args) {

		Person ref;
		Employee eref;

		Person p = new Person(101, "Hrishi");
		ref = p.showDetails();
		System.out.println(ref.display());

		Employee e = new Employee(1001, "Suraj", 45000f);
		ref = e.showDetails();
		System.out.println(ref.display());
		// System.out.println(ref.show);

		// Employee e1=new Employee(1002,"raj",55000f);
		// eref=(Employee)e.showDetails();              //casting is done here
		// System.out.println(ref.show);

		Employee e1 = new Employee(1002, "raj", 55000f);
		eref = e1.showDetails();                        // no type casting needed
		System.out.println(eref.show());

	}

}
