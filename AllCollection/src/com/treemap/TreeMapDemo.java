package com.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.NavigableSet;

public class TreeMapDemo {

	private static final String NavigableSet = null;

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tmap=new TreeMap<>();
		
		tmap.put(3, "java");
		tmap.put(2, "html");
		tmap.put(5, "c");
		tmap.put(1, "cpp");
		tmap.put(9, "python");
		
		//iterating
		
		System.out.println(tmap);
		
		System.out.println("----------------------");
		
		Set<Integer> keys=tmap.keySet();
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext())
		{
			int key=itr.next();
			System.out.println(key);
		}
		
		System.out.println("----------------------");
		
		for(Map.Entry<Integer, String> e:tmap.entrySet())
		{
			System.out.println(e.getKey()+"--"+e.getValue());
		}
		System.out.println("----------------------");
		
		Set<Entry<Integer, String>> entries=tmap.entrySet();
		
		for(Map.Entry<Integer, String> e:entries)
		{
			System.out.println(e.getKey()+"--"+e.getValue());
		}
		
		System.out.println("----------------------");
		//reverse
		
	    NavigableMap<Integer, String> ns=tmap.descendingMap();
	    
	    for(Map.Entry<Integer, String> e:ns.entrySet())
		{
			System.out.println(e.getKey()+"--"+e.getValue());
		}
	    
	    System.out.println("----------------------");
	    NavigableSet<Integer> ns1=tmap.navigableKeySet();
	    for(Integer i:ns1)
	    {
	    	System.out.println(i+"--"+tmap.get(i));
	    }
	}
}
