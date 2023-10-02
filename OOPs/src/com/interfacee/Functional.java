package com.interfacee;

// single abstract method only

@FunctionalInterface
interface Showable {
	void display();

}

interface PrintMe {
	void display();

}

class Demoo implements Showable, PrintMe {

	@Override
	public void display() {

		System.out.println("welcome");

	}

}

public class Functional {

	public static void main(String[] args) {

		Demoo d1 = new Demoo();
		d1.display();
	}
}
