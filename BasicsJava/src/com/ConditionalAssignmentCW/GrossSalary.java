package com.ConditionalAssignmentCW;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the basic salary");
	double salary=sc.nextDouble();
	
	if(salary<=10000)
	{
		System.out.println("Gross salary is"+(salary+(salary*0.20)+(salary*0.80)));
	}
	else if(salary<=20000)
	{
		System.out.println("Gross salary is"+(salary+(salary*0.25)+(salary*0.90)));
	}
	else
	{
		System.out.println("Gross salary is"+(salary+(salary*0.30)+(salary*0.95)));
	}

	}

}
