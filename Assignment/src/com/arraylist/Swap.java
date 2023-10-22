package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {

	public static void main(String[] args) 
	{
		ArrayList<Integer> i1=new ArrayList<>();
		
		i1.add(45);
		i1.add(63);
		i1.add(78);
		i1.add(41);
		i1.add(69);
		
		System.out.println(i1);
		
		int temp=i1.get(2);//72 in temp
		i1.set(2, i1.get(4));//69 at index 2
		i1.set(4, temp);//72 at index 4
		
		System.out.println(i1);
		

	}

}
