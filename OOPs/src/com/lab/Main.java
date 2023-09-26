package com.lab;

class ElectronicsDevice {
	private String brand;
	private double price;

	public ElectronicsDevice(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public void displayDetails() {
		System.out.println("Brand: " + brand);
		System.out.println("Price: " + price);
	}
}

class Mobile extends ElectronicsDevice {
	private String model;

	public Mobile(String brand, double price, String model) {
		super(brand, price);
		this.model = model;
	}

	public void displayMobileDetails() {
		System.out.println("Mobile Model: " + model);
		displayDetails();
	}
}

class Pc extends ElectronicsDevice {
	private String screenSize;

	public Pc(String brand, double price, String screenSize) {
		super(brand, price);
		this.screenSize = screenSize;
	}

	public void displayLaptopDetails() {
		System.out.println("Laptop Screen Size: " + screenSize);
		displayDetails();
	}
}

public class Main {
	public static void main(String[] args) {
		Mobile mobile = new Mobile("Samsung", 699.99, "Galaxy S21");
		Pc Pc = new Pc("Dell", 999.99, "15.6 inches");

		System.out.println("Mobile Details:");
		mobile.displayMobileDetails();

		System.out.println("\nLaptop Details:");
		Pc.displayLaptopDetails();
	}
}
