package com.lab;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		
		
		for(int i=1;i<=num;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		
		

	}

}
