package com.treeset;

import java.util.TreeSet;

public class BookTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<Book> bs= new TreeSet<>(new PriceComparator());
		bs.add(new Book(101, "Hamlet", 890f));
		bs.add(new Book(102, "Life", 1090f));
		bs.add(new Book(103, "Secret", 590f));
		bs.add(new Book(101, "Hamlet", 890f));
		
		for(Book b:bs)
		{
			System.out.println(b);
		}
	}

}
