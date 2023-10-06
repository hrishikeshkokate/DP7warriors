package com.objectArray;

import java.util.Scanner;

class Studentt {
	int id;
	String name;
	float marks;

	public Studentt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Studentt(int id, String name, float marks) {
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

public class Schoolgettersetter {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Studentt st[] = new Studentt[5];// Array is created of size 5
		System.out.println(st[0]);// return null object is not created
		for (int i = 0; i < st.length; i++) 
		{
			st[i] = new Studentt();// important statement
			System.out.println("Enter student id :");
			// int id=sc.nextInt();
			// st[i].setid(id)

			st[i].setId(sc.nextInt());

			System.out.println("Enter student name :");
			st[i].setName(sc.next());

			System.out.println("Enter student marks :");
			st[i].setMarks(sc.nextFloat());

		}
		System.out.println("_____________________________________");

		for (Studentt s : st) {
			System.out.println(s);
		}
	}
}
