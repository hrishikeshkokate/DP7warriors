package com.basics;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("pcm percentage");
		double pcm=sc.nextDouble();
		System.out.println("total percentage");
		double total=sc.nextDouble();
		
		
		if((pcm>=85) || (total>=90))
		{
			System.out.println("You got the admission");
		}
		else
		{
			System.out.println("Better luck next time");
		}
	}

}
