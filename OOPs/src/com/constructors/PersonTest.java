package com.constructors;

class Person {
	private int id;
	private String name;
	private int age;

	public Person() {
		id = 100;
		name = "hrishi";
		age = 24;

	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class PersonTest {
	public static void main(String[] args) {

		Person p = new Person();
		System.out.println(p);
	}
}