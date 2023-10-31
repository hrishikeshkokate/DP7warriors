package com.linkedlist;
import java.util.LinkedList;

public class AppendAtEnd {

	public static void main(String[] args) {
		LinkedList<String> days = new LinkedList<String>();
		
		days.add("Sunday");
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		System.out.println("Before :"+days);
		
		String elementtoappend="Date";
		
		days.add(elementtoappend);
		
		System.out.println("After :"+days);

	}

}
