package com.hashmap;

import java.util.HashMap;

public class HashMap1To6 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("A", 11);
		hm.put("Z", 99);
		hm.put("H", 55);
		hm.put("R", 24);
		
		HashMap<String, Integer> newhm=new HashMap<String, Integer>(hm);
		
		System.out.println("Copied map :"+newhm);
		
		System.out.println("------------------");
		
		System.out.println(hm.isEmpty());
		
		System.out.println("------------------");
		
		System.out.println(hm.containsKey("B"));
		System.out.println(hm.containsKey("Z"));
		
		System.out.println("------------------");
		
		System.out.println(hm.containsValue(78));
		System.out.println(hm.containsValue(99));
		
		System.out.println("------------------");
		
		System.out.println(hm.remove("R"));
		System.out.println(hm);
	}

}
