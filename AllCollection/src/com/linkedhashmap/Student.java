package com.linkedhashmap;

import java.util.Objects;

public class Student {
	
	private int id;
	private String name;
	private double marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, double marks) {
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public int hashCode()
	{
	    return Objects.hash(id,name,marks);	
		//return Objects.hash(marks);
		//return 1;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		Student s= (Student)obj;
		if(this.id!= s.id)
			return false;
		if(!this.name.equals(s.name))
			return false;
		if(this.marks!=s.marks)
			return false;
		
		return true;
		
	}
		
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, marks, name);
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return id == other.id && Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
//				&& Objects.equals(name, other.name);
//	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	

}
