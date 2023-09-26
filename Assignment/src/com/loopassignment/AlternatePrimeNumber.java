package com.loopassignment;

public class AlternatePrimeNumber {
	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int count = 0; // To keep track of the number of prime numbers found
		int n = 2; // Starting number to check for primality

		int maxCount = 10; // Change this to print a different number of prime numbers

		while (count < maxCount) {
			if (isPrime(n)) {
				if (count % 2 == 0) {
					System.out.println(n);
				}
				count++;
			}
			n++;
		}
	}
}
