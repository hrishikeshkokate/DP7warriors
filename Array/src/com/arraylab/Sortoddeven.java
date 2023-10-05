package com.arraylab;

import java.util.Arrays;

public class Sortoddeven {
	static void sort(int arr[]) {
		int length = arr.length;
		int[] evenArr = new int[length];
		int[] oddArr = new int[length];
		int evenCount = 0;
		int oddCount = 0;
		int mar[] = new int[length];

		for (int num : arr) {
			if (num % 2 == 0) {
				evenArr[evenCount++] = num;
			} else {
				oddArr[oddCount++] = num;
			}
		}
		System.out.println(Arrays.toString(evenArr));
		System.out.println(Arrays.toString(oddArr));
		int i = 0;
		for (int j = 0; j < evenCount; j++) {
			arr[i] = evenArr[j];
			i++;
		}
		for (int j = 0; j < oddCount; j++) {
			arr[i] = oddArr[j];
			i++;
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {

		int arr[] = { 2, 4, 1, 3, 6, 9, 8, 7 };
		sort(arr);

	}

}
