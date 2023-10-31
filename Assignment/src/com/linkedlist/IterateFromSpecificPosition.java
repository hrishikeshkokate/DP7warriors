package com.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public interface IterateFromSpecificPosition {
	
	public static void main(String[] args) {
		
		LinkedList<String> days = new LinkedList<String>();
		days.add("Sunday");
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		
		int start=2;
		
		ListIterator<String> litr=days.listIterator(start);
		
		while(litr.hasNext())
		{
			String element=litr.next();
			System.out.println(element);
		}
		System.out.println("-------------------");
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
	}

}
