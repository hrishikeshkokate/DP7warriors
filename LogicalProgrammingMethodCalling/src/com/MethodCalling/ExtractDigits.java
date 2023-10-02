package com.MethodCalling;

public class ExtractDigits {
	static void extractDigits(int num) {
		System.out.println("the digits in " + num + " are");
		while (num != 0) {
			System.out.println(num % 10);
			num = num / 10;
		}
	}

	static void reverseNumber(int num) {

		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + (num % 10);
			num = num / 10;
		}
		System.out.println("the reverse is " + rev);
	}

	static void checkPlaindrome(int num) {
		int original = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + (num % 10);
			num /= 10;
		}
		if (rev == original) {

			System.out.println(rev + " is palindrome");
		} else {
			System.out.println(rev + " is not a palindrome");
		}
	}

	public static void main(String[] args) {
		extractDigits(5678);
		reverseNumber(5678);
		checkPlaindrome(1221);

	}

}
