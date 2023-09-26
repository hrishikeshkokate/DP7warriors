package com.dynamicmethoddispatch;

class Cake {
	private String flavour;
	private int price;

	public Cake() {

	}

	public Cake(String flavour, int price) {
		this.flavour = flavour;
		this.price = price;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cake [flavour=" + flavour + ", price=" + price + "]";
	}
	

}

class Mybakery extends Cake {
	private int bakeryid;
	private String name;
	Cake cake;
	static int cakecount = 0;
	static int cakeamount = 0;

	public Mybakery(int bakeryid, String name) {
		super();
		this.bakeryid = bakeryid;
		this.name = name;
	}

	public Cake getCake() {
		return cake;
	}

	public void setCake(Cake cake) {
		this.cake = cake;
	}

	public static int getCakecount() {
		return cakecount;
	}

	public static void setCakecount(int cakecount) {
		Mybakery.cakecount = cakecount;
	}

	public static int getCakeamount() {
		return cakeamount;
	}

	public static void setCakeamount(int cakeamount) {
		Mybakery.cakeamount = cakeamount;
	}

	public int getBakeryid() {
		return bakeryid;
	}

	public void setBakeryid(int bakeryid) {
		this.bakeryid = bakeryid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void sellcake(Cake cake) {
		cakecount++;
		cakeamount += cake.getPrice();
	}

	@Override
	public String toString() {
		return "Mybakery [bakeryid=" + bakeryid + ", name=" + name + ", cake=" + cake + "]";
	}
	

}

public class BakeryHouse {
	public static void main(String[] args) {

		Mybakery b1 = new Mybakery(101, "Good luck");

		Cake c1 = new Cake("pineapple", 350);
		Cake c2 = new Cake("chocolate", 450);
		Cake c3 = new Cake("apple", 550);
		Cake c4 = new Cake("black forest", 650);

		System.out.println(b1.getBakeryid()+" "+b1.getName());
		System.out.println("________________________");
		
		System.out.println("Number of cake :"+b1.getCakecount());
		System.out.println("Amount :"+b1.getCakecount());
		
		b1.setCake(c1);
		System.out.println(b1.getCake());
		b1.setCake(c3);
		System.out.println(b1.getCake());
		b1.setCake(c2);
		System.out.println(b1.getCake());
		
		b1.sellcake(c4);
		b1.sellcake(c3);
		b1.sellcake(c1);

	}

}
