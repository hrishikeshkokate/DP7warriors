package com.treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo2 {
	
	public static void main(String[] args) {
		
        TreeMap<Integer,String> tmap= new TreeMap<>();
		
		tmap.put(3, "java");
		tmap.put(1, "html");
		tmap.put(8, "C");
		tmap.put(4,"c++");
		tmap.put(6, "Python");
		tmap.put(4, "Angular");
		//tmap.put(null,"Hi"); Null Pointer Exception
		
		System.out.println(tmap);
		// Methods
		// Sorted Map
		System.out.println("First Key:"+tmap.firstKey());
		System.out.println("Last Key:"+tmap.lastKey());
		
		SortedMap<Integer, String>s1=tmap.subMap(3,6);// 3 included // 6 excluded
		System.out.println(s1);
		
		SortedMap<Integer, String>s2=tmap.headMap(3);// entries before 3 and 3 is excluded
		
		System.out.println(s2);
		
        SortedMap<Integer, String>s3=tmap.tailMap(3);// entries after 3 and 3 is included
		
		System.out.println(s3);
		
	
	}
	

}
