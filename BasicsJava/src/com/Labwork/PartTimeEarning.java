package com.Labwork;

import java.util.Scanner;

public class PartTimeEarning {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of hours worked per day");
		int num=sc.nextInt();
		
		if(num<=24)
		{
			System.out.println("earning will be "+((num*100)*365));
		}
		

	}

}
