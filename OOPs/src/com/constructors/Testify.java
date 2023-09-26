package com.constructors;

public class Testify {
	String name;

	Testify() 
	{

	}

	Testify(String name) {
		this.name = name;
	}

	void display() {
		System.out.println("Hi " + name);
		this.show();
//show();
	}

	void show() {
		System.out.println("Welcome to thinkQuotient:" + name);
	}

	Testify changeName() {
		name = name + "ThinkQ";
		return this;
	}

	public static void main(String[] args) {
		Testify t1 = new Testify("hrishikesh");
		t1.display();
		// t1.show();

		Testify dummy;
		dummy = t1.changeName();

	}
}
