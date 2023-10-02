package com.covariant;

class Person6 {
	int id;
	String name;
	float balance;

	Person6() {

	}

	public Person6(int id, String name, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
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

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	static Person6 display() {
		Person6 p = new Person6();
		return p;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}

class Paytm {
	public static Person6 display()
	{
		Person6 p = new Person6();
		
		p.setId(101);
		p.setName("Hrishikesh");
		p.setBalance(20000);
		return p;

	}

}
class Bank5
{
	int withdraw=1000;
	
	Bank5()
	{
		
	}
	Bank5(int withdraw)
	{
		this.withdraw=withdraw;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	
	
	
	
}

public class Bank6 {

	public static void main(String[] args) {

		Person6 p ;
		p= Paytm.display();

		System.out.println("Id " + p.getId() + "\nname " + p.getName() + "\nbalance " + p.getBalance());

	}

}
