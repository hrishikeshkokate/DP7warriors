package com.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Double> lhm=new LinkedHashMap<String, Double>(16,0.75f,true);
		
		lhm.put("Suraj", 59.0);
		lhm.put("Pralay", 55.0);
		lhm.put("Anuj", 86.0);
		lhm.put("Shivam", 73.0);
		lhm.put("Hrishikesh", 95.0);
		lhm.put("Kailash", 66.0);
		
		for(Map.Entry<String, Double> e:lhm.entrySet())
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
		System.out.println("------------------");
		
		System.out.println("Pralay marks :"+lhm.get("Pralay"));
		
		System.out.println("------------------");
		
		for(Map.Entry<String, Double> e:lhm.entrySet())
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
		

	}

}
