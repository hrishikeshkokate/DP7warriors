package com.linkedlist;

import java.util.LinkedList;

public class RemoveAndReturnFirstElement {
	public static void main(String[] args) {
	
		LinkedList<String> linkedList = new LinkedList<>();

		
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Cherry");
		linkedList.add("Date");

		
		String firstElement = linkedList.poll();

		
		System.out.println("Removed and returned the first element: " + firstElement);
		System.out.println("Modified LinkedList: " + linkedList);
	}
}
