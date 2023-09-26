package com.MethodCalling;

public class PrimeNumberWithMethod {
	static boolean primeNumber(int n) 
	{
		boolean status = true;
		if (n == 0 || n == 1)
		{
			status = false;
		}
		else {
			for (int j = 2; j <= n / 2; j++) {
				if (n % j == 0) {
					status = false;
					break;
				}
			}
		}
		return status;
	}
	public static void main(String[] args) {
		System.out.println("Prime number from 1 to 50");
		boolean status;
      for(int i=1;i<=50;i++)
      {
    	  status=primeNumber(i);
    	  if(status==true)
    	  {
    		  System.out.println(i);
    	  }
      }
	}
}
