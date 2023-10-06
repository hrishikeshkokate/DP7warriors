package com.objectArray;

import java.util.Scanner;
import java.util.Arrays;

class Sttudent {

	private int id;
	private String name;
	private float marks[];

	public Sttudent() {
		marks = new float[5];

	}

	public Sttudent(int id, String name, float[] marks) {
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
		return "id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks);
	}

	public class Userstudentinput {
		static Scanner sc = new Scanner(System.in);

		static void enterdetails(Sttudent s) {
			System.out.println("Enter student id :");
			s.setId(sc.nextInt());

			System.out.println("Enter student name :");
			s.setName(sc.next());

			float m[] = new float[5];
			System.out.println("Enter the marks of 5 subject");

			for (int i = 0; i < m.length; i++) {
				System.out.println("Subject :" + (i + 1) + ":");
				m[i] = sc.nextFloat();
			}
			s.setMarks(m);

		}

		static float percentage(Sttudent s) {
			float m[] = s.getMarks();
			float total = 0;
			for (float m1 : m) {
				total += m1;
			}
			float per = (total / 500) * 100;
			return per;
		}

		public static void main(String[] args) {

			Sttudent[] stud = new Sttudent[3];
			for (int i = 0; i < stud.length; i++) {
				stud[i] = new Sttudent();
				enterdetails(stud[i]);

			}
			System.out.println("______________________");
			for (Sttudent s : stud) {
				System.out.println(s.getId() + " " + s.getName() + " " + percentage(s));
			}
		}
	}
}
