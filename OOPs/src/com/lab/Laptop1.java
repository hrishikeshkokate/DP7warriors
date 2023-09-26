package com.lab;

public class Laptop1 
{
	private int id;
	private String name;
	private String brand;
	private float price;
	private Printer1 printer1;
	
	Laptop1()
	{
		
	}
	Laptop1(int id,String name,String brand,float price,Printer1 printer1)
	{
		this.id=id;
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.printer1=printer1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Printer1 getPrinter1() {
		return printer1;
	}
	public void setPrinter1(Printer1 printer1) {
		this.printer1 = printer1;
	}
	public String toString() {
		return "\nlaptop details\nid=" + id + ", \nname=" + name + ", \nbrand=" + brand + ", \nprice=" + price + printer1;
	}
	
	

}
