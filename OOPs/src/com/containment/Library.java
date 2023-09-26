package com.containment;

public class Library {

	public static void main(String[] args) 
	{
		Author a1= new Author(11,"J.K.Rowling");
		Author a2= new Author(22,"Aniket");
		
		Book b1= new Book(501,"harrypotter",a1);
		Book b2= new Book(707,"fantasticbeast",a2);
		
		System.out.println(b1);
		System.out.println(b2);
		
	}

}
