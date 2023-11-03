package com.treeset;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		 TreeSet<String> ts= new TreeSet<>();
		    
		    ts.add("Java");
		    ts.add("Python");
		    ts.add("Angular");
		 //   ts.add(null);
		    ts.add("Java");
		    
		    System.out.println(ts);
	}
}

