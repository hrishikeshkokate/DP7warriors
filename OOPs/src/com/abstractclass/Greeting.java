package com.abstractclass;

abstract class Card {
	String cardtype;
	int size;

	public Card() {

	}

	public Card(String cardtype, int size) {
		super();
		this.cardtype = cardtype;
		this.size = size;
	}

	void show() {
		System.out.println("Welcome");
		System.out.println("Shop for gift cards");
	}

	abstract void showcard();

}

class Birthdaycard extends Card {
	String name;
	String date;

	Birthdaycard() {
		super();

	}

	public Birthdaycard(String cardtype, int size, String name, String date) {
		super(cardtype, size);
		this.name = name;
		this.date = date;
	}

	@Override
	void showcard() {
		System.out.println("Happy birthday greetings");

	}

}
class Weddingcard extends Card {
	String wname;
	String wdate;

	Weddingcard() {
		super();

	}

	public Weddingcard( String wname, String wdate,String cardtype, int size, String name, String date) {
		super(cardtype, size);
		this.wname = wname;
		this.wdate = wdate;
	}

	@Override
	void showcard() {
		System.out.println("Happy wedding anniversary greetings");

	}

}

public class Greeting {

	public static void main(String[] args) {
		Card b;
		b=new Birthdaycard();
		b.show();
		b.showcard();
		System.out.println("____________________________");
		
		b=new Weddingcard();
		b.show();
		b.showcard();
		

	}

}
