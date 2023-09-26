package com.lab;

import java.util.Scanner;

public class MinumumNumber {

	public static void main(String[] args)
	{
      Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int digit=9;
		while(num>0)
		{
         int rem=num%10;
        
         if(digit>rem)
         {
        	 digit=rem;
         }
         num/=10;
		}
		System.out.println(digit);
	}	

	

}
