package com.QueuAndStack;

import java.util.LinkedList;
import java.util.Queue;

public class ColorQueue {
	public static void main(String[] args) {

		Queue<String> colorQueue = new LinkedList<>();

		colorQueue.add("Red");
		colorQueue.add("Green");
		colorQueue.add("Blue");
		colorQueue.add("Yellow");

		while (!colorQueue.isEmpty()) 
		{
			String color = colorQueue.poll();
			System.out.println("Dequeued color: " + color);
		}
	}
}
