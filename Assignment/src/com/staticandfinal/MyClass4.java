package com.staticandfinal;
/*then static variable in non-static method*/

public class MyClass4 {
	static int staticVar = 10;

	public void nonStaticMethod() {
		System.out.println("Static Variable in Non-Static Method: " + staticVar);
	}

	public static void main(String[] args) {
		MyClass4 obj = new MyClass4();
		obj.nonStaticMethod();
	}
}
