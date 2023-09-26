package com.staticandfinal;
/*non static variable in non-static method */

public class MyClass5 {
	int instanceVar = 20;

	public void nonStaticMethod() {
		System.out.println("Instance Variable in Non-Static Method: " + instanceVar);
	}

	public static void main(String[] args) {
		MyClass5 obj = new MyClass5();
		obj.nonStaticMethod();
	}
}
