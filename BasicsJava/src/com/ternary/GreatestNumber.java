package com.ternary;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		System.out.println("Enter third number");
		int num3 = sc.nextInt();
		int max;
		int max1;

		max = (num1 > num2) && (num1 > num3) ? num1 : (num2 > num3) ? num2 : num3;
		System.out.println("greatest number is :" + max);

		max1 = num1 > num2 ? num1 > num3 ? num1 : num3 : num2 > num3 ? num2 : num3;
		System.out.println("greatest number is :" + max1);

		String max3 = num1 > num2 ? num1 > num3 ? num1 + "is greater" : num3 + " is Greatest."
				: num2 > num3 ? num2 + "is greater" : num3 + "is greater";
		System.out.println(max3);

	}

}
