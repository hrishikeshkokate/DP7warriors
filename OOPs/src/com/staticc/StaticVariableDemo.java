package com.staticc;

public class StaticVariableDemo {
	int x=10;
	static int y=20;
	
	void instanceMethod()
	{
		System.out.println(x);
		System.out.println(y);
	}
//we can only static variable in static method
	//no need to create object
	static void staticMethod()
	{
		//system.out.println(x); complie error
		System.out.println(y);
	}
	public static void main(String[] args) {
		
		StaticVariableDemo s1= new StaticVariableDemo();
		s1.instanceMethod();
		
		staticMethod();
		
	}

}
