package com.arraylab;

import java.util.Scanner;

public class Pallindrome {

	static void checkpalindrome(String s) {
		
		String reverse ="";
		String original = s;
		
		for (int i = original.length() - 1; i >= 0; i--) 
		{
			reverse = reverse + original.charAt(i);
		}
		if (original.equals(reverse)) 
		{
			System.out.println("It is palindrome");
		} 
		else 
		{
			System.out.println("It is not palindrome");
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String s = sc.next();

		checkpalindrome(s);

	}
}
