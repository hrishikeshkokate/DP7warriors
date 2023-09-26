package com.lab;
//same
public class Print {

	public static void main(String[] args) 
	{
		Printer p1=new Printer(101,"Hp",35000);
		Printer p2=new Printer(122,"Dell",56000);
		
		Laptop L1=new Laptop(11,"Hrishi","lenovo",66000,p1);
		Laptop L2=new Laptop(12,"Aniket","apple",350000,p2);
		
		System.out.println(L1);
		System.out.println(L2);

	}

}
