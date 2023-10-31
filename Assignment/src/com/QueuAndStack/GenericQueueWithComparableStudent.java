package com.QueuAndStack;

import java.util.PriorityQueue;
import java.util.Queue;

class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student {id=" + id + ", name='" + name + "'}";
	}

	@Override
	public int compareTo(Student otherStudent) {

		return Integer.compare(this.id, otherStudent.id);
	}
}

public class GenericQueueWithComparableStudent {
	public static void main(String[] args) {

		Queue<Student> studentQueue = new PriorityQueue<>();

		studentQueue.add(new Student(101, "Alice"));
		studentQueue.add(new Student(102, "Bob"));
		studentQueue.add(new Student(103, "Charlie"));

		while (!studentQueue.isEmpty()) {
			Student student = studentQueue.poll();
			System.out.println("Dequeued student: " + student);
		}
	}
}
