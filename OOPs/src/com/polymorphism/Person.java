package com.polymorphism;

public class Person {

	void activity(String name, String relation) {
		System.out.println(name + " is chilling with " + relation);
	}

	void activity(int salary) {
		System.out.println("he is calculating salary");
		System.out.println("his salary is " + salary * 12 + " per year");
		System.out.println("monthly is " + salary);
	}

	void activity(String game, float score) {
		System.out.println("he plays " + game);
		System.out.println("yesterday's score was " + score + " not out");
	}

	String activity(String friendname) {
		return "his friend is " + friendname;
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.activity("Hrishikesh", "Brother");

		Person p2 = new Person();
		p2.activity(55000);

		Person p3 = new Person();
		p3.activity("Cricket", 95);

		Person p4 = new Person();
		System.out.println(p4.activity("Aniket"));

	}

}
