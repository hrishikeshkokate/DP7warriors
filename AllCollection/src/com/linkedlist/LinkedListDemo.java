package com.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> itcomp=new LinkedList<>();
		
		//System.out.println(itcomp.getFirst());//throws exception NoSuchElementException
		
		System.out.println(itcomp.peek());//null
		
		//System.out.println(itcomp.remove());//throws exception NoSuchElementException
		System.out.println(itcomp.poll());
		
		itcomp.add("HCL");
		itcomp.add("TCS");//add at last
		itcomp.add(null);
		itcomp.add("TCS");
		
		System.out.println(itcomp);
		
		itcomp.addFirst("Infosys");
		System.out.println(itcomp);
		
		itcomp.add(1, "Dell");
		System.out.println(itcomp);
		
		System.out.println("----------------------");
		//retreive
		
		System.out.println("Element :"+itcomp.element());//Infosys
		System.out.println("Element :"+itcomp.getFirst());//Infosys
		System.out.println("Element :"+itcomp.peek());//Infosys
		System.out.println("Element :"+itcomp.peekFirst());//Infosys
		
		System.out.println(itcomp.get(2));
		
		System.out.println("From last "+itcomp.getLast());
		System.out.println("From last "+itcomp.peekLast());
		
		System.out.println("----------------------");
		//deletion
		
		System.out.println(itcomp.poll());
		//pollfirst,remove,removefirst
		System.out.println(itcomp);
		
		System.out.println(itcomp.remove(2));
		System.out.println(itcomp.remove("HCL"));
		System.out.println(itcomp);
		
		System.out.println(itcomp.removeLast());
		System.out.println(itcomp.removeLastOccurrence("TCS"));
		
		System.out.println("----------------------");
		//pollLast
		
		itcomp.addFirst("Capgemini");//return void
		System.out.println(itcomp.offerFirst(null));
		
		
		
		
		
		

	}

}
