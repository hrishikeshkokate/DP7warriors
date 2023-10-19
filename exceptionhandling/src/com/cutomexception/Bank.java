package com.cutomexception;
class Account
{
	private int accid;
	private String name;
	private double balance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accid, String name, double balance) {
		super();
		this.accid = accid;
		this.name = name;
		this.balance = balance;
	}
	
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	void deposit(double amount)
	{
		balance+=amount;
		System.out.println("Amount deposited :"+amount);
		System.out.println("New balance :"+balance);
	}
	
	void withdraw(double amount)
	{
		try
		{
			if((this.balance-amount)<0)
			
				throw new InsufficientBalanceException("Your balance is too low");
				this.balance-=amount;
				System.out.println("Amount withdraw :"+amount);
				System.out.println("New balance :"+balance);
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e);
		}
	}
	@Override
	public String toString() {
		return "Account [accid=" + accid + ", name=" + name + ", balance=" + balance + "]";
	}
}
public class Bank {

	public static void main(String[] args) {
		
		Account a1=new Account();
		a1.setAccid(111);
		a1.setName("Hrishikesh");
		a1.setBalance(2000);
		
		a1.deposit(500);
		a1.withdraw(2500);
		a1.withdraw(300);
		

	}

}
