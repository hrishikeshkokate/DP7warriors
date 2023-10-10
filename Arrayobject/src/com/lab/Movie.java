package com.lab;

public class Movie {
	private String mname;
	private float rating;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String mname, float rating) {
		super();
		this.mname = mname;
		this.rating = rating;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [mname=" + mname + ", rating=" + rating + "]";
	}
	
	
	

}
