package com.containment;

class Address {
	private String city;
	private String state;
	private String country;

	public Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}
}

class Person {
	private String name;
	private String gender;
	private int age;
	private Address address;

	public Person(String name, String gender, int age, Address address) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}
}

public class Main3 {
	public static void main(String[] args) {
		Address personAddress = new Address("Nashik", "Maharashtra", "INDIA");
		Person person = new Person("Hrishikesh", "Male", 30, personAddress);

		System.out.println("Name: " + person.getName());
		System.out.println("Gender: " + person.getGender());
		System.out.println("Age: " + person.getAge());
		System.out.println("_____________________");
		System.out.println("Address: ");
		System.out.println("City: " + person.getAddress().getCity());
		System.out.println("State: " + person.getAddress().getState());
		System.out.println("Country: " + person.getAddress().getCountry());
	}
}
