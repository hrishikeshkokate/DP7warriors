package com.loops;

import java.util.Scanner;

public class ChocolateForLoop {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter rupees you have");
		 int rupees=5;
		
		//System.out.println("enter cost of per chocolate");
		 int costPerChocolate=1;
		 
		 int chocolatesBought = rupees / costPerChocolate;
	        int wrappers = chocolatesBought;

	        for (; wrappers >= 3; wrappers = wrappers - 2) {
	            int newChocolates = wrappers / 3;
	            newChocolates++;
	            chocolatesBought += newChocolates;
	            
	            wrappers = newChocolates + (wrappers % 3);
	            
	        }
	        System.out.println("you will get "+chocolatesBought+" chocolates");
	        
		 }
	

		
		
		
	

	}


