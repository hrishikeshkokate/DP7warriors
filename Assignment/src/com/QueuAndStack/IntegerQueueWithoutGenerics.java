package com.QueuAndStack;

import java.util.LinkedList;
import java.util.Queue;

public class IntegerQueueWithoutGenerics {
	public static void main(String[] args) {

		Queue<Integer> integerQueue = new LinkedList<Integer>();

		integerQueue.add((Integer) 1);
		integerQueue.add((Integer) 2);
		integerQueue.add((Integer) 3);
	

		while (!integerQueue.isEmpty()) {
			Integer element = (Integer) integerQueue.poll();
			System.out.println("Dequeued element: " + element);
		}
	}
}
