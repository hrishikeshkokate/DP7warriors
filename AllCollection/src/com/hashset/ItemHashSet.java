package com.hashset;

import java.util.HashSet;

public class ItemHashSet {

	public static void main(String[] args) {
		
		HashSet<Item> hm=new HashSet<Item>();
		
		hm.add(new Item(1,"Sugar",45));
		hm.add(new Item(2,"Ghee",445));
		hm.add(new Item(6,"Chocolate",50));
		hm.add(new Item(4,"Flour",25));
		hm.add(new Item(5,"Chips",15));
		hm.add(new Item(1,"Sugar",45));
		
		for(Item i:hm)
		{
			System.out.println(i);
		}
		
	}

}
