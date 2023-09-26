package com.containment;

public class Course1 {

	public static void main(String[] args) {
		
		Course c1=new Course(101,"java",5000f);
		Course c2=new Course(102,"python",7000f);
		Course c3=new Course(103,"html",9000f);
		
		Studentcourse s1=new Studentcourse(1,"aniket",c1);
		Studentcourse s2=new Studentcourse(2,"suraj",c2);
		Studentcourse s3=new Studentcourse(3,"pralay",c3);
		Studentcourse s4=new Studentcourse(8,"shivam",c3);
		Studentcourse s5=new Studentcourse(9,"akash",c1);
		Studentcourse s6=new Studentcourse(7,"hrishi",c2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		
		

	}

}
