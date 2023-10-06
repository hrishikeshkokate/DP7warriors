package com.objectArray;

import java.util.Arrays;

public class College {
	
	private int id;
	private String name;
	private float marks[];
	

	public College() {
		marks=new float[5];
		
	}


	public College(int id, String name, float[] marks) {
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


	public float[] getMarks() {
		return marks;
	}


	public void setMarks(float marks[]) {
		this.marks = marks;
	}
	


	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) ;
	}


	public static void main(String[] args) {
		
		College st[]=new College[3];
		
		float m1[]= {55.9f,76.3f,83.2f,};
		st[0]=new College(101,"Hrishikesh",m1);
		
		float m2[]= {55.9f,76.3f,83.2f,};
		st[1]=new College(102,"Hrishikesh",m2);
		
		float m3[]= {55.9f,76.3f,83.2f,};
		st[2]=new College();
		st[2].setId(103);
		st[2].setName("pralay");
		st[2].setMarks(m3);
		
		System.out.println("__________________________");
		for(College c:st)
		{
			System.out.println(c);
		}
		
		

	}

}
