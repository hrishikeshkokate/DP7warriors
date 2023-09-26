package com.MethodCalling;

public class MethodBasic2 {

	static long factOfNumber(int n) {
		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		long ans;
		ans = factOfNumber(7);
		System.out.println("the factorial of 7 is " + ans);
		ans = factOfNumber(9);
		System.out.println("the factorial of 9 is " + ans);
		System.out.println("the factorial of 5 is " + factOfNumber(5));

	}

}
