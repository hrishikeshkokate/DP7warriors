package com.Incapulation;

import java.util.Scanner;

public class ShallowCopy {
	static Scanner sc=new Scanner(System.in);
	static void insertObject(Book b)
	{
		 System.out.println("Enter the book id");
		 //int name=sc.nextInt();
		 b.setBookId(sc.nextInt());
		 
		 System.out.println("Enter the book name");
		 b.setBname(sc.next());
		 
		 System.out.println("Enter the book price");
		 b.setPrice(sc.nextFloat());
	}

	public static void main(String[] args) {
		Book b1=new Book();
		insertObject(b1);
		System.out.println(b1);
		Book b2=b1;//shallow copy
		b2.setPrice(3000);
		
		System.out.println(b1);
		
		
		
		Book b3=new Book();
		insertObject(b3);
		
		
		System.out.println(b2);
		System.out.println(b3);
		

	}


}
