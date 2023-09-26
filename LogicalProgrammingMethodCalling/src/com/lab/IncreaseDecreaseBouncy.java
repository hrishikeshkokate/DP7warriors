package com.lab;

import java.util.Scanner;

public class IncreaseDecreaseBouncy 
{
	// To check if a number is increasing
		 static boolean Inreasing(int num) {
			int rem1 = num % 10;
			//num /= 10;

			while (num > 0) {
				int rem2 = num % 10;
				if (rem2 > rem1) {
					return false;
				}
				rem1 = rem2;
				num /= 10;
			}

			return true;
		}

		// To check if a number is decreasing
		 static boolean Decresing(int num) {
			int rem1 = num % 10;
			//num /= 10;

			while (num > 0) {
				int rem2 = num % 10;
				if (rem2 < rem1) {
					return false;
				}
				rem1 = rem2;
				num /= 10;
			}

			return true;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int num = sc.nextInt();

			if (Inreasing(num)) {
				System.out.println(num + " is an increasing number.");
			} else if (Decresing(num)) {
				System.out.println(num + " is a decreasing number.");
			} else {
				System.out.println(num + " is a bouncy number.");
			}
			sc.close();
		}
	}


