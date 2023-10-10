package com.array;

public class ReplaceZerosWithOnes {

	public static void replaceZerosWithOnes(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = 1;
			}
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34 };

		System.out.println("Original Array:");
		printArray(arr);

		replaceZerosWithOnes(arr);

		System.out.println("\nArray with 0's replaced by 1's:");
		printArray(arr);
	}

}
