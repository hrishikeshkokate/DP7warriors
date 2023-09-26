package com.Labwork;

import java.util.Scanner;

public class RepeatedNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		while(num!=0)
		{
			int rem=num%10;
			System.out.println(rem);
			num/=10;
			
		}
		

	}

}
