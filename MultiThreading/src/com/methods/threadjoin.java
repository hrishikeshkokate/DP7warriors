package com.methods;

import com.basics.ThreadSleepDemo;

//import com.multithreading.ThreadSleepDemo;

public class threadjoin extends Thread {
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println(Thread.currentThread().getName()+" has finished..." );
	}

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadSleepDemo t1=new ThreadSleepDemo();
		t1.setName("First");
		
		ThreadSleepDemo t2=new ThreadSleepDemo();
		t2.setName("second");
		
		ThreadSleepDemo t3=new ThreadSleepDemo();
		t3.setName("third");
		
		t1.start();
		t1.join();
		//t2.interrupt();
		t2.start();
		//t2.join();
		t2.join(500);
		t3.start();

	}

}
