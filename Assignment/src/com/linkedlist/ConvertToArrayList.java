package com.linkedlist;

import java.util.LinkedList;
import java.util.ArrayList;

public class ConvertToArrayList {
	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Cherry");
		linkedList.add("Date");

		ArrayList<String> arrayList = new ArrayList<>(linkedList);

		System.out.println("ArrayList from Linked List: " + arrayList);
	}
}
