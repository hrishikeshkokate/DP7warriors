package com.IfElse;

import java.util.Scanner;

public class Chocolate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Cost of Per Chocolate");
		int costPerChocolate=sc.nextInt();
		System.out.println("Enter rupees you have");
		int rupees=sc.nextInt();
		
		
		
	        int chocolatesBought = rupees / costPerChocolate;
	        int wrappers = chocolatesBought;

	        if (wrappers >= 3) {
	            int newChocolates = wrappers / 3;
	            newChocolates++;
	            chocolatesBought += newChocolates;
	            wrappers = newChocolates + (wrappers % 3);
	            System.out.println("you will get "+chocolatesBought+" chocolates");
	            
	        }

	}

}
