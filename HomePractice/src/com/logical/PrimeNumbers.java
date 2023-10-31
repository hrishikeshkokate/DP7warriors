package com.logical;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();

		int sum = 0;
		int count;

		for (int i = 2; i <= num; i++) {
			count = 0;

			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("Sum of prime number :" + sum);
	}
}