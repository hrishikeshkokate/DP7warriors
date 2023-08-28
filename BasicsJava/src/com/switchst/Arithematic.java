package com.switchst;
import java.util.Scanner;
public class Arithematic {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter the number");
	int num1=sc.nextInt();
	System.out.println("Enter the number");
	int num2=sc.nextInt();
	System.out.println("Enter operation to perform");
	char c=sc.next().charAt(0);
	 
	switch(c) {
	 
	 case'+':System.out.println(num1+num2);
	 break;
	 case'-':System.out.println(num1-num2);
	 break;
	 case'*':System.out.println(num1*num2);
	 break;
	 case'/':System.out.println(num1/num2);
	 break;
	 default: System.out.println("Error");
	}
	}

}
