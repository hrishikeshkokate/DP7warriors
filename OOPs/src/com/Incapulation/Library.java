package com.Incapulation;

import java.util.Scanner;

public class Library {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 Book b1=new Book();
		 
		 b1.setBookId(123);
		 b1.setBname("HarryPotter");
		 b1.setPrice(999);
		 
		 System.out.println(b1.getBookId()+" "+b1.getBname()+" "+b1.getPrice());
		 System.out.println(b1);//hashcode
		 
		 Book b2=new Book();
		 System.out.println("Enter the book id");
		 //int name=sc.nextInt();
		 b2.setBookId(sc.nextInt());
		 
		 System.out.println("Enter the book name");
		 b2.setBname(sc.next());
		 
		 System.out.println("Enter the book price");
		 b2.setPrice(sc.nextFloat());
		 
		 System.out.println(b2);
	}

}
