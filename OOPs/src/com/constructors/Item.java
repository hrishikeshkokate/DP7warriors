package com.constructors;

public class Item 
{
	private int Id;
	private String name;
	private int price;
	
	Item()
	{
		
	}
	
	Item(int id,String name,int price)
	{
		this.Id=id;
		this.name=name;
		this.price=price;
		
	}
	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

	
	public String toString() {
		return "Id=" + Id + ", name=" + name + ", price=" + price + "";
	
	}
}
