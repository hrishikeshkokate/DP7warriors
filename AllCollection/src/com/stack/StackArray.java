package com.stack;

import java.util.Vector;

class MyStack {
	int top;
	int size;
	int stk[];

	public MyStack() {

	}

	public MyStack(int size) {
		top = -1;
		this.size = size;
		stk = new int[this.size];

	}

	boolean push(int data) {
		if (top < size - 1) {
			top++;
			stk[top] = data;
			return true;

		} else {
			System.out.println("Stack is full");
			return false;

		}

	}

	void pop() {
		if (top != -1) {
			System.out.println("Element deleted");
			top--;

		} else {

			System.out.println("Stack is Empty");

		}

	}

	void display() {
		if (top != -1) {
			System.out.println();
			System.out.print("[");
			for (int i = 0; i < stk.length; i++) {

				System.out.print(stk[i] + ",");

			}
			System.out.println("]");
			System.out.println();

		} else {
			System.out.println("STACK IS empty");

		}

	}

}

public class StackArray {

	public static void main(String[] args) {
		MyStack s1 = new MyStack(5);
		s1.pop();

		s1.push(89);
		s1.push(45);
		s1.push(70);
		s1.push(34);
		s1.push(56);

		s1.display();
		s1.push(90);

		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();

	}

}