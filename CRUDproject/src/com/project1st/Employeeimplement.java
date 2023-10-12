package com.project1st;

import java.util.Scanner;

public class Employeeimplement implements Employeedetails {
	Scanner sc=new Scanner(System.in);
	Employee e[]=new Employee[10];
	int id,salary;
	String name,department;
	int count=0;

	@Override
	public void createemployee() {
        System.out.println("Add Employee");
		
		System.out.println("Enter number of Employee you want to Add");
		int a=sc.nextInt();
		
		for(int i=0;i<a;i++)
		{
			System.out.println("Enter Employee id");
			 id=sc.nextInt();
			System.out.println("Enter Employee name");
			name=sc.next();
			System.out.println("Enter Employee salary");
			salary=sc.nextInt();
			System.out.println("Enter Employee department");
			department=sc.next();
			e[count]=new Employee(id,name,salary,department);
			count++;
		}
		System.out.println("Add Employee Sucessfully");
		
	}
		

	@Override
	public void updateemployee() {
		System.out.println("Update Employee");
		  System.out.println("Enter the Employee id you want to Update");
		  int b_id=sc.nextInt();
		  for(int i=0;i<count;i++)
			{
		         if(b_id==e[i].getId() && e[i]!=null)
		         {
		        	 System.out.println("Enter Employee name");
		        	 name=sc.next();
		        	 e[i].setName(name);
		        	 System.out.println("Enter department name");
		        	 department=sc.next();
		        	 e[i].setDepartment(department);
		        	 System.out.println("Enter Employee salary");
		        	 salary=sc.nextInt();
		        	 e[i].setSalary(salary);
		         }
			}
		  System.out.println("Employee Update Sucessfully");
		
	}

	@Override
	public void showemployee() {
		for(int i=0;i<count;i++)
		{
			if(e[i]!=null)
			{
			System.out.println(e[i]);
			}
			
		}
		
	}

	@Override
	public void deleteemployee() {
		System.out.println("Delete Employee");
		  System.out.println("Enter the Employee id you want to delete");
		  int id=sc.nextInt();
		  for(int i=0;i<count;i++)
			{
		         if(id==e[i].getId())
		         {
		        	 e[i]=e[i+1];
		        	 
		        	 
		         }
		         
			}
		  System.out.println("Delete Employee Sucessfully");
		  
	}

	@Override
	public void searchemployee() {
		System.out.println("Search Employee");
		  System.out.println("Enter the Employee id you want to search");
		  int id=sc.nextInt();
		  int flag=0;
		  int i;
		  for( i=0;i<count;i++)
			{
			  
		         if( e[i]!=null && id==e[i].getId())
		         {
		        	 flag=1;
		        	 break;
		
	              }
			  

            }
		  if(flag==1)
		  {
			  System.out.println("Given Employee Available");
			  System.out.println(e[i]);
		  }
		  else
			  System.out.println("Given Employee not available");
	}		
	}


