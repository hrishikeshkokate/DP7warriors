package com.constructors;

public class EmployeeSalary {

	public static void main(String[] args) 
	{
		Employee e1=new Employee(101,"hrishi","developer",35000);
		
		e1.print();
		System.out.println("________________________");
		
		double sal=e1.getSalary();
		sal=sal+(sal*0.1);
		e1.salary=sal;
		e1.print();
		
		

	}

}
