package com.loosecoupling;

interface Payment {
	public void doTransaction(double amount);

}

class Creditcard implements Payment {
	private int cardno;
	private int cvv;
	private double limit;

	public Creditcard() {

	}

	public Creditcard(int cardno, int cvv, double limit) {
		super();
		this.cardno = cardno;
		this.cvv = cvv;
		this.limit = limit;
	}

	@Override
	public void doTransaction(double amount) {

		if ((this.limit - amount) > 0) {
			System.out.println("Credit card id debited by :" + amount);
			this.limit -= amount;
		} else {
			System.out.println("Limit reached :" + this.limit);
		}

	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	public int getCardno() {
		return cardno;
	}

	public int getCvv() {
		return cvv;
	}

}

class Debitcard implements Payment {
	private int cardNumber;
	private double balance;

	public Debitcard() {

	}

	public Debitcard(int cardNumber, double balance) {
		super();
		this.cardNumber = cardNumber;
		this.balance = balance;
	}

	public void doTransaction(double amount) {
		if ((this.balance - amount) >= 1000) {
			System.out.println("Debit card is debited by :" + amount);
			this.balance -= amount;
		} else {
			System.out.println("Insufficient balance :" + this.balance);
		}

	}

}

public class Shopping {
	String name;
	long mno;

	public Shopping() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shopping(String name, long mno) {
		super();
		this.name = name;
		this.mno = mno;
	}

	public void paybill(Payment p, float amt) {
		p.doTransaction(amt);
	}

	public void paybill(Payment p, float amt, float discount) {
		amt = amt - ((discount / 100) * amt);
		p.doTransaction(amt);
	}

	public static void main(String[] args) {
		Shopping customer = new Shopping("Hrishikesh", 656115915);

		Creditcard c1 = new Creditcard(54454, 568, 50000);

		customer.paybill(c1, 40000);

		Debitcard d1 = new Debitcard(54681, 550000);

		customer.paybill(d1, 35000, 10);

	}

}
