package com.designEmployee;

import java.util.Scanner;

public class HireEmployee {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the employee to hire (HrManager,SoftwareTester,SoftwareDeveloper) :");
		
		String etype= sc.next();
		
		GetEmployeeType ge=new GetEmployeeType();
		
		Employee e=ge.getEmployee(etype);
		
		if(e==null)
		{
			System.out.println("Employee not found...");
		}
		else
		{
			System.out.println("---------------------------------");
			System.out.println("Enter employee name :");
			e.setName(sc.next());
			
			
			System.out.println("Welcome to our company :"+e.getName());
			
			e.salaryPaid();
			System.out.println("Salary paid:"+e.salary);
			e.workingHours();
			System.out.println("Number of working hours:"+e.noOfHours);
			
			System.out.println("Role :");
			e.jobRole();
			
			System.out.println("============================================");
			
		}
		
		
		

	}

}
