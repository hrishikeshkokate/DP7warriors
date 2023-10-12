package com.inner;
class Bank
{
	private String bname="SBI bank";
	String banklocation;
	String ifscCode;
	String aName;
	int accNo;
	
	{
		banklocation="Pune";
		ifscCode="SBINPU1234";
	}
	Bank()
	{
		
	}
	Bank(int accNo,String aName)
	{
		this.accNo=accNo;
		this.aName=aName;
		
	}
	void displayBankDetails()
	{
		System.out.println("Bank name: "+bname);
		System.out.println("bank location: "+" "+banklocation);
		System.out.println(ifscCode);
	}
	class Locker
	{
		int lockerid;
		String password;
		static float lockerRent=2000;
		
		Locker()
		{
			
		}
		Locker(int lockerid,String password)
		{
			this.lockerid=lockerid;
			this.password=password;
			
		}
		void displaylockerdetails()
		{
			displayBankDetails();
			System.out.println("Locker belongs to "+aName+" with acc no "+accNo);
			System.out.println("locker id: "+lockerid);
			System.out.println("Rent to be paid: "+lockerRent);
		}
		
	}
	
}
public class Simpleinnerdemo {

	public static void main(String[] args) {
		
		//Bank$Locker
		//1st way
		Bank cust1=new Bank(46468,"Hrishikesh");
		cust1.displayBankDetails();
		
		System.out.println("________________________________");
		
		Bank.Locker locker1= cust1.new Locker(101,"H12345");
		locker1.displaylockerdetails();
		
		//2nd way
		
		System.out.println("________________________________");
		
		Bank.Locker cust2=new Bank(1234567,"Aniket").new Locker(103,"ABC113");
		cust2.displaylockerdetails();
		

	}

}
