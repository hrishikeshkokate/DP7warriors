package com.staticandfinal;


	class Parent1 {
	    static void staticMethod() {
	        System.out.println("This is a static method in the Parent class.");
	    }
	}

	class Child1 extends Parent {

		public static void staticMethod() {
			
			
		}
	    // This class inherits the staticMethod from the Parent class
	}

	public class Main8 {
	    public static void main(String[] args) {
	        // Accessing the static method from the Parent class
	        Parent1.staticMethod();  // Output: This is a static method in the Parent class.

	        // Accessing the static method from the Child class
	        Child1.staticMethod();   // Output: This is a static method in the Parent class.
	    }
	}


