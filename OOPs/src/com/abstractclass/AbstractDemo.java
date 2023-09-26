package com.abstractclass;

abstract class Bike {
	private int id;
	private String model;
	private float cost;

	static String brandName;

	static {
		brandName = "Honda";
	}

	Bike() {

	}

	public Bike(int id, String model, float cost) {
		super();
		this.id = id;
		this.model = model;
		this.cost = cost;
	}

	public static void setBrandName(String brandName) {
		Bike.brandName = brandName;
	}

	abstract void description();

	static float giveDiscount() {
		return 20f;
	}

	final void display() {
		System.out.println("Brand name " + brandName);
		System.out.println("Discount on all bikes :" + (giveDiscount() + "%"));
		System.out.println("Model " + model);
		System.out.println("id " + id);
		System.out.println("cost " + cost);
	}

	// @Override
	// public String toString() {
	// return "Bike [id=" + id + ", model=" + model + ", cost=" + cost + "]";
	// }

}

class Sportsbike extends Bike {
	private int gear;
	private float speed;

	Sportsbike() {

	}

	public Sportsbike(int id, String model, float cost, int gear, float speed) {
		super(id, model, cost);
		this.gear = gear;
		this.speed = speed;
	}

	void description() {
		System.out.println("This is sports bike ");
		System.out.println("number of gears " + gear);
		System.out.println("Max speed " + speed);

	}
}

public class AbstractDemo {

	public static void main(String[] args) {

		// Bike b=new Bike(101,"Honda1",550000);

		Sportsbike b = new Sportsbike(101, "Honda1", 550000, 6, 300);
		b.display();
		b.description();

	}

}
