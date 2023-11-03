package com.treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.treemap.MarksComparator;


public class StudentTreeMap {
	public static void sortmarks(HashMap<Student,String> hm)
	{
		TreeMap<Student, String> tm = new TreeMap<>(new MarksComparator());
		tm.putAll(hm); 

		
		for(Map.Entry<Student,String> e:tm.entrySet())
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
	}
	public static void main(String[] args) {
		
		HashMap< Student,String> shm=new HashMap<>();
		
		shm.put( new Student(101,"Anuj",90),"java");
		shm.put( new Student(107,"Parlay",80),"python");
		shm.put( new Student(105,"Kailash",77),"c");
		shm.put( new Student(102,"Hrishikesh",83),"cpp");
		shm.put( new Student(103,"SHivam",72),".net");
		

		
		for(Map.Entry< Student,String> e:shm.entrySet())
		{
			System.out.println("Id "+e.getKey());
			System.out.println("Details "+e.getValue());
			System.out.println("---------------------------------------");
		}
		
		System.out.println("==============================================");
		
		sortmarks(shm);
		

	}

}
