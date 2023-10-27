package com.hashmap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Double> hm = new HashMap<>();

		hm.put("Kailash", 89.69);
		hm.put(null, 0.0);
		hm.put(null, 100.0);
		hm.put("Hrishikesh", 89.69);
		hm.put("Pralay", 55.6);
		hm.put("Anuj", 89.21);
		hm.put("Vishal", 69.30);

		System.out.println(hm.put(null, 100.0));// replace 0 with 100

		System.out.println(hm);// {null=100.0, Pralay=55.6, Anuj=89.21, Vishal=69.3, Kailash=89.69,
								// Hrishikesh=89.69}
		System.out.println(hm.size());// 6

		// get
		System.out.println("Marks of kailash :" + hm.get("Kailash"));// Marks of kailash :89.69

		System.out.println("Hrishikesh :" + hm.containsKey("Hrishikesh"));// Hrishikesh :true
		System.out.println("Kailash :" + hm.containsKey("Kailash"));// Kailash :true

		System.out.println("89.69 " + hm.containsValue(89.69));// 89.69 true

		// putIfAbsent (is key is not present it will channge the value)

		System.out.println(hm.putIfAbsent("Anuj", 89.00));// 89.21

		System.out.println(hm);// {null=100.0, Pralay=55.6, Anuj=89.21, Vishal=69.3, Kailash=89.69,
								// Hrishikesh=89.69}

		System.out.println(hm.putIfAbsent("Pralay", 55.0));// 55.6

		System.out.println(hm);// {null=100.0, Pralay=55.6, Anuj=89.21, Vishal=69.3, Kailash=89.69,
								// Hrishikesh=89.69}

	}

}
