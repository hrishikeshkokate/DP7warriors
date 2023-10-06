package com.objectArray;

class Sstudent {
	int id;
	String name;
	float marks;

	public Sstudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sstudent(int id, String name, float marks) {
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

public class SchooltopperAndsorting 
{

	static void topper(Sstudent stud[])
	{
		float maxmarks = Float.MIN_VALUE;
		Sstudent st = new Sstudent();

		for (Sstudent s : stud) 
		{
			if (s.getMarks() > maxmarks) 
			{
				maxmarks = s.getMarks();
				st = s;
			}
		}
		System.out.println(st);
	}

	static void sortmarks(Sstudent stud[]) 
	{
		Sstudent st = new Sstudent();
		for (int i = 0; i < stud.length; i++) 
		{
			for (int j = i + 1; j < stud.length; j++)
{
				if (stud[i].getMarks() < stud[j].getMarks()) 
				{
					st = stud[i];
					stud[i] = stud[j];
					stud[j] = st;
				}
			}
		}
	}

	public static void main(String[] args) 
	{

		Sstudent st[] = new Sstudent[5];// Array is created of size 5

		st[0] = new Sstudent(1, "Hrishikesh", 78.6f);
		st[1] = new Sstudent(2, "Aniket", 88.2f);
		st[2] = new Sstudent(3, "Suraj", 99.1f);
		st[3] = new Sstudent(4, "Kailash", 54.3f);
		st[4] = new Sstudent(5, "Pralay", 65.6f);
		// st[5]=new Student(5,"Pralay",65.6f);//ArrayIndexOutOfBound
		// Exception
		for (Sstudent s : st) 
		{
			System.out.println(s);
		}

		System.out.println("_______________________________________");
		System.out.println("Topper in class");
		topper(st);
		
		System.out.println("_______________________________________");
		System.out.println("Sorting marks");
		sortmarks(st);
		for (int i = 0; i < st.length; i++) 
		{
			System.out.println(st[i]);
		}

	}

}
