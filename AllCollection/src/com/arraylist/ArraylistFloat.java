package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistFloat {

	public static void main(String[] args) {

		ArrayList<Float> f1 = new ArrayList<>();

		f1.add(56.2f);
		f1.add(96.3f);
		f1.add(83.4f);
		f1.add(75.9f);
		f1.add(49.6f);

		// normal for loop
		for (int i = 0; i < f1.size(); i++) 
		{
			System.out.println(f1.get(i));
		}
		System.out.println("----------");
		// enhance for loop
		for (Float f : f1) 
		{
			System.out.println(f);
		}
		
		System.out.println("----------");
		// Iterator
		Iterator<Float> itr = f1.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----------");
		// List-iterator forward
		ListIterator<Float> it = f1.listIterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		System.out.println("----------");
		//List-iterator backward
		ListIterator<Float> it1 =f1.listIterator(f1.size());
		while(it1.hasPrevious())
		{
			System.out.println(it1.previous());
		}
		

	}

}
