package com.lab;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 500;
		int first = 0;
		int second = 1;

		System.out.println("Fibonacci Series up to " + n + " (excluding multiples of 5):");

		while (first <= n) {
			if (first % 5 != 0) {
				System.out.println(first + " ");
			}

			int next = first + second;
			first = second;
			second = next;
		}
	}
}
