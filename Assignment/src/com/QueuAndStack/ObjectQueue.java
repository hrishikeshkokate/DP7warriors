package com.QueuAndStack;

import java.util.LinkedList;
import java.util.Queue;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class ObjectQueue {
    public static void main(String[] args) {
       
        Queue<Person> personQueue = new LinkedList<>();

        
        personQueue.add(new Person("Aniket", 25));
        personQueue.add(new Person("Anuj", 30));
        personQueue.add(new Person("Kailash", 22));

        
        while (!personQueue.isEmpty()) {
            Person person = personQueue.poll();
            System.out.println("Dequeued person: " + person);
        }
    }
}

