package com.linkedlist;

import java.util.LinkedList;

public class ReplaceElementInLinkedList {
	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Cherry");
		linkedList.add("Date");

		System.out.println("Original LinkedList: " + linkedList);

		String elementToReplace = "Banana";

		String replacementElement = "Grapes";

		int index = linkedList.indexOf(elementToReplace);
		if (index != -1) {
			linkedList.set(index, replacementElement);
			System.out.println("LinkedList after replacement: " + linkedList);
		} else {
			System.out.println("Element not found in the LinkedList.");
		}
	}
}
