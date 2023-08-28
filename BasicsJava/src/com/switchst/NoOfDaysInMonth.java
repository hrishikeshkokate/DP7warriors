package com.switchst;

import java.util.Scanner;

public class NoOfDaysInMonth {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month name(lower case) :");
		String mName=sc.next();
		
		switch(mName)
		{
		case "janauary":
		case "march":
		case "may":
		case "july":
		case "august":
		case "october":
		case "december":System.out.println("31 days");
		break;
		
		case "april":
		case "june":
		case "september":
		case "november":System.out.println("30 days");
		break;
		
		case "february":System.out.println("Enter the year");
		                int year=sc.nextInt();
		                if((year%400==00)||((year%4==0)&&(year%100!=0)))
		                {
		                	System.out.println(year+" 29 days");
		                }
		                else
		                {
		                	System.out.println(" 28 days");
		                }
		                break;
		 default:System.out.println("Error in input");               
		}
		

	}

}
