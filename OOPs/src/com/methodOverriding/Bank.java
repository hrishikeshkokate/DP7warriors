package com.methodOverriding;

class Account
{
	private int accno;
	private String name;
	protected int balance;
	protected int rateofinterest;
	
	public Account()
	{
		
	}
	public Account(int accno,String name,int balance)
	{
		super();
		this.accno=accno;
		this.name=name;
		this.balance=balance;
		
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getRateofinterest() {
		return rateofinterest;
	}
	public void setRateofinterest(int rateofinterest) {
		this.rateofinterest = rateofinterest;
	}
	 void deposit(int amount)
	 {
		 balance+=amount;
	 }
	 void withdraw(int amount)
	 {
		 if((balance-amount)>0)
		 {
			 balance-=amount;
		 }
		 else
		 {
			 System.out.println("Insufficient balance :"+balance);
		 }
	 }
}
class Savingaccount extends Account
{
	private String pannumber;
	
	Savingaccount()
	{
		super();
	}
	Savingaccount(int accno,String name,int balance)
	{
		super(accno,name,balance);
		this.pannumber=pannumber;	
	}
	public String getPannumber() {
		return pannumber;
	}
	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}
	
	public int getRateofinterest()
	{
		rateofinterest=8;
		return rateofinterest;
	}
	
	void deposit(int amount)
	{
		int b=balance+amount;
		if(b>50000)
		{
			if(pannumber!=null)
			{
				balance=b;
			}
			else
			{
				System.out.println("Please enter your pan number as yur balance is getting above 50000");
			}
		}
	}
	void withdraw(int amount)
	{
		if((balance-amount)>1000)
    {
    	balance-=amount;
	}
    else
    {
    	System.out.println("insufficient balance:"+balance);
    }
	}
}
public class Bank {

	public static void main(String[] args) {
		Account a1=new Account(101,"Hrishi",1000);
		
		System.out.println("Account details:"+a1.getAccno()+" "+a1.getBalance());
		
		System.out.println("Rate:"+a1.getRateofinterest());
		
		a1.withdraw(900);
		System.out.println("Balance:"+a1.getBalance());
		
        a1.deposit(67000);
        System.out.println("Balance:"+a1.getBalance());
        
        System.out.println("________________________");
        
        Savingaccount s1=new Savingaccount(10211,"Aniket",20000);
	}

}
