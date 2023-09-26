package com.containment;

import java.util.Scanner;

public class MyCollegeUsingUserInput {
	
	static Scanner sc=new Scanner(System.in);
	
	void enterStudentDetails(Student1 s) {
		System.out.println("Enter Student Id:");
		s.setStudentId(sc.nextInt());
		
		System.out.println("Enter Name:");
		s.setStudentName(sc.next());
		
		s.setCollegeName("TQ");
		
		System.out.println("Enter Course Id:");
	   // s.g
		
		System.out.println("Enter Course Name:");
		//s.getCourse().setcname(sc.next());
		
		System.out.println("Enter Fees:");
		//s.getCourse().setFees(sc.nextFloat());
	}

	public static void main(String[] args) {
		
		MyCollegeUsingUserInput college=new MyCollegeUsingUserInput();
		
		Student s1=new Student();
		Student s2=new Student();
		
		//college.enterStudentDetails(s1);
		//college.enterStudentDetails(s2);
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
