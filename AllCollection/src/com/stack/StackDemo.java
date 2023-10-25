package com.stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		
		Stack<String> names=new Stack<>();
		names.push("Vishal");
		names.push("Hrishikesh");
		System.out.println(names.push("Kailash"));
		
		names.push("Anuj");
		names.push("Shivam");
		
		System.out.println(names);
		
		System.out.println(names.pop());
		System.out.println(names);

	}

}
