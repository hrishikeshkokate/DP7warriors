package com.interfacee;

interface Person {
	default void details() {
		System.out.println("Person can be employee ,worker,celebrity");
	}

}

interface Employee7 extends Person {
	int salary = 35000;

	default void details() {
		System.out.println("Employee salary is :" + salary);
	}
}

interface Celebrity7 extends Person {
	int income = 6000000;

	default void details() {
		System.out.println("Celebrity income is :" + income);
	}
}

class Profession implements Employee7, Celebrity7 {
	public void details() {
		Employee7.super.details();
		Celebrity7.super.details();

	}

}

public class Diamonddemo {

	public static void main(String[] args) {
		Profession p = new Profession();
		p.details();

	}

}
