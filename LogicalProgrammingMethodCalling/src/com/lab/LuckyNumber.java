package com.lab;

import java.util.Scanner;

public class LuckyNumber {
	static void lucky(int num, int digit) {
		int count = 0;
		int rem = 0;
		while (num != 0) {
			rem = num % 10;
			if (rem == digit) {
				count++;
			}
			num = num / 10;
		}

		System.out.println(count);
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the car number");
		int num=sc.nextInt();
		System.out.println("Enter the favourite digit");
		int digit=sc.nextInt();
		lucky(num,digit);
		

	}
}
