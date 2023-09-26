package com.lab;

public class AlternatePrimeNumber {

	public static void main(String[] args) {
		int count = 0;
		int number = 10;

		while (count < 10) {
			if (isPrime(number)) {
				System.out.print(number + " ");
				count++;
			}
			number += 2; 
		}
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
