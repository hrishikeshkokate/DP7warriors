package com.basics;

public class ThreadNamePriority extends Thread {
	
	public void run()
	{
		System.out.println("Thread Name:"+Thread.currentThread().getName());
		System.out.println("Priority:"+Thread.currentThread().getPriority());
		
		System.out.println("----------------------------------");
	}
	
	public static void main(String[] args) {
		
		ThreadNamePriority t1= new ThreadNamePriority();
		ThreadNamePriority t2= new ThreadNamePriority();
		ThreadNamePriority t3= new ThreadNamePriority();
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		
		
		// By default -5 , Range : 1 to 10

		t3.setPriority(MAX_PRIORITY); // 10
		//t1.setPriority(MIN_PRIORITY);
		t1.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
