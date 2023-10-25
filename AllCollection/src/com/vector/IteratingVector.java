package com.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratingVector {

	public static void main(String[] args) {
		
		Vector<Integer> vl= new Vector<>();
		vl.add(8);
		vl.add(5);
		vl.add(8);
		vl.add(null);
		vl.add(null);
		vl.add(-34);
		vl.add(23);
		
		// 1st way
		System.out.println(vl);
		
		// 2nd way
		
		System.out.println("---------------------------------------------");
		for(int i=0;i<vl.size();i++)
		{
			//System.out.println(vl.get(i));
			System.out.println(vl.elementAt(i));
		}
		
		// 3rd way
		
		System.out.println("---------------------------------------------");
		
		for(Integer i:vl)
		{
			System.out.println(i);
		}
		
		// 4th way

		System.out.println("---------------------------------------------");
		
		Iterator<Integer> itr= vl.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		/// 5th way

		System.out.println("---------------------------------------------");
		
		ListIterator<Integer> litr= vl.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		// 6th way
		

		System.out.println("---------------------------------------------");
		
		Enumeration<Integer> en= vl.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}
}

