package com.Labwork;

import java.util.*;

public class Factor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		System.out.println("enter the factor");
		int factor = sc.nextInt();

		if (factor > 0) 
		{
			if (num % factor == 0) 
			{
				System.out.println(factor + " is " + num + " factor");
			} 
			else 
			{
				System.out.println(factor + " is not a " + num + " factor");
			}

		} 
		else 
		{
			System.out.println("negative factors NOT ALLOWED");
		}
	}

}
