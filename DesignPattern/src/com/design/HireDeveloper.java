package com.design;

import java.util.Scanner;

public class HireDeveloper {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the developer to hire(Java, Python,FullStack):");
		
		String dtype= sc.next();
		
		GetDeveloperType gd= new GetDeveloperType();
		
		Developer d=gd.getDeveloper(dtype);
		
		if(d==null)
		{
			System.out.println("Developer not found.....");
		}
		else
		{
			System.out.println("------------------------------------");
			System.out.println("Enter employee name:");
			
			d.setName(sc.next());
			
			System.out.println("=============================================");
			
			System.out.println("Welcome to our company:"+d.getName());
			d.salaryPaid();
			System.out.println("Salary paid:"+d.salary);
			d.workingHours();
			System.out.println("Number of working hours:"+d.noOfHours);
			
			System.out.println("Skill set:");
			d.skillSet();
			
			System.out.println("============================================");
			
		}
		
	}

}
