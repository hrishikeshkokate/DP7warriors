package com.polymorphism;

public class Typepromotion {
	static void display(int n) {
		System.out.println("In int:");
		System.out.println(n);
	}

	static void display(float n) {
		System.out.println("In float:");
		System.out.println(n);
	}

	public static void main(String[] args) {
		display(5.6f);

	}

}
