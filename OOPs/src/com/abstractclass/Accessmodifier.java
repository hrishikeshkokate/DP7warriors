package com.abstractclass;

class Parent {
	void publicMethod() {
		System.out.println("This is a Parent class.");
	}

}

class Child extends Parent {

	protected void publicMethod() {
		System.out.println("This is a Child class.");
	}

}

public class Accessmodifier {
	public static void main(String[] args) {
		Child child = new Child();
		child.publicMethod();

	}
}
