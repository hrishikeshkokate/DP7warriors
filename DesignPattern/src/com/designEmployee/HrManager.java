package com.designEmployee;

public class HrManager extends Employee {

	public HrManager() {

	}

	public HrManager(String name) {
		super(name);

	}

	@Override
	public void salaryPaid() {
		salary = 105000;

	}

	@Override
	public void jobRole() {

		System.out.println("To look after HR department");

	}

}
