package com.hashmap;

import java.util.Objects;

public class Author {
	
	private int id;
	private String authorName;
	public Author() {
		super();
		
	}
	public Author(int id, String authorName) {
		super();
		this.id = id;
		this.authorName = authorName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", authorName=" + authorName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(authorName, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return Objects.equals(authorName, other.authorName) && id == other.id;
	}
	
	
	

}
