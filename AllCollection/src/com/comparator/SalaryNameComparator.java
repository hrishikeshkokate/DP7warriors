package com.comparator;

import java.util.Comparator;

import com.comparable.Employee;

public class SalaryNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
	
		if(e1.getSalary()==e2.getSalary())
			return e1.getName().compareTo(e2.getName());
		else
			if(e1.getSalary()>e1.getSalary())
				return -1;
			else
				return 1;
	}
	

}
