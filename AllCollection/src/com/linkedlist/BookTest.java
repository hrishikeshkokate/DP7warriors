package com.linkedlist;


import java.util.Collections;
import java.util.LinkedList;

public class BookTest {

	public static void main(String[] args) {
		
		LinkedList<Book> b1=new LinkedList<Book>();
		
		b1.add(new Book(101,"Java",600));
		b1.add(new Book(102,"Sql",450));
		b1.add(new Book(103,"Python",500));
		b1.add(new Book(104,".net",600));
		
		Collections.sort(b1);
		for(Book b:b1)
		{
			System.out.println(b);
		}
		
		
		

	}

}
