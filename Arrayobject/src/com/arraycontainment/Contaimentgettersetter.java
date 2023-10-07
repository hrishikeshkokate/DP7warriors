package com.arraycontainment;

import java.util.Scanner;

public class Contaimentgettersetter {
	static Scanner sc=new Scanner(System.in);
	static void display(Student stu)
	{
		Student s=new Student();
		//1st way
//		System.out.println("Enter student id :");
//		stu.setId(sc.nextInt());
//		
//		System.out.println("Enter student name :");
//		stu.setSname(sc.next());
//		
//		Course c=new Course();
//		
//		System.out.println("Enter course id :");
//		c.setId(sc.nextInt());
//		
//		System.out.println("Enter course name :");
//		c.setCoursename(sc.next());
//		
//		System.out.println("Enter course fees :");
//		c.setFees(sc.nextInt());
//		
//		s.setCourse(c);
		
		//2nd way
		
		s.setCourse(new Course());
		System.out.println("Enter course id :");
		s.getCourse().setId(sc.nextInt());
		
		System.out.println("Enter course name :");
		s.getCourse().setCoursename(sc.next());
		
		System.out.println("Enter course fees :");
		s.getCourse().setFees(sc.nextInt());
	}
	
	static void printdetails(Student st[])
	{
		for(Student s:st)
		{
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		

	}

}
