package com.staticandfinal;
/*Static variable and Non-Static (Instance Variable) 
   – Just declare and print it*/
public class MyClass1 {
	static int staticVar = 10;
	int instanceVar = 20;

	public static void main(String[] args) {
		System.out.println("Static Variable: " + staticVar);
		MyClass1 obj = new MyClass1();
		System.out.println("Instance Variable: " + obj.instanceVar);
	}
}
