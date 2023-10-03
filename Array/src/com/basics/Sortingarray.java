package com.basics;

import java.util.Arrays;

public class Sortingarray {
	static void sortacending(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// swapping
				if (arr[i] > arr[j]) // ">" for acending
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	static void sortdecending(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// swapping
				if (arr[i] < arr[j]) // "<" descending
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 7, 3, 8, 9, 2 };

		System.out.println("Before :" + Arrays.toString(arr));
		System.out.println("_______________________");

		sortacending(arr);
		System.out.println("Acending :" + Arrays.toString(arr));
		sortdecending(arr);
		System.out.println("Decending :" + Arrays.toString(arr));

	}

}
