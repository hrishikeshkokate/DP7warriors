package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class MatchTwoCollections {
    public static void main(String[] args) {
        
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Date");

        List<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Date");
        list2.add("Grape");
        list2.add("Orange");
        //list2.add("Orange");
        
        
        if(list1.size()==list2.size())
        {
        boolean status=list1.containsAll(list2);
        if(status==true)
        {
        	System.out.println("Collection is same");
        }
    
       // if(list1.size()==list2.size())
        //{
       // List<String> matchingElements = new ArrayList<>(list1);
       // matchingElements.retainAll(list2);

       // List<String> uniqueTo1 = new ArrayList<>(list1);
        //uniqueTo1.removeAll(list2);

       // List<String> uniqueTo2 = new ArrayList<>(list2);
      //  uniqueTo2.removeAll(list1);

        
        //System.out.println("Matching Elements: " + matchingElements);
        //System.out.println("Elements Unique to List1: " + uniqueTo1);
       // System.out.println("Elements Unique to List2: " + uniqueTo2);
       // }
        else
        {
        	System.out.println("Collection is different");
        }
        }
        else
        {
        	System.out.println("Size is different");
        }
        
    }
}


