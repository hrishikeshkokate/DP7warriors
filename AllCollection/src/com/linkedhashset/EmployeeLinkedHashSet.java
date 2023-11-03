package com.linkedhashset;

import java.util.LinkedHashSet;

public class EmployeeLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Employee> hs=new LinkedHashSet<Employee>();
		
		hs.add(new Employee(11,"Pralay",55000));
		hs.add(new Employee(12,"Kailash",85000));
		hs.add(new Employee(13,"Suraj",25000));
		hs.add(new Employee(11,"Parlay",55000));
		
		//ovverride equals and hashcode method in employee class
		for(Employee e:hs)
		{
			System.out.println(e);
		}

	}

}
