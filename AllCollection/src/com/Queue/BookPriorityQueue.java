package com.Queue;


import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class BookPriorityQueue {

	public static void main(String[] args) {
		
		//PriorityQueue<Book> b1=new PriorityQueue<>(new PriceComparator());
		
		PriorityQueue<Book> b1=new PriorityQueue<>();//will give exception
		
		b1.add(new Book(101,"Java",600));
		b1.add(new Book(102,"Sql",450));
		b1.add(new Book(103,"Python",500));
		b1.add(new Book(104,".net",600));
		
		
		for(Book b:b1)
		{
			System.out.println(b);
		}
		
		
		
		
		

	}

}
