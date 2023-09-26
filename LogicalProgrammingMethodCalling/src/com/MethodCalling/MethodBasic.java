package com.MethodCalling;

public class MethodBasic {

	 static void factOfNumber(int n) 
	 {
		long fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println(n+ " factorial is = "+fact);
	}
	public static void main(String[] args) 
	{
		factOfNumber(5);
		factOfNumber(7);
	}

	

}
