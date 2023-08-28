package com.Labwork;
import java.util.Scanner;
public class DigitCharacterSymbol {

	public static void main(String[] args)
 {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character");
		
	char c =sc.next().charAt(0);
	
	if((c>='A' && c<='Z') || (c>='a' && c<='z'))
			{
		System.out.println("It is a alphabet");
			}
	else if(c>='0' && c<='9')
	{
		System.out.println("It is a number");
	}
	else
	{
		System.out.println("It is a Symbol");
	}
	sc.close();
	}
	

}
