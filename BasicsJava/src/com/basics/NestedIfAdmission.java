package com.basics;

import java.util.Scanner;

public class NestedIfAdmission {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the percentage");
		double per=sc.nextDouble();
		
		if(per>=65)
		{
			System.out.println("You can take admission in college");
			if(per>=80)
			{
				System.out.println("You can opt for science and commerce stream");
			}
			else
			{
				System.out.println("Can opt for commerce");
			}
		}
		else
		{
			System.out.println("You cannot take admission");
		}		
		
		
		

	}

}
