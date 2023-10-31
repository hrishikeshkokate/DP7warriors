package com.QueuAndStack;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveNonExistingElementsFromQueue {
    public static void main(String[] args) {
      
        Queue<Integer> myQueue = new LinkedList<>();

      
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);

      
        Integer removedElement1 = myQueue.poll(); // Removes and returns 1
        Integer removedElement2 = myQueue.poll(); // Removes and returns 2
        Integer removedElement3 = myQueue.poll(); // Removes and returns 3
        Integer removedElement4 = myQueue.poll(); // Attempt to remove a non-existing element

       
        System.out.println("Removed elements: " + removedElement1 + ", " + removedElement2 + ", " + removedElement3 + ", " + removedElement4);
    }
}

