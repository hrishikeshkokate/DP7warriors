package com.constructors;

import java.util.Scanner;

public class CubeOfNumber 
{
	static int square(int num)
	{
		return num*num;
	}
	
	static int cube(int num)
	{
		return num*square(num);
	}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	
	System.out.println(cube(num));
	
}

}


