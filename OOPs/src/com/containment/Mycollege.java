package com.containment;

public class Mycollege {

	public static void main(String[] args) {
		 
		Course c1=new Course();
		c1.setCid(101);
		c1.setCname("Full stack");
		c1.setFees(65000f);
		
       Student s1=new Student();
       s1.setId(222);
       s1.setName("Aniket");
       s1.setAge(23);
       //passing anonymous object inside student object
       //2nd way
       Student s2=new Student();
       s2.setId(5);
       s2.setName("Hrishi");
       s2.setCourse(new Course());
       s2.getCourse().setCid(102);
       s2.getCourse().setCname("java");
       s2.getCourse().setFees(25000f);
       
       System.out.println(s2);
	}

}
