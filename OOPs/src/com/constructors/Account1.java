package com.constructors;

public class Account1 
{
	int balance;
	String name;
	int salary;
	
	Account1()
	{
		
	}
	
	Account1(int balance,String name)
	{
		this.balance=balance;
		this.name=name;
		System.out.println("param const");
	}
	Account1(int balance,String name,int salary)
	{
		this.balance=balance;
		this.name=name;
		salary=38000;
		System.out.println("param const");
	}
	
	void display() 
	{
		int salary=this.salary;
		System.out.println("Hi " + name);
		this.show();
	}
	
	void show() 
	{
		System.out.println(this.name+""+this.balance+""+salary);
	}
	
	public String toString() {
		return "name=" + name + ", balance=" + balance + ", salary=" + salary + "";
	}

	public static void main(String[] args) 
	{
		Account a1= new Account();
		System.out.println(a1);
		
		
	}


}
