package com.lab;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) 
	{
		int fix=55;
		int count=0;
		Scanner sc=new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("your guess");
			int guess=sc.nextInt();
			count++;
			if(guess>fix)
			{
				System.out.println("you entered higher number...enter lower");
			}
			else if(guess<fix)
			{
				System.out.println("you enter lower number...enter higher");
			}
			else if(guess==fix)
			{
				System.out.println("congrats you guessed correct");
				System.out.println(count+" attempts");
				break;
			}
			
		}
		
		
			
		}
	
	}
		
				
			


