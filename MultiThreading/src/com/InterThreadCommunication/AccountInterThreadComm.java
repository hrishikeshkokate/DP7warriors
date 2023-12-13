package com.InterThreadCommunication;

class Account{
	
	int balance=1000;
	
	public synchronized void withdrawl(int amount) {
		
		System.out.println("--------------------------");
		System.out.println(Thread.currentThread().getName()+" want to withdraw:"+amount);
		if((balance-amount)<0) {
			System.out.println("Insufficient Balannce:"+balance);
			System.out.println(Thread.currentThread().getName()+" is waiting for deposit.");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			withdrawl(amount);
		}
		else {
			balance-=amount;
			System.out.println("------------------");
			System.out.println("Withdraw Successfull by :"+Thread.currentThread().getName());
			System.out.println("Account Balance:"+balance);
			System.out.println("-----------------------");
		}
	}
	
	public synchronized void deposit(int amount) {
		balance+=amount;
		System.out.println("--------------------------");
		System.out.println(Thread.currentThread().getName()+" has Deposited:"+amount);
		System.out.println("Account Balance:"+balance);
		notifyAll();
		System.out.println("-------------------");
	}
}

public class AccountInterThreadComm {

	public static void main(String[] args) {
		
		Account a1=new Account();
		
		Thread t1=new Thread()
				{
					public void run() {
						a1.withdrawl(2000);
					}
				};
				t1.setName("Son");
				
		Thread t2=new Thread()
				{
					public void run() {
						a1.withdrawl(2000);
					}
				};
				t2.setName("Dauther");
				
		Thread t3=new Thread()
				{
					public void run() {
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						a1.deposit(1000);
					}
				};
				t3.setName("Father");
				
		Thread t4=new Thread()
				{
					public void run() {
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						a1.deposit(3000);
					}
				};
				t4.setName("Mother");
				
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
