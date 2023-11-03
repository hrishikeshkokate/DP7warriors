package com.treemap;

import java.util.Map;
import java.util.TreeMap;

public class CustomerOrderTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Customer, Order> tmap=new TreeMap<Customer, Order>(new CustomerOrderComparator());
		
		tmap.put(new Customer(1,"Anuj",85987678), new Order(101,"Laptop",45000));
		tmap.put(new Customer(1,"Pralay",75987678), new Order(102,"Mobile",89000));
		tmap.put(new Customer(2,"Kailash",89987678), new Order(103,"Charger",500));
		tmap.put(new Customer(3,"Shivam",93987678), new Order(104,"Headphone",6000));
		tmap.put(new Customer(4,"Vishal",96987678), new Order(105,"Smartwatch",9000));
		tmap.put(new Customer(5,"Suraj",83987678), new Order(106,"Pendrive",350));
		
		for(Map.Entry<Customer, Order> e:tmap.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("-----------------------------------------------------");
		}
		

	}

}
