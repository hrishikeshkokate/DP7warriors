package com.polymorphism;

class Polymorphism1
{
	static void area(int side)
	{
		System.out.println("area of square :"+side*side);
	}
	static void area(int length,int bredth)
	{
		System.out.println("area of rectangle :"+length*bredth);
	}
	static void area(float radius)
	{
		System.out.println("area of circle :"+(3.14*radius*radius));
	}
}

public class Staticoverload {

	public static void main(String[] args) 
	{
	Polymorphism1.area(5);
	Polymorphism1.area(5,9);
	Polymorphism1.area(8f);
	}

}
