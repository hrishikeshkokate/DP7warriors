package com.polymorphism;

public class TypepromotionAbiguity 
{
	static void display(int n,double n1)
	{
		System.out.println("In method 1");
		System.out.println(n+n1);
	}
	
	static void display(long n3,float n4)
	{
		System.out.println("In method 1");
		System.out.println(n3+n4);
	}

	public static void main(String[] args) {
		
       //display(9,6.8f);
       display(5,6.3);
       
	}

}
