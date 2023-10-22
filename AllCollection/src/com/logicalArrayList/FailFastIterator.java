package com.logicalArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator {

	public static void main(String[] args) {
		ArrayList<String> i1=new ArrayList<>();
		
		i1.add("Mango");
		i1.add("Apple");
		i1.add("Banana");
		i1.add("Grapes");
		i1.add("Pineapple");
		
		Iterator<String> itr=i1.iterator();
		while(itr.hasNext())
		{
			if(itr.next().equals("Apple"))
				//i1.remove("Apple");//ConcurrentModificationException
			itr.remove();
		}
		System.out.println(i1);

	}

}
