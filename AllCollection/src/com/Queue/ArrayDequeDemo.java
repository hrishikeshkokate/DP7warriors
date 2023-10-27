package com.Queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {


		ArrayDeque<Float> f1=new ArrayDeque<Float>();
		f1.add(56.2f);
		f1.add(89.6f);
		f1.add(49.8f);
		
		
		System.out.println(f1.peekFirst());
		//System.out.println(f1.getFirst());
		
		//f1.addFirst(null); //add // not allows null
		f1.add(89.4f);
		f1.offerLast(93.3f);
		f1.addFirst(34.2f);
		
		//duplicate allowed
		//maintain insertion order
		
		System.out.println(f1);
		
		System.out.println(f1.peekFirst());
		System.out.println(f1.peekLast());
		
		System.out.println(f1.pollFirst());
		System.out.println(f1.pollLast());
		
		f1.push(80.3f);//addfirst
		
		System.out.println(f1);
		
		f1.push(67.6f);
		System.out.println(f1);
		
		System.out.println(f1.pop());//remove first

	}

}
