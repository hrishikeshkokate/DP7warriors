package com.staticandfinal;
/*See if you can access static variable in static method*/

public class MyClass2 {
	static int staticVar = 10;

	public static void main(String[] args) {
		System.out.println("Static Variable in Static Method: " + staticVar);
	}
}
