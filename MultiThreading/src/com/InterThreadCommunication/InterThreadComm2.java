package com.InterThreadCommunication;

class SharedR {

	public synchronized void methodOne() 
	{
		System.out.println(Thread.currentThread().getName() + "has locked method one");
		System.out.println(Thread.currentThread().getName() + "has released method one");
		try 
		{
			wait();
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName() + "has finished the task");

	}

	public synchronized void methodTwo() 
	{
		 notifyAll();//wakes up any single thread in wait() state
		System.out.println(Thread.currentThread().getName() + "has notified");

	}
}

public class InterThreadComm2 {
	public static void main(String[] args) {

		SharedR obj = new SharedR();

		Thread t1 = new Thread() {
			public void run() {
				obj.methodOne();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				obj.methodOne();
			}
		};
		Thread t3 = new Thread() 
		{
			public void run() 
			{
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				obj.methodTwo();
			}
		};
		t1.start();
		t2.start();
		t3.start();
	}
}
