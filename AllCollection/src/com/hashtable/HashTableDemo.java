package com.hashtable;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht=new Hashtable<>();
		
		//ht.put(null, "Anonymous");no null keys and values are alloweded
		ht.put(1, "Hrishi");
		ht.put(2, "Kailash");
		ht.put(3, "Pralay");
		ht.put(4, "Anuj");
		ht.put(5, "Vishal");
		
		System.out.println(ht);//{5=Vishal, 4=Anuj, 3=Pralay, 2=Kailash, 1=Hrishi}
		System.out.println("----------------");
		
		System.out.println(ht.put(6, "Shivam"));//null
		System.out.println(ht.put(6, "Aniket"));//Shivam
		
		System.out.println(ht);//{6=Aniket, 5=Vishal, 4=Anuj, 3=Pralay, 2=Kailash, 1=Hrishi}
		
		
		
		
		

	}

}
