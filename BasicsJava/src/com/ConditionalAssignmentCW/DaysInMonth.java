package com.ConditionalAssignmentCW;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the month");
		String m=sc.next();
		
		if(m=="february")
		{
			System.out.println(m+"has 28 days");
		}
		else if(m=="april"&&m=="june"&&m=="sepember"&&m=="november")
		{
			System.out.println(m+"has 30 days");
		}
		else if(m=="january" && m=="march" && m=="may" && m=="july" && m=="august" &&m=="october" && m=="december")
		{
			System.out.println(m+" has 31 days");
		}

	}

}
