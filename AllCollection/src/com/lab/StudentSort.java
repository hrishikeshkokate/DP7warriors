package com.lab;

import java.util.HashMap;

public class StudentSort {

	public static void main(String[] args) {
		
		HashMap<String, Student> m1=new HashMap<String, Student>();
		
		m1.put("Java", new Student(101,"Anuj",96));
		m1.put("Python", new Student(102,"Pralay",69));
		m1.put("Cpp", new Student(103,"Shivam",82));
		m1.put(".Net", new Student(104,"Kailsh",73));
		m1.put("Angular", new Student(105,"Vishal",55));
		
		System.out.println(m1);
		
		System.out.println("--------------------------------------");
		
		
		

	}

}
