package com.treemap;

public class Order {
	private int pId;
	private String pName;
	private int price;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int pId, String pName, int price) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [pId=" + pId + ", pName=" + pName + ", price=" + price + "]";
	}
	
	
	

}
