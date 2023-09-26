package com.containment;

public class Book {

	private int id;
	private String name;
	private Author author;

	Book(int id, String name, Author author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
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

	public String toString() {
		return "\nid=" + id + ", \nname=" + name + "\nauthor" + author;
	}

}
