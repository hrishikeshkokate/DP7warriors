package com.staticc;

public class Student 
{
	private int id;
	String name;
	float marks;
	static String scName;//first loaded

	
	Student()
	{
		scName="TQ";
	}
	Student(int id, String name,float marks)
	{
		this();
		this.id=id;
		this.name=name;
		this.marks=marks;
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
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public static String getScName() {
		return scName;
	}
	public static void setScName(String scName) {
		Student.scName = scName;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	public static void main(String[] args) 
	{
		Student s1=new Student();
		System.out.println(scName);
		
		Student s2=new Student();
		
		

	}

}
