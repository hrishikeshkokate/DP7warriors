package com.cutomexception;

import java.util.Scanner;

public class AgeAccept {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age ");
		int age=sc.nextInt();
		try
		{
			if(age<18)
			{
				throw new InvalidAgeException("Age should be greater than 18");
			}
			System.out.println("You are eligible to vote ");
		}
		catch(Invalidnameexception e)
		{
			System.out.println(e);
		}

	}

}
