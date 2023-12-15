package com.designEmployee;

public abstract class Employee {
	
	 String name;
	 int salary;
	 int noOfHours;
	public Employee() {
		super();
		
	}
	public Employee(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	 public abstract void salaryPaid();
	 
	 public abstract void jobRole();
	 
	 public void workingHours()
		{
			noOfHours=8;
		}
	 
	

}
