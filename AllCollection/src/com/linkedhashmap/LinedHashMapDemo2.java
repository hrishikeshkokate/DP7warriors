package com.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinedHashMapDemo2 {
	
	public static void main(String[] args) {
		
		// access order
		
		LinkedHashMap<String, Double> lhm= new LinkedHashMap<>(16,0.75f,true);
		lhm.put("Suraj", 89.0);
		lhm.put("Harshada", 67.0);
		lhm.put("Pralay", 87.0);
		lhm.put("Priyanka", 90.0);
		lhm.put("Pratiksha", 78.0);
		lhm.put("Shivam", 65.0);
		
		for(Map.Entry<String, Double> e: lhm.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
		System.out.println("Marks of Pralay:"+lhm.get("Pralay"));
		System.out.println("Marks of Shivam:"+lhm.get("Shivam"));
		
		System.out.println("-----------------------------------------------");
		
		for(Map.Entry<String, Double> e: lhm.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
	}

}
