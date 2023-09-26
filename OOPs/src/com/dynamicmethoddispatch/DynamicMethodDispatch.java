package com.dynamicmethoddispatch;

class Actor {
	void display() {
		System.out.println("i am an Actor");
	}

}

class Model extends Actor {
	void display() {
		System.out.println("i am a Model");
	}

}

public class DynamicMethodDispatch {
	public static void main(String[] args) {

		Actor a;
		a = new Actor();
		a.display();

		a = new Model();
		a.display();
	}

}
