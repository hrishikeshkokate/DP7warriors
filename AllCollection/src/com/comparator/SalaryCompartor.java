package com.comparator;

import java.util.Comparator;

import com.comparable.Employee;

public class SalaryCompartor implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
	
		return (int) (e1.getSalary()-e2.getSalary());
	}
	

}
