package com.switchst;

import java.util.Scanner;

public class ChoosingCourse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Course");
		String course = sc.next();

		switch (course) {
		case "MBA":
			System.out.println("you choose MBA course");
			System.out.print("Enter your percentage : ");
			int per = sc.nextInt();

			switch (per) {
			case 75:
				System.out.println("you got admission for MBA");
				break;
			default:
				System.out.println("Better luck next time");
			}

		case "MCA":
			System.out.println("you choose MCA course");
			System.out.print("Enter your percentage: ");
			int per1 = sc.nextInt();
			switch (per1) {
			case 70:
				System.out.println("you got admission for MCA");
				break;
			default:
				System.out.println("Better luck next time");
			}
			break;
		default:
			System.out.println("you are not eligible");

		}

	}

}
