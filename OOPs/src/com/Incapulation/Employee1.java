package com.Incapulation;

import java.util.Scanner;

public class Employee1 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter employee id");
		int id=sc.nextInt();
		System.out.println("Enter employee name");
		String name=sc.next();
		System.out.println("Enter the salary");
		float sal=sc.nextFloat();
		Employee e= new Employee();
		
		e.setEmpId(id);
		e.setName(name);
		e.setSalary(sal);
		
		System.out.println(e.getEmpId()+" "+e.getName()+" "+e.getSalary());
		
//ctril+shift+t open any class
		// ctrl o open any method inside it
	}

}
