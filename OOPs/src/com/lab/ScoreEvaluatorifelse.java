package com.lab;

import java.util.Scanner;

public class ScoreEvaluatorifelse 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the score: ");
		int score = scanner.nextInt();
		scanner.close();

		if (score < 40000) 
		{
			if (score < 25000) 
			{
				System.out.println("brbnze");
			}
			else 
			{
				System.out.println("silver");
			}
		} 
		else if (score < 60000) 
		{
			System.out.println("platinum");
		} 
		else 
		{
			System.out.println("gold");
		}
	}
}
