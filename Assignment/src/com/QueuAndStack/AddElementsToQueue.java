package com.QueuAndStack;

import java.util.LinkedList;
import java.util.Queue;

public class AddElementsToQueue {
    public static void main(String[] args) {
        
        Queue<Integer> integerQueue = new LinkedList<>();

        
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);

        
        integerQueue.offer(4);
        integerQueue.offer(5);

        
        while (!integerQueue.isEmpty()) {
            Integer element = integerQueue.poll();
            System.out.println("Dequeued element: " + element);
        }
    }
}
