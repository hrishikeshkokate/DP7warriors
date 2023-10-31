package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringList {
	public static void main(String[] args) {

		List<String> stringList = new ArrayList<>();

		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Orange");
		stringList.add("Grapes");
		stringList.add("Cherry");

		System.out.println("Original ArrayList: " + stringList);

		Collections.sort(stringList);

		System.out.println("Sorted ArrayList: " + stringList);
	}
}
