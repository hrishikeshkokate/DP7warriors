package com.array;

import java.util.*;

class Squarefromarray {
	static void countSquares(int arr[], int N) 
	{

		for (int i = 0; i < N; i++)
		{
			int square = arr[i] * arr[i];
			for (int j = 0; j < N; j++) 
			{
				if (arr[j] == square) 
				{
					System.out.println(square);
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		int arr[] = { 2, 4, 5, 20, 16 ,23, 43, 25, 49, 12, 9, 78, 66, 39};
		int N = arr.length;
		countSquares(arr, N);
	}
}
