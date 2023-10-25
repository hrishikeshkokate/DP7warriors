package com.arraylist;

import java.util.ArrayList;
import java.util.List;

//WAP to search the specified collection in this collection
public class SpecifiedCollection {

	public static void main(String[] args) {

		List<String> a1 = new ArrayList<>();
		a1.add("Apple");
		a1.add("Banana");
		a1.add("Cherry");
		a1.add("Date");
		a1.add("Pineapple");
		a1.add("Watermelon");

		List<String> a2 = new ArrayList<>();
		a2.add("Apple");
		a2.add("Banana");
		//a2.add("Guava");
	
		boolean found =a1.containsAll(a2);
		
		if(found)
		{
			System.out.println(a2+":collection is found ");
		}
		else
		{
			System.out.println("Collection is not found");
		}

	}

}
