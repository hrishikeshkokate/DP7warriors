package com.LabAssignment;

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Id :" + id + " name :" + name);
	}
}

public class SharedObjectExample3 {
	public static void main(String[] args) {

		Student s1 = new Student(101, "Aniket");

		Thread t1 = new Thread() {
			public void run() {
				s1.display();
			}

		};

		Thread t2 = new Thread() {
			public void run() {
				s1.display();
			}

		};
		t1.start();
		t2.start();

	}
}
