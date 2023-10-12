package com.inner;

interface Doable {
	public void doit();

}

class Car {
	public void drive() {
		System.out.println("I am driving a car");
	}

}

abstract class Cake {
	void doBaking() {
		System.out.println("I am baking a cake ");
	}

}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		//using interface

		Doable d = new Doable() {
			@Override
			public void doit() {
				System.out.println("I am doing homework");
			}
		};

		d.doit();

		// using abstract class

		Cake ck1 = new Cake() {
			void doBaking() {
				System.out.println("I am baking a cake ");
			}

		};
		ck1.doBaking();

	}

}
