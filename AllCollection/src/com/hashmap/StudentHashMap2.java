package com.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentHashMap2 {

	public static void main(String[] args) {
		HashMap< Student,String> shm=new HashMap<>();
		
		shm.put( new Student(101,"Anuj",90),"Java");
		shm.put( new Student(107,"Parlay",80),"Html");
		shm.put( new Student(105,"Kailash",77),"Python");
		shm.put( new Student(102,"Hrishikesh",83),".Net");
		shm.put( new Student(103,"SHivam",72),"Cpp");
		
//		for(Map.Entry<Integer, Student> e:shm.entrySet())
//		{
//			System.out.println("Id "+e.getKey());
//			System.out.println("Details "+e.getValue());
//			System.out.println("---------------------------------------");
//		}
		
		for(Entry<Student, String> e:shm.entrySet())
		{
			System.out.println("Student detail "+e.getKey());
			System.out.println("Course "+e.getValue());
			System.out.println("---------------------------------------");
		}

	}

}
