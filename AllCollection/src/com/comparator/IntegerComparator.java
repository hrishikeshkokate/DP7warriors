package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyIntegerComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return (o2-o1);
	}
	


}

public class IntegerComparator {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<>();
		al.add(7);
		al.add(1);
		al.add(-3);
		al.add(10);
		
//		System.out.println(al);
//		Collections.sort(al);// ascending order
//		
//		System.out.println(al);
		
		System.out.println(al);
		
		Collections.sort(al, new MyIntegerComparator()); // use custom sorting logic on inbuilt classes
				
		System.out.println(al);
		
		
		
		
		
	}

}

