package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class GenericUsage {

	public static void main(String[] args) {
		List list1=new ArrayList<>();
		
		list1.add(12);
		list1.add("Hrishikesh");
		list1.add(56.2f);
		list1.add('B');
		
		 String str = (String) list1.get(0); // Casting is required
	     int num = (int) list1.get(1); // Casting is required
	     double dbl = (double) list1.get(2); // Casting is required
	     boolean bool = (boolean) list1.get(3); // Casting is required
	     
	     

	}

}
