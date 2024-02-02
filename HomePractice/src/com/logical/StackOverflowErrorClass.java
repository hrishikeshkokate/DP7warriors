package com.logical;
 

public class StackOverflowErrorClass { 
	static int i = 0; 

	
	public static int printNumber(int x) 
	{ 

		i = i + 2; 
		System.out.println(i); 
		return i + printNumber(i + 2); 
	} 

	public static void main(String[] args) 
	{ 
		 
		StackOverflowErrorClass.printNumber(i); 
	} 
} 

