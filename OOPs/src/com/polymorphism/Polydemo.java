package com.polymorphism;
//INSTANCE METHOD OVERLOADING
class Polymorphism
{
	void area(int side)
	{
		System.out.println("area of square :"+side*side);
	}
	void area(int length,int bredth)
	{
		System.out.println("area of rectangle :"+length*bredth);
	}
	void area(float radius)
	{
		System.out.println("area of circle :"+(3.14*radius*radius));
	}
}
public class Polydemo {

	public static void main(String[] args) 
	{
		Polymorphism square=new Polymorphism();
		square.area(10);
		
		Polymorphism rectangle=new Polymorphism();
		rectangle.area(5,6);
		
		Polymorphism circle=new Polymorphism();
        circle.area(9f);
	}

}
