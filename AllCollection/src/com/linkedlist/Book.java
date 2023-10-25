package com.linkedlist;

public class Book implements Comparable<Book>{
	private int id;
	private String name;
	private int price;
	public Book() {
		super();
		
	}
	public Book(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book b) {
		if(this.getPrice()==b.price)
			return 0;
					
			if(this.getPrice()>b.getPrice())
				return 1;
			else
				return -1;
		
		
		
	}
	
	
	

}
