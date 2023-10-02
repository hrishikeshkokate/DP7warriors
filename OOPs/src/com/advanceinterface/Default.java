package com.advanceinterface;
interface Calculation
{
	float pi=3.147f;
	
	void area();
	
	//to make interface mutable and provide backward compatibility
	default void volume()
	{
		System.out.println("In volume method");
	}
	
	//to provide common implementation
	//belongs to interface
	static void info()
	{
		System.out.println("Geometry shapes");
	}
	
	
}

class Square implements Calculation
{
	int side;

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public void area() {
		System.out.println("Area of Square is"+(side*side));
		
	}
	
	
	
}

class Cube implements Calculation
{
	int side;

	public Cube() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cube(int side) {
		super();
		this.side = side;
	}

	@Override
	public void area() {
		System.out.println("Area of Square is"+(6*side*side));
	
		
	}
	public void volume()
	{
		System.out.println("Volume of Square is"+(side*side*side));
	}
	
	
}

public class Default {

	public static void main(String[] args) {
		
		Calculation c;
		c=new Square(5);
		c.area();
		c.volume();
		
		c=new Cube(9);
		c.area();
		c.volume();
			
			
		
		

	}

}
