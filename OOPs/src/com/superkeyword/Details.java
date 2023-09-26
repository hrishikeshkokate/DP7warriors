package com.superkeyword;

class Person {
	private String name;
	private int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class Student1 extends Person {
	private String studentId;

	Student1(String name, int age, String studentId) {
		super(name, age);

		this.studentId = studentId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("Student ID: " + studentId);
	}
	
}

public class Details {
	public static void main(String[] args) {
		Student1 student = new Student1("Hrishikesh", 20, "12345");

		System.out.println("Student Name: " + student.getName());
		System.out.println("Student Age: " + student.getAge());
		System.out.println("Student ID: " + student.getStudentId());

		student.setName("Aniket");
		student.setAge(21);
		student.setStudentId("67890");

		student.displayInfo();
	}
}
