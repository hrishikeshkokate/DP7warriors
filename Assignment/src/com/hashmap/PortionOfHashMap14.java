package com.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PortionOfHashMap14 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(7, "Seven");
        map.put(9, "Nine");
        map.put(15, "Fifteen");
        map.put(4, "Four");

        int key=5;
        
       // Map<Integer, String> portionMap = new HashMap<Integer, String>();
        //System.out.println(portionMap);
        
        Set<Entry<Integer, String>> entr=map.entrySet();
        for(Entry<Integer, String> e:entr)
        {
        	if(e.getKey()<key)
        	{
        		System.out.println(e.getKey()+"-->"+e.getValue());
        	}
        }
        
        System.out.println("---------------------------------------------");
        //WAP to get the least key strictly greater than the given key.
        //Return null if there is no such key
        
       
        
        
    }
}

