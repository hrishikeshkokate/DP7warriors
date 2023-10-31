package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentHashMapLogical {

	static void createCountMap(HashMap<Student, String> hm) 
	{
		HashMap<String, Integer> h1 = new HashMap<>();

//		int count;

		for (Map.Entry<Student, String> e : hm.entrySet())
		{
			String course = e.getValue();
			if (h1.containsKey(course))
			{
//				count= h1.get(course);
//				count=count+1;
				h1.put(course, h1.get(course) + 1);
			} 
			else 
			{
				h1.put(course, 1);
			}
		}
		/////////////////

		for (Map.Entry<String, Integer> e : h1.entrySet()) {
			System.out.println(e.getKey() + "------->" + e.getValue());
		}
	}

	static void courseNameMap(HashMap<Student, String> hm) {
		HashMap<String, ArrayList<String>> h1 = new HashMap<>();

		ArrayList<String> names;

		for (Map.Entry<Student, String> e : hm.entrySet()) 
		{
			String course = e.getValue();
			if (h1.containsKey(course))
			{
				names = h1.get(course);
				// names.add(e.getKey().getName());
				// h1.put(course, names);
			} 
			else
			{
				names = new ArrayList<>();
				// names.add(e.getKey().getName());
				// h1.put(course, names);
			}
			names.add(e.getKey().getName());
			h1.put(course, names);
		}

		for (Map.Entry<String, ArrayList<String>> e : h1.entrySet()) 
		{
			System.out.println(e.getKey());
			System.out.println("--------------------");
			for (String s : e.getValue())
			{
				System.out.println(s);
			}
			System.out.println("--------------------");
		}
	}

	static void courseStudentMap(HashMap<Student, String> hm) {
		HashMap<String, ArrayList<Student>> h1 = new HashMap<>();

		ArrayList<Student> studs;

		for (Map.Entry<Student, String> e : hm.entrySet()) {
			String course = e.getValue();
			if (h1.containsKey(course)) 
			{
				studs = h1.get(course);
			} 
			else 
			{
				studs = new ArrayList<>();
			}
			studs.add(e.getKey());
			h1.put(course, studs);
		}

		for (Entry<String, ArrayList<Student>> e : h1.entrySet()) 
		{
			System.out.println(e.getKey());
			System.out.println("--------------------");
			for (Student s : e.getValue()) 
			{
				System.out.println(s);
			}
			System.out.println("--------------------");
		}
	}

	public static void main(String[] args) {

		HashMap<Student, String> shm = new HashMap<>();

		shm.put(new Student(101, "Anuj", 90), "Java");
		shm.put(new Student(105, "Shivam", 89), "Python");
		shm.put(new Student(106, "Suraj", 56), "Java");
		shm.put(new Student(102, "Pawan", 70), ".net");
		System.out.println("Old data: " + shm.put(new Student(104, "Akash", 88), ".net"));
		shm.put(new Student(103, "Pralay", 92), "Python");

		for (Entry<Student, String> e : shm.entrySet()) {
			System.out.println("Id: " + e.getKey());

			System.out.println("Details: " + e.getValue());
			System.out.println("------------------------------------------------------");
		}

		System.out.println("---------------------------------------------------------");

		createCountMap(shm);

		System.out.println("---------------------------------------------------------");

		courseNameMap(shm);
		
		System.out.println("---------------------------------------------------------");
		courseStudentMap(shm);
	}

}
