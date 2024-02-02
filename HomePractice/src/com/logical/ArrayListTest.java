package com.logical;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> names=new ArrayList<String>();
		names.add("neha");
		names.add("anuj");
		names.add("shraddha");
		names.add("shivani");
		names.add("hrishikesh");
		
		Collections.sort(names);
		
		System.out.println(names);
		
		/////////////////////////////
		//Employee list
		ArrayList<Employee>elist=new ArrayList<Employee>();
		elist.add(new Employee(101,"neha",20000));
		elist.add(new Employee(103,"anuj",10000));
		elist.add(new Employee(104,"shivani",22000));
		elist.add(new Employee(102,"leena",15000));
		elist.add(new Employee(103,"anuj",15000));
		elist.add(new Employee(105,"aniket",15000));
		
		Collections.sort(elist);
		
		System.out.println("---list after sort----");
		for(Employee e:elist) {
			System.out.println(e);
		}
//		Collections.sort(elist,new IDCompare());
//		System.out.println("sorted by id");
//		for(Employee e:elist) {
//			System.out.println(e);
//		}
//		Collections.sort(elist,new NameCompare());
//		System.out.println("sorted by name");
//		for(Employee e:elist) {
//			System.out.println(e);
//		}
	}

}
