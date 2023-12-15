package com.design;

import java.util.Arrays;

public class JavaDeveloper extends Developer {

	public JavaDeveloper() {

	}

	public JavaDeveloper(String name) {
		super(name);

	}

	@Override
	public void salaryPaid() {
	
		salary=75000f;
	}

	@Override
	public void skillSet() {
	
		String skills[]= {"Core Java","SQL","JDBC"};
		System.out.println(Arrays.toString(skills));

	}

}
