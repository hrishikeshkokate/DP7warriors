package com.containment;


	class Department {
	    private int id;
	    private String name;

	    public Department(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }
	}

	class Student {
	    private int roll;
	    private String name;
	    private Department department;

	    public Student(int roll, String name, Department department) {
	        this.roll = roll;
	        this.name = name;
	        this.department = department;
	    }

	    public int getRoll() {
	        return roll;
	    }

	    public String getName() {
	        return name;
	    }

	    public Department getDepartment() {
	        return department;
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // Creating a Department object
	        Department department = new Department(1, "Computer Science");

	        // Creating a Student object and assigning the Department object
	        Student student = new Student(101, "John Doe", department);

	        // Printing individual values
	        System.out.println("Student Roll: " + student.getRoll());
	        System.out.println("Student Name: " + student.getName());
	        System.out.println("Department ID: " + student.getDepartment().getId());
	        System.out.println("Department Name: " + student.getDepartment().getName());
	    }
	}


