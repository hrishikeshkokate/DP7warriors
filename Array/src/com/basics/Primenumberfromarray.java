package com.basics;

public class Primenumberfromarray {

	static int sum = 0;

	static void prime(int num) {

		boolean flag = true;
		if (num > 1) {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				sum = sum + num;
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 6, 7, 9, 11, 12 };

		for (int i = 0; i < arr.length; i++) {
			prime(arr[i]);
		}
		System.out.println("Sum of prime :" + sum);
	}
}
