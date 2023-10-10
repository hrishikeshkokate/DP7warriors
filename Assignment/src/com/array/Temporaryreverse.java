package com.array;

import java.util.Arrays;

public class Temporaryreverse {
	static void reverse(int arr[])
	{
		int arr1[]=new int[arr.length];
		
		for (int i = arr.length-1; i >= 0; i--) 
		 {  
			arr1[i]=arr[i];
			System.out.println(arr[i]);
	     }
	}

	public static void main(String[] args) {
		int arr[] = {3, 90, 45, 29, 37, 78};
		reverse(arr);

	}
}
