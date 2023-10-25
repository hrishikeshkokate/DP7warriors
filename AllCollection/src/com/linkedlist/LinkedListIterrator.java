package com.linkedlist;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterrator {

	public static void main(String[] args) {
		LinkedList<String> a1=new LinkedList<>();
		
		a1.add("Mango");
		a1.add("Cherry");
		a1.add("Banana");
		a1.add("Orange");
		a1.add("Kiwi");
		
		
		
		System.out.println(a1);
		
		//normal for
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
		System.out.println("-----------------------");
		//enhanced for
		
		for( String s:a1)
		{
			System.out.println(s);
		}
		
		System.out.println("-----------------------");
		//iterator
		
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------------");
		//list iterator (forward)
		
		ListIterator<String> list=a1.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		
		System.out.println("-----------------------");
		//list iterator (backward)
		
		ListIterator<String> litr=a1.listIterator(a1.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
		System.out.println("-----------------------");
		//descendingiterator
		
		Iterator<String> itr1=a1.descendingIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		

	}

}
