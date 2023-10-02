package com.logical;

import java.util.Scanner;

public class Arm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int orgnum = num;
		int count = 0;

		while (orgnum != 0) {
			count += 1;
			orgnum /= 10;
		}

		int orgnum2 = num;
		int arm = 0;
		while (orgnum2 != 0) {
			int sum = 1;
			int rem = orgnum2 % 10;
			for (int i = 1; i <= count; i++) {
				sum = sum * rem;
			}
			arm = arm + sum;
			orgnum2 /= 10;

		}
		if (arm == num) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not armstrong");
		}

	}
}
