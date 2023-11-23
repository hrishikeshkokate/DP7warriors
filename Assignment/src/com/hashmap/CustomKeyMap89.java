package com.hashmap;

import java.util.HashMap;
import java.util.Map;

class CustomKey {
    
}
class CustomValue {
    
}

public class CustomKeyMap89 {
    public static void main(String[] args) {
        Map<CustomKey, Integer> hm = new HashMap<>();
        CustomKey key1 = new CustomKey();
        CustomKey key2 = new CustomKey();

        hm.put(key1, 1);
        hm.put(key2, 2);
        
        System.out.println("-------------------------");
        
        Map<CustomKey, CustomValue> customMap = new HashMap<>();
        CustomKey key3 = new CustomKey();
        CustomValue value1 = new CustomValue();

        customMap.put(key3, value1);

        
    }
}

