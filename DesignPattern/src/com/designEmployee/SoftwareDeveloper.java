package com.designEmployee;

public class SoftwareDeveloper extends Employee {

	public SoftwareDeveloper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SoftwareDeveloper(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void salaryPaid() {
		salary=150000;
		
	}

	@Override
	public void jobRole() {
		System.out.println("Develop new software as per requirement");
		
	}
	

}
