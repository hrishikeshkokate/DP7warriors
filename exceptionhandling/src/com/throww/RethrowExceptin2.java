package com.throww;

public class RethrowExceptin2 {
	
	static void method1()
	{
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException ex)
		{
			System.out.println("In catch block of method 1");
			throw ex;
		}
	}
	
	public static void main(String[] args) {
		
	
			method1();
			// handled by JVM
	
		
	}
}