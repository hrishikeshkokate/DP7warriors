package com.lab;

class Company {
	protected String name;

	public Company(String name) {
		this.name = name;
	}

	public void address() {
		System.out.println("Address of " + name +": not specified");
	}
}

class eBay extends Company {
	private String location;

	public eBay(String name, String location) {
		super(name);
		this.location = location;
	}

	@Override
	public void address() {
		System.out.println("Address of " + super.name + ": " + location);
	}
}

public class PrivateLTD {
	public static void main(String[] args) {
		Company c1 = new Company("Think Quotient");
		Company c2 = new eBay("eBay Inc.", "Mumbai, Maharashtra");

		c1.address();
		c2.address();
	}
}
