package com.staticandfinal;

/*non static variable in static method*/
public class MyClass3 {
	int instanceVar = 20;

	public static void main(String[] args) {
		// This will result in a compilation error because you cannot access
		// a non-static variable directly in a static method.
		// System.out.println("Instance Variable in Static Method: " + instanceVar);
	}
}
