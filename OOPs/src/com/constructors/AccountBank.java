package com.constructors;

public class AccountBank 
{
 static void status(Account a)
 {
	 if(a.getBalance()>0) {
		 a.setStatus("Active");
	 }
	 else {
		 a.setStatus("Deactive");
	 }
	 
	 
 }
	public static void main(String[] args) 
	{
		Account a1=new Account(101,"hrishi","unknown",50000);
		Account a2=new Account(102,"aniket","unknown",55000);
		Account a3=new Account(103,"suraj","unknown",0);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		status(a1);
		status(a2);
		status(a3);
		
		System.out.println("___________after______________");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

	}

}
