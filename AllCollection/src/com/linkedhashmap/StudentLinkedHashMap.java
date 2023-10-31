package com.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentLinkedHashMap {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Student> shm= new LinkedHashMap<>();
		shm.put(101, new Student(101,"Anuj", 90));
		shm.put(107, new Student(107,"Vishal", 88));
		shm.put(103, new Student(103,"Sahil", 56));
		shm.put(104, new Student(104,"Mira", 87));
		shm.put(105, new Student(105,"Parul", 50));
		

		for(Map.Entry<Integer, Student> e: shm.entrySet())
		{
			System.out.println("Id:"+e.getKey());
			System.out.println("Details:"+e.getValue().getName()+"  "+e.getValue().getMarks());
			System.out.println("---------------------------------------------------");
		}
		
		
	}

}