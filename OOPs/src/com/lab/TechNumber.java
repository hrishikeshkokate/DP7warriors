package com.lab;

import java.util.Scanner;

public class TechNumber {
	public static void main(String args[]) {
		int n, num, firstHalf, secondHalf, digits = 0, squareOfSum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check: ");
		n = sc.nextInt();
		num = n;
		while (num > 0) 
		{
			digits++;
			num = num / 10;
		}
		if (digits % 2 == 0) 
		{
			num = n;
			firstHalf = num % 100;
			secondHalf = num / 100;
			int sum=firstHalf+secondHalf;
			squareOfSum = sum*sum;
			if (n == squareOfSum) 
			{
				System.out.println(n + " is a tech number.");
			} else 
			{
				System.out.println(n + " is not a tech number.");
			}
		} 
		else 
		{
			System.out.println(n + " is not a tech number.");
		}
	}
}
