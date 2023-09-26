package com.lab;

public class ExtractToOneDigit {
	static int findsum(int n) 
	{
		if (n < 10)
			return n;

		int sum = 0;
		while (n > 0) 
		{
			sum += n % 10;
			n = n / 10;
		}
		return findsum(sum);

	}

	public static void main(String[] args) {
		int n = 12345;
		int result = findsum(n);
		System.out.println("Sum of digit in a number " + n + " till it become a single digit " + result);
	}
}
