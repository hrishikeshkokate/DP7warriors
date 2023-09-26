package com.logical;

import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit");
		int num=sc.nextInt();
		int digit=0;
		
		while(num>0)
		{
			int rem=num%10;
			
			if(rem>digit)
			{
				digit=rem;
			}
			num/=10;
		}
		System.out.println(digit);
		

	}

}
