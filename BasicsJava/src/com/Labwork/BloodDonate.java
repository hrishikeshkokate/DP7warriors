package com.Labwork;
import java.util.Scanner;
public class BloodDonate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		System.out.println("Enter your weight");
		int weight=sc.nextInt();
		
		if(age>=18)
		{
			if(weight>=70)
			{
				System.out.println("you are eligible to donate blood");
			}
			else
			{
				System.out.println("you are under weight");
			}
		}
		else
		{
			System.out.println("you are under age");
		}
		
	}

}
