package com.lab;

import java.util.Scanner;

public class DigitFrequency {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long number = scanner.nextLong();
		
		for (int i = 0; i <= 9; i++) 
		{
			int frequency = 0;
			long tempNumber = number; 

			while (tempNumber > 0) {
				int lastDigit = (int) (tempNumber % 10);
				if (lastDigit == i) {
					frequency++;
				}
				tempNumber /= 10;
			}
			if(frequency>1)//if zero it will show all digits
			{

			System.out.println("Digit " + i + ": " + frequency);
			}
		}
	}
}
