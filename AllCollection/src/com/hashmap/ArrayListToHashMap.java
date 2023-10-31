package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListToHashMap {
	static void creteMap(ArrayList<String> a1)
	{
		HashMap<String, Integer> h1 = new HashMap<>();

		for (String s : a1) 
		{
			if (h1.containsKey(s)) 
			{
				h1.put(s, h1.get(s) + 1);
			} 
			else
			{
				h1.put(s, 1);
			}
		}
		for (Map.Entry<String, Integer> e : h1.entrySet()) {
			System.out.println(e.getKey() + "-->" + e.getValue());
		}
	}
	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<>();

		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("A");
		a1.add("A");
		a1.add("C");
		a1.add("A");
		a1.add("B");
		
		System.out.println(a1);

		creteMap(a1);
	}
}
