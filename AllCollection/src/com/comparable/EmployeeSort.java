package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSort {

	public static void main(String[] args) {
		
		ArrayList<Employee> i1=new ArrayList<>();
		
		i1.add(new Employee(101,"Suraj",55000));
		i1.add(new Employee(102,"Hrishikesh",42000));
		i1.add(new Employee(103,"Kailash",36000));
		i1.add(new Employee(104,"Anuj",25000));
		i1.add(new Employee(105,"Pralay",55000));
		i1.add(new Employee(106,"Vishal",64000));
		
		Collections.sort(i1,Collections.reverseOrder());
		for(Employee e:i1)
		{
			System.out.println(e);
		}
	}
}
