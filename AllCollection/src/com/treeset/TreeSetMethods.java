package com.treeset;

import java.util.TreeSet;

public class TreeSetMethods {

	public static void main(String[] args) {
		TreeSet<Integer> ts= new TreeSet<>();
		ts.add(78);
		ts.add(56);
		ts.add(90);
		ts.add(12);
		ts.add(78);
		ts.add(64);
		//ts.add(null);
		// duplicate not allowed
		
		// SortedSet
		System.out.println(ts);
		System.out.println("First:"+ ts.first());
		System.out.println("Last:"+ts.last());
		
		// NavigableSet
		System.out.println("Lower:"+ts.lower(64));
		System.out.println("Floor:"+ts.floor(64));
		
		
		System.out.println("Higher:"+ts.higher(64));
		System.out.println("Ceiling:"+ts.ceiling(64));
		
		///SortedSet
		System.out.println(ts.headSet(64));// 64 is not included
		
		//Navigable Set
		System.out.println(ts.headSet(64, true));
		
		System.out.println(ts.tailSet(64));// 64 is included
		System.out.println(ts.tailSet(64, false));
		
		System.out.println(ts.subSet(12,78));
		System.out.println(ts.subSet(12,true,78,true));
		
	}
}
