package com.ConditionalAssignmentCW;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		double num1=sc.nextDouble();
		
		System.out.println("Enter operation to perform");
		char c=sc.next().charAt(0);
		
		System.out.println("Enter your number");
		double num2=sc.nextDouble();
		
		if(c=='+')
		{
			System.out.println(num1+num2);
		}
		else if(c=='-')
		{
			System.out.println(num1-num2);
		}
		else if(c=='*')
		{
			System.out.println(num1*num2);
		}
		else if(c=='/')
		{
			System.out.println(num1/num2);
		}
		else
		{
			System.out.println("ERROR");
		}
		
sc.close();
	}

}
