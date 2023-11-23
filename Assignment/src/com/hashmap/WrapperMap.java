package com.hashmap;

import java.util.HashMap;

class Wrapper
{
	private int value;

	public Wrapper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wrapper(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Wrapper [value=" + value + "]";
	}
	
	
	
}

public class WrapperMap {

	public static void main(String[] args) {

		HashMap<Wrapper, Wrapper> map=new HashMap<Wrapper, Wrapper>();
		
		map.put(new Wrapper(1), new Wrapper(10));
		map.put(new Wrapper(1), new Wrapper(10));
		map.put(new Wrapper(1), new Wrapper(10));
		map.put(new Wrapper(1), new Wrapper(10));
		
		int size=map.size();
		
		System.out.println("Size of the map :"+ size);

	}

}
