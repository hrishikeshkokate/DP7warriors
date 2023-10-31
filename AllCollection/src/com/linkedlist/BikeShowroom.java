package com.linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class BikeShowroom {

	public static void main(String[] args) {
		
		LinkedList<Bike> b1=new LinkedList<>();
		
		b1.add(new Bike(101,"Aprilla",650000,2023));
		b1.addFirst(new Bike(102,"BMW",850000,2020));
		b1.addFirst(new Bike(103,"Kawasaki",790000,1998));
		b1.addLast(new Bike(104,"Suzuki",530000,2008));
		b1.add(3, new Bike(105,"Apache",30000,2015));
		b1.add(new Bike(106,"Bajaj",50000,2021));
		
		Collections.sort(b1);
		for(Bike b:b1)
		{
			System.out.println(b);
		}
		
		System.out.println("----------------------------------");
		
		Iterator<Bike> itr=b1.iterator();
		while(itr.hasNext())
		{
			if(itr.next().getModelyear()<2010)
			{
				itr.remove();
			}
		}
		for(Bike b:b1)
		{
			System.out.println(b);
		}
	
	}

}
