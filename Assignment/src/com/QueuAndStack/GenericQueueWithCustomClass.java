package com.QueuAndStack;

import java.util.LinkedList;
import java.util.Queue;

class Person1 {
	private String name;
	private int age;

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + '}';
	}
}

public class GenericQueueWithCustomClass {
	public static void main(String[] args) {

		Queue<Person1> personQueue = new LinkedList<>();

		personQueue.add(new Person1("Alice", 25));
		personQueue.add(new Person1("Bob", 30));
		personQueue.add(new Person1("Charlie", 22));

		while (!personQueue.isEmpty()) {
			Person1 person = personQueue.poll();
			System.out.println("Dequeued person: " + person);
		}
	}
}
