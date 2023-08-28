package com.IfElse;
import java.util.*;
import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter 1st number");
		 int num1=sc.nextInt();
		 
		 System.out.println("Enter 2nd number");
		 int num2=sc.nextInt();
		 
		 if(num1>num2)
		 {
			 System.out.println(num1+"is greater");
		 }
		 else
		 {
			 System.out.println(num2+"is greater");
		 }
		 sc.close();
	}

}
