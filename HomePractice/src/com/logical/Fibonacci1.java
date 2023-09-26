package com.logical;

import java.util.Scanner;

public class Fibonacci1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		int a=0;
		int b=1;
		int c;
		
		for(int i=0;i<=num;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
			
		}
		
		

	}

}
