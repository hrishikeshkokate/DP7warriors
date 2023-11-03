package com.treemap;

public class Customer {
	private int id;
	private String name;
	private long mobileNo;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name, long mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
		
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
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mobileNo=" + mobileNo ;
	}
	
	
	

}
