package com.Labwork;

import java.util.Scanner;

public class AlphabetFromNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers :");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		
		char a1=(char) num1;
		char a2=(char) num2;
		char a3=(char) num3;
		char a4=(char) num4;
		
		System.out.println(a1+""+a2+""+a3+""+a4);

	}

}
