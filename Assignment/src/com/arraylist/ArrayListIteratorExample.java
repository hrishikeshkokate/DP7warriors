package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorExample {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		arrayList.add("Date");

		Iterator<String> iterator = arrayList.iterator();

		while (iterator.hasNext()) 
		{
			String element = iterator.next();
			System.out.println(element);
		}
	}
}
