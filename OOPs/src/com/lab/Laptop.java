package com.lab;
//same
public class Laptop 
{
	private int id;
	private String name;
	private String brand;
	private float price;
	private Printer printer;
	
	Laptop()
	{
		
	}
	Laptop(int id,String name,String brand,float price,Printer printer)
	{
		this.id=id;
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.printer=printer;
	}

	public String toString() {
		return "id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", printer=" + printer;
	}
	
	

}
