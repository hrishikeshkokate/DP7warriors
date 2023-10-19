package com.methodoverriding;

import java.io.IOException;

class Parent2
{
	int data=50;
	
	//throws checked exception
	
	void printdata() throws IOException
	{
		System.out.println(data);
	}
	
	
}
//child class: overriding: can throw unchecked exception
//
//it can throw : same checked exception,sub type
//not super type

class Child2 extends Parent2
{
	int val=10;
	
	void printdata() throws ArithmeticException,IOException
	//ExceptionUncheckedOverriding2
	{
		if(val==0) 
				throw new ArithmeticException();
		System.out.println(data/val);
		
		//throw new IOException
		
		
	}
	
}
public class CheckedOverriding3 {

	public static void main(String[] args) {
		

	}

}
