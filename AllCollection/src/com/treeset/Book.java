package com.treeset;

public class Book {
	
	private int bid;
	private String bname;
	private float price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bid, String bname, float price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
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
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price + "]";
	}
	
	

}
