package com.basics;

import java.util.Arrays;

public class Methodsum {

	static int sumevenarray(int ar[]) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				sum += ar[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println("Sum of even number is :" + sumevenarray(arr));

	}

}
