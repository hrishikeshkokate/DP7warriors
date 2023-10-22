package com.arraylist;

import java.util.ArrayList;

public class IntegerArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> i1=new ArrayList<>();
		
		i1.add(55);
		i1.add(89);
		i1.add(10);
		i1.add(43);
		i1.add(69);
		

		System.out.println(i1.get(4));
	
		System.out.println("------");
		
		i1.set(2, 10);
		System.out.println(i1+":10 at index 2");
		
		ArrayList<Integer> i2=new ArrayList<>();
		
		i2.add(55);
		i2.add(89);
		i2.add(11);
		i2.add(20);
		i2.add(30);
		
		System.out.println("------");
		
		i2.add(44);
		System.out.println(i2+"44 is added");
		
		System.out.println("------");
		
		i2.retainAll(i1);
		System.out.println(i2+":retainAll");
		
		System.out.println("------");
		i2.removeAll(i2);
		System.out.println(i2+":Collection removed");
		
		

	}

}
