package com.lab;

import java.util.Scanner;

public class factorial 
{
	static void show(int n)
	{
      long fact=1;
		
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		show(n);
		
		

	}

}
