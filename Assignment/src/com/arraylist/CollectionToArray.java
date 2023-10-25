package com.arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionToArray {
    public static void main(String[] args) {
        
    	ArrayList<String> c = new ArrayList<>();
    	
        c.add("Apple");
        c.add("Banana");
        c.add("Cherry");

        // Convert the collection to an array
        String[] array = c.toArray(new String[0]);

        // Display the elements in the array
        System.out.println("Array elements:");
        for (String element : array) 
        {
            System.out.println(element);
        }
    }
}

