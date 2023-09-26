package com.lab;

public class Print1 
{
	static void laptopname(Laptop1 l)
	{
		if(l.getPrinter1().getPprice()>12000)
		{
			System.out.println(l.getName());
		}
	}

	public static void main(String[] args) 
	{
		Laptop1 L1=new Laptop1();
		L1.setId(11);
		L1.setName("envy");
		L1.setBrand("Hp");
		L1.setPrice(55000);
		L1.setPrinter1(new Printer1());
		L1.getPrinter1().setPid(201);
		L1.getPrinter1().setPname("Xerox");
		L1.getPrinter1().setPprice(6000);
		
		System.out.println(L1);
		
		Laptop1 L2=new Laptop1();
		L2.setId(12);
		L2.setName("macbook");
		L2.setBrand("apple");
		L2.setPrice(320000);
		L2.setPrinter1(new Printer1());
		L2.getPrinter1().setPid(111);
		L2.getPrinter1().setPname("Xerox");
		L2.getPrinter1().setPprice(50000);
		
		System.out.println(L2);
		
		//use this if tostring is not there
		System.out.println("_____________________");
		System.out.println(L1.getId());
		System.out.println(L1.getName());
		System.out.println(L1.getPrice());
		System.out.println(L1.getPrinter1().getPid());
		System.out.println(L1.getPrinter1().getPname());
		System.out.println(L1.getPrinter1().getPprice());
		
		System.out.println("_____________________");
		System.out.println(L2.getId());
		System.out.println(L2.getName());
		System.out.println(L2.getPrice());
		System.out.println(L2.getPrinter1().getPid());
		System.out.println(L2.getPrinter1().getPname());
		System.out.println(L2.getPrinter1().getPprice());
		
		System.out.println("_____________________");
		laptopname(L1);
		laptopname(L2);
	

	
	}

}
