package com.InterThreadCommunication;

class SharedResource {

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
		//System.out.println(Thread.currentThread().getName() + "has locked method one");
		//System.out.println(Thread.currentThread().getName() + "has released method one");
		try
		{
			Thread.sleep(1500);
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}

		 notify();//wakes up any single thread in wait() state
		System.out.println(Thread.currentThread().getName() + "has notified");

	}
}

public class InterThreadComm {
	public static void main(String[] args) {

		SharedResource obj = new SharedResource();

		Thread t1 = new Thread() {
			public void run() {
				obj.methodOne();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				obj.methodTwo();
			}
		};
		t1.start();
		t2.start();
	}
}
