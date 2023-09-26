package com.dynamicmethoddispatch;
class Bakery
{
	void bake()
	{
		System.out.println("baking a bakery item");
	}
	void type()
	{
		System.out.println("this is generic bakery item");
	}
	
}
class Breadbaker extends Bakery
{
	void bake()
	{
		System.out.println("Baking bread");
	}
	void type()
	{
		System.out.println("Brown bread");
	}
}
class Cakebaker extends Bakery
{
	void bake()
	{
		System.out.println("Baking cake");
	}
	void type()
	{
		System.out.println("Cheese cake");
	}
}
class Biscuitbaker extends Bakery
{
	void bake()
	{
		System.out.println("Baking Biscuit");
	}
	void type()
	{
		System.out.println("cream biscuit");
	}
	
}
public class BakeryShop {
	public static void main(String[] args) {
		
		Bakery b;
		b=new Bakery();
		b.bake();
		b.type();
		System.out.println("______________");
		b=new Breadbaker();
		b.bake();
		b.type();
		System.out.println("______________");
		b=new Cakebaker();
		b.bake();
		b.type();
		System.out.println("______________");
		b=new Biscuitbaker();
		b.bake();
		b.type();
	}

}
