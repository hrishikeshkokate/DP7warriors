package com.project1st;

import java.util.Scanner;

public class Employeetest {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
   
		
		
		int choice;
		Employeedetails ed=new Employeeimplement();
		
		do
		{
			System.out.println("1] Add Employee.");
			System.out.println("2] Update Employee.");
			System.out.println("3] Show Employee.");
			System.out.println("4] Delete Employee.");
			System.out.println("5] Search Employee by Id.");
			System.out.println("6] Exit.");
			
			System.out.println("_________________________");
			
			System.out.println("Enter your choice :");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				ed.createemployee();
				break;
			case 2:
				ed.updateemployee();
				break;
			case 3:
				ed.showemployee();
				break;
				
			case 4:
				ed.deleteemployee();
				break;
			case 5:
				ed.searchemployee();
				break;
			
			case 6:
				System.exit(0);
			}
			
		}while(true);
		

	}

	}


