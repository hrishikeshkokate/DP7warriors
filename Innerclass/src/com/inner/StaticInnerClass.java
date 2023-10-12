package com.inner;

class Outer1 {
	static int value = 90;
	int data = 67;

	void display() {
		System.out.println("Outer: " + value);
		System.out.println("Outer: " + data);
	}

	static class Inner1 {
		String msg1 = "Hello";
		static String msg2 = "Welcome";

		void show() {
			System.out.println("Inner: " + value);
			// System.out.println("Inner: "+data);
			// display();

			System.out.println("Inner: " + msg1);
			System.out.println("Inner: " + msg2);

			Outer1 o1 = new Outer1();
			o1.display();
			System.out.println("Inner: " + o1.data);
		}

	}
}

public class StaticInnerClass {

	public static void main(String[] args) {
		
		Outer1.Inner1 i1 = new Outer1.Inner1();
		i1.show();

	}

}
