package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, Student> shm=new HashMap<>();
		
		shm.put(101, new Student(101,"Anuj",90));
		shm.put(107, new Student(107,"Parlay",80));
		shm.put(105, new Student(105,"Kailash",77));
		shm.put(102, new Student(102,"Hrishikesh",83));
		shm.put(103, new Student(103,"SHivam",72));
		
//		for(Map.Entry<Integer, Student> e:shm.entrySet())
//		{
//			System.out.println("Id "+e.getKey());
//			System.out.println("Details "+e.getValue());
//			System.out.println("---------------------------------------");
//		}
		
		for(Map.Entry<Integer, Student> e:shm.entrySet())
		{
			System.out.println("Id "+e.getKey());
			//Student s=e.getValue();
			//System.out.println("Details "+s.getName());
			System.out.println("Details "+e.getValue().getName()+"-->"+e.getValue().getMarks());
			System.out.println("---------------------------------------");
		}
		

	}

}
