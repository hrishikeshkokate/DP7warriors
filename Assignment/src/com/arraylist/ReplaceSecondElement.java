package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ReplaceSecondElement {
    public static void main(String[] args) {
        
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

        System.out.println("Original : " + arrayList);

       
        if (arrayList.size() >= 2) 
        {
            String specifiedElement = "Grape";
            arrayList.set(1, specifiedElement);
            
            System.out.println("Modified : " + arrayList);
        } 
        else
        {
            System.out.println("The Array List does not have a second element.");
        }
    }
}

