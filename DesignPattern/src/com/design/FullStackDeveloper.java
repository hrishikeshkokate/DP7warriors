package com.design;

import java.util.Arrays;

public class FullStackDeveloper extends Developer {

	public FullStackDeveloper() {

	}

	public FullStackDeveloper(String name) {
		super(name);

	}

	@Override
	public void salaryPaid() {
	
		salary=105000f;
	}

	@Override
	public void skillSet() {
	
		String skills[]= {"Java","Angular","AWS","SQL","Hibernate","React"};
		System.out.println(Arrays.toString(skills));

	}

}
