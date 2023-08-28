package com.Labwork;

import java.util.Scanner;

public class AreaOfCylinder {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the radius");
		double r=sc.nextDouble();
		System.out.println("Enter the height");
		double h=sc.nextDouble();
		
		double area=Math.PI*r*r*h;
		
		System.out.println("Volume of cylinder is: "+area);

		
		
		
		sc.close();

	}

}
