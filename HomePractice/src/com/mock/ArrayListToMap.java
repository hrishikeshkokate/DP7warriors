package com.mock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListToMap {

	public static void main(String[] args) {
		
		ArrayList<Integer> i1=new ArrayList<>();
		i1.add(1);
		i1.add(3);
		i1.add(4);
		i1.add(5);
		i1.add(1);
		i1.add(2);
		i1.add(3);
		
		Map<Integer,Integer> map=new HashMap<>();
		for(int num:i1) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		for (int num:i1) {
			System.out.println(num+" "+map.get(num));
		}

	}

}
