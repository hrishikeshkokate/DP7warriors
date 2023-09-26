package com.polymorphism;

class Shape3
{
int area(int side)
{
return (side*side);
}
int area(int length,int bredth)
{
return(length*bredth);	
}
float area(float radius)
{
return(3.14f*radius*radius)	;
}
}
public class Returntype {

	public static void main(String[] args) 
	{
		Shape3 sq=new Shape3();
		System.out.println("Area of square:"+sq.area(5));
		
		Shape3 rec=new Shape3();
		System.out.println("Area of rectangle:"+rec.area(5,9));
		
		Shape3 cir=new Shape3();
		System.out.println("Area of circle:"+cir.area(4));
				
		

	}

}
