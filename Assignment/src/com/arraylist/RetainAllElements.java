package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RetainAllElements {
    public static void main(String[] args) {
        // Create an ArrayList with some elements
        List<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        originalList.add("Date");
        
       
        List<String> retainedList = new ArrayList<>(originalList);

        
        System.out.println("Original List: " + originalList);

        
        System.out.println("Retained List: " + retainedList);
    }
}

