package com.array;

public class ReplaceNegativesWithLeftSquare {
	public static void replaceNegativesWithLeftSquare(int[] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] < 0) 
			{
				arr[i] = arr[i - 1] * arr[i - 1];
			}
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) 
	{
		int[] arr = { 12, 3, -19, 29, 5, -61, 44, 7, -9 };
		replaceNegativesWithLeftSquare(arr);

		System.out.println("\nArray with negatives replaced:");

	}

}
