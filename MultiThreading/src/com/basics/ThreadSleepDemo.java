package com.basics;

public class ThreadSleepDemo extends Thread {
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" :"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
			
		}
		System.out.println(Thread.currentThread().getName()+" has finished..........");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadSleepDemo t1= new ThreadSleepDemo();
		t1.setName("First");
		
		ThreadSleepDemo t2= new ThreadSleepDemo();
		t2.setName("Second");
		
		ThreadSleepDemo t3= new ThreadSleepDemo();
		t3.setName("Third");
		
		t1.start();
		t2.start();
		t3.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" :"+i);
			Thread.sleep(500);
		}
		
		System.out.println(Thread.currentThread().getName()+" has finished....");
	}

}
