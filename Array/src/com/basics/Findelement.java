package com.basics;

import java.util.Scanner;

public class Findelement {
	static void findelement(int n, int ar[]) 
	{
		boolean flag = false;
		for (int i = 0; i < ar.length; i++) 
		{
			if (n == ar[i]) 
			{
				flag = true;
				System.out.println(n + " is present in array at position "+i);
			}
		}
		if (flag == false) 
		{
			System.out.println(n + " is not present in array");
		}
	}
	public static void main(String[] args) 
	{
		int arr[] = { 1, 2, 3, 4, 5, 2, 7 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find");
		int n = sc.nextInt();

		findelement(n, arr);
	}
}
