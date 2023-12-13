package com.methods;

//it is static method
//causes current thread to pause
//thread-long time consuming thread and does not

public class ThreadYield extends Thread {
	
	public void run()
	{
		for(int i=1;i<3;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i+"--> is running");

		}
	}

	public static void main(String[] args) {
		
		ThreadYield t1=new ThreadYield();
		ThreadYield t2=new ThreadYield();
		
		t1.start();
		t2.start();
		
		for(int i=0;i<=100;i++)
		{
			Thread.yield();
			System.out.println(Thread.currentThread().getName()+":"+i+"--> is running");
		}
		
		

	}

}
