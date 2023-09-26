package com.finalkeyword;

class Person1 {
	private final String name;
	private final int age;

	Person1() {
		this.name = "Hrishi";
		this.age = 23;

	}

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	 public final void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

}

class PersonAdharNo extends Person1 {
	private final String adharNo;

	PersonAdharNo() {
		this.adharNo = "1235-6789-3564";

	}

	public PersonAdharNo(String name, int age, String adharNo) {
		super(name, age);
		this.adharNo = adharNo;
	}

	public String getAdharNo() {
		return adharNo;
	}

}

public class Finalkeyword {
	public static void main(String[] args) {

		PersonAdharNo personWithAdhar = new PersonAdharNo("Hrishikesh", 25, "1234-5678-9012");

		System.out.println("Person Name: " + personWithAdhar.getName());
		System.out.println("Person Age: " + personWithAdhar.getAge());

		System.out.println("Adhar Number: " + personWithAdhar.getAdharNo());
		
		System.out.println("_____________________________");
		personWithAdhar.displayInfo();
	}
}
