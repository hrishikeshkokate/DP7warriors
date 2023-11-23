package com.hashmap;

import java.util.HashMap;

public class HashMapWithoutGeneric2 {

	public static void main(String[] args) {

		HashMap hm = new HashMap();

		hm.put("Java", 1);// 0th location
		hm.put("SQL", "Python");// 1st location

		Object value1 = hm.get("Java");
		System.out.println("key1 :" + value1);

		Object value2 = hm.get("SQL");
		System.out.println("SQL :" + value2);

		

	}

}
