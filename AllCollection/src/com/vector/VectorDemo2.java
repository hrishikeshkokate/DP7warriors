package com.vector;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		
		Vector<String> lang= new Vector<>(5,2);
		
		System.out.println(lang.capacity());
		System.out.println(lang.size());
		
		lang.add("C");
		lang.add("Java");
		lang.add("Python");
		lang.add("Angular");
		lang.add(".net");
		
		System.out.println(lang.capacity());
		System.out.println(lang.size());
		
		lang.add("C++");
		
		System.out.println("---------------------------------------");
		
		System.out.println(lang.capacity()); // doubles 
		System.out.println(lang.size());
		
		
		
		
		
		
		
	}
	
}
