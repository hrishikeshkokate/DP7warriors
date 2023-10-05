package com.arraylab;

import java.util.Arrays;

public class zerofirst {
	static void leftarrange(int arr[]) {
		int arr1[] = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr1[index] = arr[i];
				index++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr1[index] = arr[i];
				index++;
			}
		}
		System.out.println("zero first :"+Arrays.toString(arr1));
	}
	static void rightarrange(int arr[])
	{
		int arr1[] = new int[arr.length];
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr1[index] = arr[i];
				index++;
			}
		}
		System.out.println("zero after :"+Arrays.toString(arr1));
		
	}
	

	public static void main(String[] args) {
		int arr[] = { 2, 4, 1, 3, 0, 9, 0, -7 };
		System.out.println("Before :"+Arrays.toString(arr));
		leftarrange(arr);
		rightarrange(arr);

	}

}
