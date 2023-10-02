package com.interfacee;

interface Bakery {
	String bname = "letsbake";// public static final

	void bake();// public abstract

}

class Cake implements Bakery {

	@Override
	public void bake() {
		System.out.println("we bake cakes: Butterscotch, pineapple");

	}
	

}

class Biscuit implements Bakery {

	@Override
	public void bake() {
		System.out.println("we bake biscuit: chocolate, cream biscuit");

	}

	void minorder() {
		System.out.println("min package is 250g");
	}

}

public class Demo {

	public static void main(String[] args) {

		Bakery b;
		b = new Cake();
		b.bake();

		b = new Biscuit();
		b.bake();
		System.out.println("____________________");
		
		Biscuit b1=new Biscuit();
		b1.bake();
		b1.minorder();

	}

}
