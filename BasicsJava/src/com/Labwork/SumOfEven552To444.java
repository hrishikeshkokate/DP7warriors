package com.Labwork;

public class SumOfEven552To444 {

	public static void main(String[] args)
	{
		int count = 0;
		int sum = 0;
		for (int i = 552; i >= 444; i--) {
			if (i % 2 == 0) {
				sum = sum + i;
				count++;
			}
		}
		System.out.println("Count is"+count);
		System.out.println("Sum is"+sum);
	}
}
