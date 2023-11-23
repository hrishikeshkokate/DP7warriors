package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmptyMap7 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            iterator.remove(); 
        }

        System.out.println("HashMap after emptying it: " + map);
    }
}

