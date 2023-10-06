package com.objectArray;

import java.util.Scanner;

class Studenttt {
	int id;
	String name;
	float marks;

	public Studenttt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Studenttt(int id, String name, float marks) {
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

public class Schoolgettersetter2 
{
	static Scanner sc = new Scanner(System.in);

	static void display(Studenttt s)
	{
		System.out.println("Enter student id :");
		s.setId(sc.nextInt());

		System.out.println("Enter student name :");
		s.setName(sc.next());

		System.out.println("Enter student marks :");
		s.setMarks(sc.nextFloat());
	}

	static void printdetails(Studenttt str[]) 
	{
		System.out.println("_____________________________");
		for (Studenttt s : str) 
		{
			System.out.println(s);
		}
	}

	public static void main(String[] args) 
	{

		Studenttt st[] = new Studenttt[2];// Array is created of size 5

		for (int i = 0; i < st.length; i++) 
		{
			st[i] = new Studenttt();// important statement
			display(st[i]);

		}
		printdetails(st);

	}
}
