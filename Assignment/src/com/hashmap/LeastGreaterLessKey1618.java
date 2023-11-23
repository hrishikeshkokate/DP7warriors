package com.hashmap;

import java.util.TreeMap;

public class LeastGreaterLessKey1618 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(4, "Four");
		tm.put(7, "Seven");
		tm.put(11, "E");
		tm.put(2, "Two");
		tm.put(3, "Three");
		
		int key=5;
		
		Integer leastgreater= tm.higherKey(key);
		
	
		if(leastgreater!=null)
		{
			System.out.println("The least key strictly greater than "+key+" is "+leastgreater);
		}
		else
		{
			System.out.println("There is no key strictly greater than "+key);
		}
		
		System.out.println("-------------------------------------------");
		
		Integer leastlesser=tm.lowerKey(key);
		
		if(leastlesser!=null)
		{
			System.out.println("The least key strictly lesser than "+key+" is "+leastlesser);
		}
		else
		{
			System.out.println("There is no key strictly lesser than "+key);
		}
		

	}

}
