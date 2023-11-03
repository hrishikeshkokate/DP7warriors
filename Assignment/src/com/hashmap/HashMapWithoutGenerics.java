package com.hashmap;

import java.util.HashMap;

public class HashMapWithoutGenerics {

    public static void main(String[] args) {
       
        HashMap<Integer, String> i1 = new HashMap<>();
        i1.put(1, "One");
        i1.put(2, "Two");
        i1.put(3, "Three");

        HashMap<String, Integer> i2 = new HashMap<>();
        i2.put("One", 1);
        i2.put("Two", 2);
        i2.put("Three", 3);

        System.out.println("Integer to String HashMap:");
        for (Integer key : i1.keySet()) 
        {
            String value = i1.get(key);
            System.out.println(key + " -> " + value);
        }

        System.out.println("\nString to Integer HashMap:");
        for (String key : i2.keySet()) 
        {
            Integer value = i2.get(key);
            System.out.println(key + " -> " + value);
        }
    }
}

