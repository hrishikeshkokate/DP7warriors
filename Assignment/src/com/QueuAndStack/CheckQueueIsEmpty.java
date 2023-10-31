package com.QueuAndStack;

import java.util.LinkedList;
import java.util.Queue;

public class CheckQueueIsEmpty {
    public static void main(String[] args) {
        
        Queue<Integer> integerQueue = new LinkedList<>();

        
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);

        
        if (!integerQueue.isEmpty()) {
            System.out.println("The queue has values.");
        } else {
            System.out.println("The queue is empty.");
        }
    }
}

