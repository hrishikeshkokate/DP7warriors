package com.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class CourseHashMap {

	public static void main(String[] args) {
		
		HashMap<Student, Course> shm=new HashMap<>();
		
		
		Course c1=new Course(1,"Java",25000);
		Course c2=new Course(2,"Python",28000);
		Course c3=new Course(3,".Net",35000);
		
		shm.put(new Student(101,"Anuj",90),c1);
		shm.put(new Student(102,"Shivam",85),c1);
		shm.put(new Student(103,"Parlay",77),c2);
		shm.put(new Student(104,"Kailash",98),c3);
		
		for(Entry<Student, Course> e:shm.entrySet())
		{
			System.out.println("Student details "+e.getKey());
			System.out.println("Course detail "+e.getValue());
			System.out.println("------------------------------------//.");
		}
		
		
		
		

	}

}
