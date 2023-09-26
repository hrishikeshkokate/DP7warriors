package com.prootected;

class A {
	private int i = 10;
	int j = 20;
	protected int k = 30;
	public int m = 40;

	void display() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
	}

}

class B {
	A b = new A();

	void display() {
		//System.out.println(b.i);
		System.out.println(b.j);
		System.out.println(b.k);
		System.out.println(b.m);
	}

}

public class Demo1 {

	public static void main(String[] args) {
		
	

	}

}
