package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Votingexception {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the age");
			age = sc.nextInt();

			if (age > 18) {
				System.out.println("You can vote");
			} else {
				System.out.println("You cannot vote");
			}
		} catch (InputMismatchException e) {
			System.out.println(e + " Age enterd was not in number");
		} finally {
			sc.close();
			System.out.println("Thanks for voting......");
		}

	}

}
