package com.throww;

import java.util.Scanner;

public class Throwdemo2 {
	static Scanner sc = new Scanner(System.in);

	static void details() {
		System.out.println("Enter the name :");
		String name = sc.next();

		System.out.println("Enter the marks :");
		int marks = sc.nextInt();
		try {
			if (marks < 0) 
			{
				throw new RuntimeException("Marks should be greater then zero");
			}
			else
			{
				if (marks >= 40) 
				{
					System.out.println(name + " has cleard exam with ");
				} 
				else
				{
					System.out.println(name + " is failed");
				}
			}
		}
        catch (Exception e) 
		{
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		details();

	}

}
