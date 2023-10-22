package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConstructor {

	public static void main(String[] args) {
		
		//Using the default constructor:
		ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(1.0);
        doubleList.add(2.0);
        doubleList.add(3.0);
        System.out.println(doubleList);
        
        //Using the constructor with an initial capacity:
        int initialCapacity = 5;
        ArrayList<Double> doubleList1 = new ArrayList<>(initialCapacity);
        doubleList1.add(1.1);
        doubleList1.add(2.2);
        doubleList1.add(3.3);
       
       
        System.out.println(doubleList1);
        
       // Using the constructor with an existing collection:
        List<Double> initialData = Arrays.asList(1.22, 2.33, 3.44);
        
        ArrayList<Double> doubleList2 = new ArrayList<>(initialData);
        System.out.println(doubleList2);
		
		



	}

}
