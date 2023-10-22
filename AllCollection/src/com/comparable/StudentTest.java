package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	private int id;
	private String name;
	private int marks;
	public Student() {
		super();
		
	}
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void marks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student s) {
		if(this.getMarks()==s.getMarks())
			return 0;
		else
			if(this.getMarks()<s.getMarks())
				return -1;
			else
		
		return 1;
	}
}

public class StudentTest {
	public static void main(String[] args) {
		
		ArrayList<Student> i1=new ArrayList<>();
		
		i1.add(new Student(101,"Anuj",55));
		i1.add(new Student(102,"Suraj",95));
		i1.add(new Student(103,"Hrishi",75));
		i1.add(new Student(104,"Kailash",85));
		
		//System.out.println(i1);
		
		for(Student s:i1)
		{
			System.out.println(s);
			
		}
		System.out.println("----------------------------------------");
		
		Collections.sort(i1);
		for(Student s:i1)
		{
			System.out.println(s);
			
		}
	}
}
