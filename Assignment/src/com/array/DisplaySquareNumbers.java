package com.array;

public class DisplaySquareNumbers {
	public static void displaySquareNumbers(int[] arr) 
	{
		for (int num : arr) 
		{
			if (isPerfectSquare(num)) 
			{
				System.out.print(num + " ");
			}
		}
	}

	public static boolean isPerfectSquare(int num) 
	{
		if (num < 0) 
		{
			return false;
		}

		int sqrt = (int) Math.sqrt(num);
		return sqrt * sqrt == num;
	}

	public static void main(String[] args) 
	{
		int[] arr = { 23, 43, 25, 49, 12, 9, 78, 66, 39, 0 };

		System.out.println("Square Numbers in the Array:");
		displaySquareNumbers(arr);
	}

}
