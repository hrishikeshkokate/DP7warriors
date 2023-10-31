package com.linkedlist;

public class Bike implements Comparable<Bike>{
	private int id;
	private String name;
	private int price;
	private int modelyear;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int id, String name, int price, int modelyear) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.modelyear = modelyear;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getModelyear() {
		return modelyear;
	}
	public void setModelyear(int modelyear) {
		this.modelyear = modelyear;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", price=" + price + ", modelyear=" + modelyear + "]";
	}
	@Override
	public int compareTo(Bike b) {
		
		if(this.getPrice()==b.getPrice())
		return this.getName().compareTo(b.getName());
		else
			if(this.getPrice()>b.getPrice())
				return -1;
			else
				return 1;
	}
	
	
	

}
