package com.basics;

import java.util.Arrays;

public class MethodArray {

	static void squarearray(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] = ar[i] * ar[i];
		}
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		// square of each element

		System.out.println("Before :" + Arrays.toString(arr));
		squarearray(arr);

		System.out.println("After :" + Arrays.toString(arr));

	}

}
