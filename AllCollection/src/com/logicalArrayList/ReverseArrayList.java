package com.logicalArrayList;

import java.util.ArrayList;

public class ReverseArrayList {
	static void reverse(ArrayList<String> list)
	{
		for(int i=0,j=list.size()-1;i<list.size()/2;i++,j--)
		{
			String temp=list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
	}

	public static void main(String[] args) {
		
		ArrayList<String> i1=new ArrayList<>();
		
		i1.add("Mango");
		i1.add("Apple");
		i1.add("Banana");
		i1.add("Grapes");
		i1.add("Pineapple");
		
		System.out.println("Befor :"+i1);
		
		reverse(i1);
		System.out.println("After :"+i1);
		

	}

}
