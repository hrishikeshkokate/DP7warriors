package com.cutomexception;

import java.util.Scanner;

public class Outofrange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		try
		{
			int num=sc.nextInt();
			if(num>9999)
			
				throw new OutOfRangeException("Number out of range");
			System.out.println("Number in range");
		}
		catch(OutOfRangeException e)
		{
			System.out.println(e);
		}
	}
}
