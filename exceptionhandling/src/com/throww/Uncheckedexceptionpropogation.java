package com.throww;

public class Uncheckedexceptionpropogation {
	
	void method1()
	{
		int data=50/0;
	}
	void method2()
	{
		method1();
	}
	void method3()
	{
		try
		{
		method2();
		}
		catch(Exception e)
		{
			System.out.println("In method 3 "+e);
		}
	}

	public static void main(String[] args) {
		
		Uncheckedexceptionpropogation obj1=new Uncheckedexceptionpropogation();
		
		obj1.method3();
		
	}

}
