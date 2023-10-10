package com.lab;

public class Theater {
	
	private int tId;
	private String tName;
	private String location;
	private Movie movie;
	
	public Theater() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Theater(int tId, String tName, String location, Movie movie) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.location = location;
		this.movie = movie;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Theater [tId=" + tId + ", tName=" + tName + ", location=" + location + ", movie=" + movie + "]";
	}

}
