package com.lab;

import java.util.Scanner;

public class CalculatorDWhile {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char c;
		do
		{
			System.out.println("Enter the number");
			int num1=sc.nextInt();
			System.out.println("Enter the number");
			int num2=sc.nextInt();
			System.out.println("Operation to perform \n+\n-\n*\n/\n%\n");
			char ch=sc.next().charAt(0);
			switch(ch) 
			{
			 
			 case'+':System.out.println("Answer :"+(num1+num2));
			 break;
			 case'-':System.out.println("Answer :"+(num1-num2));
			 break;
			 case'*':System.out.println("Answer :"+(num1*num2));
			 break;
			 case'/':System.out.println("Answer :"+(num1/num2));
			 break;
			 case'%':System.out.println("Answer :"+(num1%num2));
			 break;
			 default: System.out.println("Error");
		}
			System.out.println("--------------------------------------");
			System.out.println("Do you want to continue Y/N");
			 c=sc.next().charAt(0);
			
		}
		while(c!='N');
				

	}

}
