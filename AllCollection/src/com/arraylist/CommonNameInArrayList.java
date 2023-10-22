package com.arraylist;

import java.util.ArrayList;

public class CommonNameInArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> s1 = new ArrayList<>();
		s1.add("Anuj");
		s1.add("Abhishek");
		s1.add("Kailash");
		s1.add("Pralay");
		s1.add("Hrishikesh");
		
		ArrayList<String> s2 = new ArrayList<>();
		s2.add("Shivam");
		s2.add("Hrishikesh");
		s2.add("Kailash");
		s2.add("Akshay");
		s2.add("Vishal");
		
		s1.retainAll(s2);
		
		ArrayList<String> common = new ArrayList<>(s1);
		
		System.out.println("Common name :"+common);
		
		
		
		
		
		

	}

}
