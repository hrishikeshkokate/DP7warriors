package com.basics;

public class Secondhighestnumber {
	static void findsecondgreaternum(int arr[], int max, int max1) 
	{
		for (int i : arr) 
		{
			if (i > max) 
			{
				max1 = max;
				max = i;
			} 
			else if (i > max1 && i != max1)
			{
				max1 = i;
			}
		}
		System.out.println("The 2nd highest maximum number is :" + max1);
	}
	static void findsecondlessnum(int arr[], int min, int min1) 
	{
		for (int i : arr) 
		{
			if (i < min) 
			{
				min1 = min;
				min = i;
			} 
			else if (i < min1 && i != min)
			{
				min1 = i;
			}
		}
		System.out.println("The 2nd minimum number is :" + min1);
	}
	public static void main(String[] args) 
	{
		int arr[] = { 1, 3, 4, 8, 7, 6, 9, 22, 55 ,20};

		int max = 0;
		int max1 =0;
		findsecondgreaternum(arr, max, max1);
		
		int min = 55;
		int min1 = 22;
		findsecondlessnum(arr, min, min1);

	}

}
