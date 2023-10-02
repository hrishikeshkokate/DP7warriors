package com.staticandfinal;

public class VariableSum {

	public static void findSum(int ...numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		System.out.println("Sum of the integers is: " + sum);
	}

	public static void main(String[] args) {

		findSum(1, 2, 3);
		findSum(5, 10, 15, 20);
		findSum(100, -50, 75, 25);
		findSum();
	}
}
