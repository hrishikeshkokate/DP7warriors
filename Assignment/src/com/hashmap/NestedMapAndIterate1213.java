package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class NestedMapAndIterate1213 {

	public static void main(String[] args) {

		HashMap<String, Map<String, Integer>> outermap=new HashMap<String, Map<String,Integer>>();
		HashMap<String, Integer> innermap=new HashMap<String, Integer>();
		
		innermap.put("Hrishikesh", 24);
		
		outermap.put("Kokate", innermap);
		
		System.out.println(innermap);
		
		System.out.println("--------------------");
		
		System.out.println(outermap);
		
		System.out.println("--------------------");
		
		Map<String, Integer> nmap=outermap.get("Kokate");
		for(Map.Entry<String, Integer> e1:nmap.entrySet())
		{
			System.out.println(e1.getKey()+"-->"+e1.getValue());
		}

	}

}
