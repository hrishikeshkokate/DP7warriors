package com.inheritance;

class Vehicle {
	protected String type;
	protected int noOfWheels;

	public Vehicle() {

	}

	public Vehicle(String type, int noOfWheels) {
		super();
		this.type = type;
		this.noOfWheels = noOfWheels;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String toString() {
		return "\ntype=" + type + ", \nnoOfWheels=" + noOfWheels;
	}

}

class Car extends Vehicle {
	protected String cname;
	protected int cprice;
	protected String cbrand;

	public Car() {
		super();

	}

	public Car(String type, int noOfWheels, String cname, int cprice, String cbrand) {
		super(type, noOfWheels);
		this.cname = cname;
		this.cprice = cprice;
		this.cbrand = cbrand;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCPrice() {
		return cprice;
	}

	public void setCPrice(int cprice) {
		this.cprice = cprice;
	}

	public String getCBrand() {
		return cbrand;
	}

	public void setCBrand(String brand) {
		this.cbrand = cbrand;
	}

	public String toString() {
		return "\ncname=" + cname + " \nprice=" + cprice + " \nbrand=" + cbrand + "\ntype=" + type + "\nnoOfWheels="
				+ noOfWheels;
	}
}

class Supercar extends Car {
	protected int speed;
	protected int mileage;

	public Supercar() {
		super();

	}

	public Supercar(int speed, int mileage, String type, int noOfWheels, String cname, int cprice, String cbrand) {
		super(type, noOfWheels, cname, cprice, cbrand);
		this.mileage = mileage;
		this.speed = speed;

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String toString() {
		return "speed=" + speed + "\nmileage=" + mileage + "\ncname=" + cname + " \nprice=" + cprice + " \nbrand="
				+ cbrand + "\ntype=" + type + "\nnoOfWheels=" + noOfWheels;
	}

}

public class Showroom {
	public static void main(String[] args) {
		Supercar c1 = new Supercar();
		c1.setCname("Fortuner");
		c1.setCPrice(6500000);
		c1.setCBrand("Toyota");
		c1.setNoOfWheels(4);
		c1.setType("offroad");
		c1.setMileage(10);
		c1.setSpeed(400);

		System.out.println(c1);

	}
}
