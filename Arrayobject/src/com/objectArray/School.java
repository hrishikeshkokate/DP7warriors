package com.objectArray;
class Student{
	int id;
	String name;
	float marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, float marks) {
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
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
public class School {

	public static void main(String[] args) {
		
		Student st[]=new Student[5];//Array is created of size 5
		System.out.println(st[0]);//return null object is not created
		
		st[0]=new Student(1,"Hrishikesh",78.6f);
		st[1]=new Student(2,"Aniket",88.2f);
		st[2]=new Student(3,"Suraj",99.1f);
		st[3]=new Student(4,"Kailash",54.3f);
		st[4]=new Student(5,"Pralay",65.6f);
		//st[5]=new Student(5,"Pralay",65.6f);//ArrayIndexOutOfBound
		                                      //Exception
		for(Student s:st)
		{
			System.out.println(s);
		}
		System.out.println("_______________________________________");
		
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		

	}

}
