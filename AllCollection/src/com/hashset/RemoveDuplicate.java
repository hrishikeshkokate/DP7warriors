package com.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {
public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("Sugar");
		a1.add("Ghee");
		a1.add("Chocolate");
		a1.add("Flour");
		a1.add("Chips");
		a1.add("Sugar");
		
		System.out.println(a1);
		System.out.println("------------------");
		
		
		HashSet<String> hm=new HashSet<>(a1);
		System.out.println(hm);
		
		
}

}
