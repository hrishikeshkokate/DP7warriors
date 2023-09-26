package com.staticandfinal;

public class Overloadingstaticmethod {
	public static void myMethod(int x) {
		System.out.println("Static method with int parameter: " + x);
	}

	// This will result in a compilation error because it has the same method
	// signature.
	public static void myMethod(int x,int y) {
		System.out.println("Non-static method with int parameter: " + x);
	}

	public static void main(String[] args) {
		Overloadingstaticmethod.myMethod(10);
	}
}
