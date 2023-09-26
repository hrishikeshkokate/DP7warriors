package com.containment;

public class Anonymous {

public static void main(String[] args) {
		
		Author a1=new Author(101, "Aniket");
		Author a2=new Author(102, "Hrishikesh");
		
		Book b1=new Book(201, "HarryPotter", a1);
		Book b2=new Book(202, "Avengers", a2);
		
		System.out.println(b1);
		System.out.println("-------------------------");
		System.out.println(b2);
		
		Book b3=new Book(103,"Avatar",new Author(103,"Suraj"));
		System.out.println(b3);

	}

}
