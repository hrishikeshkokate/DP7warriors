package com.array;

public class SwapArrayElements {
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 9, 0 };

		System.out.println("Original Array:");
		printArray(arr);

		swapArrayElements(arr);

		System.out.println("\nSwapped Array:");
		printArray(arr);
	}
	public static void swapArrayElements(int[] arr) {
		if (arr.length >= 2) {
			// Swap the first two elements with the last two elements
			int temp1 = arr[0];
			int temp2 = arr[1];
			arr[0] = arr[arr.length - 2];
			arr[1] = arr[arr.length - 1];
			arr[arr.length - 2] = temp1;
			arr[arr.length - 1] = temp2;
		}
	}

	

}
