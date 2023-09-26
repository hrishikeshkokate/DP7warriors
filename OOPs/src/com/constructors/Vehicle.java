package com.constructors;

public class Vehicle {
	int id;
	String name;
	double price;

	Vehicle(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	void show() {
		System.out.println("Vehicle id :" + this.id);
		System.out.println("Vehicle price :" + this.price);
		System.out.println("Vehicle name :" + this.name);
		System.out.println();
	}

	void display() {
		System.out.println("Vehicle information");
		System.out.println("_________________");
		this.show();

	}

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(999, "Toyota", 9500000);
		Vehicle v2 = new Vehicle(111, "Tata", 1100000);

		v1.display();
		v2.display();

	}

}
