package com.throww;

public class Checkedexceptionpropogation2 {
	void method1() 
	{
		try
		{
			throw new ClassNotFoundException("Class error");
		}
		catch(Exception e)
		{
			System.out.println("In method 1"+e);
		}
	}
	void method2()
	{
		method1();
	}
	void method3()
	{
		
		method2();
	
	}

	public static void main(String[] args) {
		
		Checkedexceptionpropogation2 obj1=new Checkedexceptionpropogation2();
		
		obj1.method3();
		
	}

}
