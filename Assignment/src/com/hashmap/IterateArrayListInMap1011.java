package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IterateArrayListInMap1011 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        map.put("key", list);
        
        System.out.println(map);
        
        System.out.println("------------------------");

        ArrayList<Integer> arrayList = map.get("key");
        for (Integer value : arrayList) {
            System.out.println(value);
        }
    }
}
