package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratingHashMap {

	public static void main(String[] args) {

		HashMap<String, Double> hm = new HashMap<>();

		hm.put("Kailash", 89.69);
		hm.put("Hrishikesh", 89.69);
		hm.put("Pralay", 55.6);
		hm.put("Anuj", 89.21);
		hm.put("Vishal", 69.30);

		// 1st way
		System.out.println(hm);

		// 2nd way
		System.out.println("-------------------");

		Set<String> keys = hm.keySet();

		for (String s : keys) 
		{
			System.out.println(s+ "-->" + hm.get(s));
		}

		// 3rd way
		System.out.println("--------------------");
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) 
		{
			String k = itr.next();
			System.out.println(k);
		}

		// 4th way
		System.out.println("--------------------");

		Collection<Double> marks = hm.values();
		for (Double m : marks) 
		{
			System.out.println(m);
		}

		// 5th way
		System.out.println("--------------------");

		Set<Entry<String, Double>> entr1 = hm.entrySet();
		for (Entry<String, Double> e : entr1) 
		{
			System.out.println(e.getKey() + "--->" + e.getValue());
		}

		// 6th way
		System.out.println("--------------------");

		for (Map.Entry<String, Double> e : hm.entrySet()) 
		{
			System.out.println(e.getKey() + "--->" + e.getValue());
		}
	}
}


