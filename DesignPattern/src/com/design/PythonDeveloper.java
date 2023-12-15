package com.design;

import java.util.Arrays;

public class PythonDeveloper extends Developer {

	public PythonDeveloper() {

	}

	public PythonDeveloper(String name) {
		super(name);

	}

	@Override
	public void salaryPaid() {
	
		salary=45000f;
	}

	@Override
	public void skillSet() {
	
		String skills[]= {"Basics Python","Numpy","Machine Learning"};
		System.out.println(Arrays.toString(skills));

	}

}
