package com.twodarray;

import java.util.Scanner;

public class Demo {
	static void twodarray(int arr[][]) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();	
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size");
		int r = sc.nextInt();
		System.out.println("Enter the column size");
		int c = sc.nextInt();

		int arr[][] = new int[r][c];

		for (int i = 0; i < r; i++) 
		{
			for (int j = 0; j < c; j++) 
			{
				System.out.println("Enter the value");
				arr[i][j] = sc.nextInt();
			}
		}
		twodarray(arr);

	}
}
