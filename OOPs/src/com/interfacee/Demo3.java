package com.interfacee;

interface Movable {
	void move();

}

interface Printable extends Movable {
	void printme(String name);

}

class Car implements Printable {

	@Override
	public void move() {
		System.out.println("Car is moving with the speed of 100km/hr");

	}

	@Override
	public void printme(String name) {
		System.out.println("My car name is " + name);

	}

}

public class Demo3 {

	public static void main(String[] args) {

		Movable m;
		m = new Car();
		m.move();
		
		Car c=new Car();
		c.move();
		c.printme("BMW");

	}

}
