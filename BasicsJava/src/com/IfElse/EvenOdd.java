package com.IfElse;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your number");
		int num1=sc.nextInt();
		
		if(num1%2==0)
		{
			System.out.println("it is even number");
		}
		else
		{
			System.out.println("it is odd number");
		}
		
		sc.close();
	}

}
