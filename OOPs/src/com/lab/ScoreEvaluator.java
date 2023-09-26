package com.lab;

import java.util.Scanner;

public class ScoreEvaluator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the score: ");
		int score = scanner.nextInt();
		scanner.close();

		String result = (score < 40000) ? ((score < 25000) ? "bronze" : "silver")
				: (score < 60000) ? "platinum" : "gold";
		System.out.println(result);
	}
}
