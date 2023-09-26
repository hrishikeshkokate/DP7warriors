package com.SpecifierAndmodifier;

public class AccessDemo 
{
	private int a;
	int b;//default
	//protected int c;
	public int d;
	
	private void show()
	{
		System.out.println("Hello");
	}
	
	void display()
	{
		System.out.println("Welcome");
	}
	
	public void test()
    {
	 System.out.println("Test");	
	}
	
	public static void main(String[] args) 
	{
		AccessDemo obj=new AccessDemo();
		
		obj.a=99;
		obj.b=88;
		obj.d=90;
		
		obj.show();//private can be accesed inside a class only
		obj.display();//default it can be accessed inside a package and class only
		obj.test();//public it can be accesed everywhere
		
		

	}

}
