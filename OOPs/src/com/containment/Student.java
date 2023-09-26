package com.containment;

public class Student 
{
	private int Id;
	private String name;
	private int age;
	private Course course;
	
	
	Student()
	{
		
	}
	
	Student(int id,String name,int age,Course course)
	{
		this.Id=id;
		this.name=name;
		this.age=age;
		this.course=course;
		
	}
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}


	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public String toString() {
		return "Id=" + Id + ", name=" + name + ", age=" + age + "";
	}

	public static void main(String[] args) 
	{
		Course c1=new Course();
		Course c2=new Course();
		Course c3=new Course();
		Student s1=new Student(101, "hrishi", 23,c1);
		Student s2=new Student(102, "aniket", 24,c2);
		Student s3=new Student(103, "suraj", 25,c3);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		Student s4=new Student();
		s4.setId(104);
		s4.setName("akash");
		s4.setAge(23);
		s4.setCourse(new Course());
		s4.getCourse().setCid(201);
		s4.getCourse().setCname("java");
		s4.getCourse().setFees(15000f);
		
		System.out.println(s4);
		
		

	}

}
