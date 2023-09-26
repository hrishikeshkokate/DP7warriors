package com.staticandfinal;

	class Parent {
	    static int staticVar = 10;
	}

	class Child extends Parent {
	    // This class inherits the staticVar from the Parent class
		static int staticVar = 200;
	}

	public class Main7 {
	    public static void main(String[] args) {
	        // Accessing the static variable from the Parent class
	        System.out.println(Parent.staticVar);  // Output: 10
	        
	        // Accessing the static variable from the Child class
	        System.out.println(Child.staticVar);   // Output: 200
	    }
	}


