package com.hashmap;

public class Book {
	private int bid;
	private String bookName;
	private int price;
	private Author author;
	public Book() {
		super();
		
	}
	public Book(int bid, String bookName, int price, Author author) {
		super();
		this.bid = bid;
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bookName=" + bookName + ", price=" + price + ", author=" + author + "]";
	}
	
	
	
	

}
