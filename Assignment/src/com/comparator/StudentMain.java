package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
	public static void main(String[] args) {

		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student(1, "Suraj", 14));
		st.add(new Student(9, "Akshay", 23));
		st.add(new Student(7, "Kailash", 65));
		st.add(new Student(2, "Vishal", 31));
		st.add(new Student(4, "Suraj", 23));
		
		
		Collections.sort(st, new NameComparator()); // use custom sorting logic on inbuilt classes
		System.out.println("Age same then sort on name \n");

		for (Student s : st) 
		{
			System.out.println(s);
		}
		
		System.out.println("-------------------------");
		System.out.println("Roll number sorted serially \n");
		Collections.sort(st,new RollNumberComparator());
		for(Student s:st)
		{
			System.out.println(s);
		}
		
		System.out.println("-------------------------");
		System.out.println("Age sorted serially \n");
		Collections.sort(st,new AgeComparator());
		for(Student s:st)
		{
			System.out.println(s);
		}

	}
}
