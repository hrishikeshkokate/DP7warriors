package com.Incapulation;

public class Book {
	
	//instance variable
	
	private int bookId;
	private String bname;
	private float price;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	//public void display()
	@Override
	public String toString() {
		return "bookId=" + bookId + ", bname=" + bname + ", price=" + price + "";
	}
	
	
	//getter and setter should be public
	
	
	
	
}
