package com.constructors;

public class Employee 
{
	 int empId;
	 String empName;
	 String designation;
	 double salary;
	
Employee(int empId,String empName,String designation,double salary)	
{
	this.empId=empId;
	this.empName=empName;
	this.designation=designation;
	this.salary=salary;	
}

double getSalary()
{
return salary;	
}
	void print()
	{
		System.out.println("empId:"+empId+" empName:"+empName+" designation: "+designation+" salary: "+salary);
	}	

}
