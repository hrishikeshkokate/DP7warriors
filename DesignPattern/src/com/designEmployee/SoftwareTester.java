package com.designEmployee;

public class SoftwareTester extends Employee {

	public SoftwareTester() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SoftwareTester(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void salaryPaid() {
		salary=95000;
		
	}

	@Override
	public void jobRole() {
		System.out.println("Test software developed by developer");
		
	}
	

}
