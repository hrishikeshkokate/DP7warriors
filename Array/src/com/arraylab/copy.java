package com.arraylab;

import java.util.Arrays;

public class copy {
	static void copypaste(int arr[])
	{
		int arr1[]=new int [arr.length];
		
		
		for (int i = 0; i < arr.length; i++)
		{
			arr1[i]=arr[i];
			
		}
		System.out.println("After :"+Arrays.toString(arr1));
		
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 1, 3, 6, 9, 8, 7 };
		System.out.println("Before :"+Arrays.toString(arr));
		copypaste(arr);

	}

}
