package com.constructors;

public class ConstructorChaining 
{
	ConstructorChaining()
	{
		System.out.println("learn coding");
	}
	
	ConstructorChaining(int a)
	{
		this();
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		ConstructorChaining c=new ConstructorChaining(100);

	}

}
