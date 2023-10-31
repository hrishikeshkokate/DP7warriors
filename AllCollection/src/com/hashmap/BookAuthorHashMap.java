package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BookAuthorHashMap {
	
	static void createMapCount(ArrayList<Book> b1)
	{
		HashMap<Author, Integer> h1=new HashMap<Author, Integer>();
		
		for(Book b:b1)
		{
			if(h1.containsKey(b.getAuthor()))
			{
				h1.put(b.getAuthor(), h1.get(b.getAuthor())+1);
			}
			else
			{
				h1.put(b.getAuthor(), 1);
			}
		}
		for(Map.Entry<Author, Integer> e:h1.entrySet())
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
	}
	//create key:author
	//value:arraylist<Book>
	
	
	
	static void createBookMap(ArrayList<Book> b1)
	{
		HashMap<Author, ArrayList<Book>> h1=new HashMap<>();
		
		ArrayList<Book> books;
		
		for(Book b:b1)
		{
			if(h1.containsKey(b.getAuthor()))
			{
				books=h1.get(b.getAuthor());
			}
			else
			{
				books=new ArrayList<>();
			}
			books.add(b);
			h1.put(b.getAuthor(), books);
		}
		for(Map.Entry<Author, ArrayList<Book>> e:h1.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println("------------------------");
			for(Book b:e.getValue())
			{
				System.out.println(b);
			}
			System.out.println("________________________________");
			
		}
	}
	
	//key:Author
		//value:Book Names

	public static void main(String[] args) {
		
		ArrayList<Book> b=new ArrayList<Book>();
		
		b.add(new Book(101,"Harry Potter",1055,new Author(1,"JK Rowling")));
		b.add(new Book(102,"Hamlet",1055,new Author(2,"William Shakespeare")));
		b.add(new Book(103,"Fantastic beast",1055,new Author(1,"JK Rowling")));
		b.add(new Book(104,"Othello",1055,new Author(2,"William Shakespeare")));
		b.add(new Book(105,"A clear blue sky",1055,new Author(3,"N. R. Narayana Murthy")));
		
		createMapCount(b);
		
		System.out.println("==================================================");
		
		createBookMap(b);
		
		

	}

}
