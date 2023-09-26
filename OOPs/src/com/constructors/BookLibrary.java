package com.constructors;

class Book {

	private int Id;
	private String bName;
	private String aName;
	private String date;
	private float price;
	private char category;

	Book(int Id, String bName, String aName, String date, int price, char category) {
		this.Id = Id;
		this.bName = bName;
		this.aName = aName;
		this.date = date;
		this.price = price;
		this.category = category;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price2) {
		this.price = price2;
	}

	public char getCategory() {
		return category;
	}

	public void setCategory(char category) {
		this.category = category;
	}

	public String toString() {
		return "Id=" + Id + ", bName=" + bName + ", aName=" + aName + ", date=" + date + ", price=" + price
				+ ", category=" + category + "";
	}
}

public class BookLibrary {
	static void library(Book b) {
		if (b.getCategory() == 'S') {
			float price = b.getPrice();
			price = (float) (price - (price * 0.1));
			b.setPrice(price);

		}

	}

	public static void main(String[] args) {
		Book b1 = new Book(111, "java", "aniket", "29/11/1999", 500, 'S');
		Book b2 = new Book(222, "html", "suraj", "15/10/2015", 1000, 'O');
		Book b3 = new Book(333, "python", "pralay", "01/01/2008", 600, 'S');
		Book b4 = new Book(444, "cpp", "hrishikesh", "09/05/1995", 900, 'O');

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println();

		library(b1);
		library(b2);
		library(b3);
		library(b4);

		System.out.println("________after________");
		
        System.out.println();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);

	}

}
