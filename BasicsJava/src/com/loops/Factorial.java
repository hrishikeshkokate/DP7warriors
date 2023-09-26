package com.loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long fact=1;
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println(fact);

	}

}
