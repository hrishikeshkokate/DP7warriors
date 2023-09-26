package com.Incapulation;

import java.util.Scanner;

public class Item1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter item id");
		int id=sc.nextInt();
		
		System.out.println("Enter the name");
		String name=sc.next();
		
		System.out.println("Enter the price");
		float price=sc.nextFloat();
		
		Item i=new Item();
		i.display(id, name, price);
		

	}

}
