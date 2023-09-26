package com.polymorphism;

class Room {

	int length;
	int bredth;

	Room() {
		length = 10;
		bredth = 7;
	}

	Room(int length, int bredth) {
		this.length = length;
		this.bredth = bredth;
	}

	Room(int length) {
		this.length = length;
		this.bredth = length;
	}

	void area() {
		System.out.println("Area of room :" + length * bredth);
	}
}

public class Constoverloading {
	public static void main(String[] args) {

		Room r1 = new Room();
		r1.area();

		Room r2 = new Room(9,7);
		r2.area();

		Room r3 = new Room(5,5);
		r3.area();
	}
}
