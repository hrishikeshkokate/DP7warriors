package com.Labwork;

import java.util.Scanner;

public class FiveAndSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number=sc.nextInt();
		
		
		if((number%5==0) && (number%7==0))
		{
			System.out.println(number+ " is divisible by 5 and 7");
		}
		else
		{
			System.out.println(number+ " is not divisible by 5 and 7");
		}
		

	}

}

	


