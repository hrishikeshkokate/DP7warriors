package com.hashset;

import java.util.HashSet;

public class HahsSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> s1=new HashSet<String>();
		s1.add("Vishal");
		s1.add("Hrishi");
		System.out.println(s1.add("Suraj"));
		s1.add("Kailash");
		s1.add("Pralay");
		s1.add("Shivam");
		System.out.println(s1.add("Suraj"));
		s1.add("Anuj");
		s1.add(null);
		
		System.out.println(s1);
		
		HashSet<String> s2=new HashSet<String>();
		s2.add("Dipti");
		s2.add("Pallavi");
		s2.add("Harshada");
		s2.add("Pralay");
		s2.add("Shivam");
		s2.add("Anuj");
		s2.add(null);
		
		//Mathematical Operation
		
		//union
		
		//difference
		s1.remove(s2);
		System.out.println(s1);
		
		//intersection
		s1.retainAll(s2);
		System.out.println(s1);
		

	}

}
