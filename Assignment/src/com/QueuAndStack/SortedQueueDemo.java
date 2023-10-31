package com.QueuAndStack;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class MyObject {
    private int value;

    public MyObject(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class SortedQueueDemo {
    public static void main(String[] args) {
        
        Comparator<MyObject> myObjectComparator = Comparator.comparing(MyObject::getValue);

       
        Queue<MyObject> sortedQueue = new PriorityQueue<>(myObjectComparator);

        
        sortedQueue.offer(new MyObject(5));
        sortedQueue.offer(new MyObject(2));
        sortedQueue.offer(new MyObject(8));
        sortedQueue.offer(new MyObject(1));
        sortedQueue.offer(new MyObject(4));

    
        while (!sortedQueue.isEmpty()) {
            MyObject obj = sortedQueue.poll();
            System.out.println("Removed element: " + obj.getValue());
        }
    }
}

