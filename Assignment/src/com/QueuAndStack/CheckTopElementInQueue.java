package com.QueuAndStack;

import java.util.LinkedList;
import java.util.Queue;

public class CheckTopElementInQueue {
	public static void main(String[] args) {

		Queue<Integer> integerQueue = new LinkedList<>();

		integerQueue.add(1);
		integerQueue.add(2);
		integerQueue.add(3);

		Integer topElement = integerQueue.peek();

		if (topElement != null) {
			System.out.println("The top element in the queue is: " + topElement);
		} else {
			System.out.println("The queue is empty.");
		}
		
		
	}
}
