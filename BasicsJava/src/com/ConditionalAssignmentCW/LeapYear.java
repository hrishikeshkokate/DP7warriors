package com.ConditionalAssignmentCW;

import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();

		if (year % 4 == 0) {              //true
			if (year % 100 == 0) {        //false
				if (year % 400 == 0) {    //true
					System.out.println("it is a leap year");
				}
				else
				{
					System.out.println("not a leap year");
				}

			}
			else
			{
				System.out.println("leap year");
			}
		} else {
			System.out.println(year + "it is not a leap year");
		}       

	}
}
