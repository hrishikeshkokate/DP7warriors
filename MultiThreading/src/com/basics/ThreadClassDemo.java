package com.basics;

public class ThreadClassDemo extends Thread{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		ThreadClassDemo t1=new ThreadClassDemo();//thread 0
		ThreadClassDemo t2=new ThreadClassDemo();
		ThreadClassDemo t3=new ThreadClassDemo();
		

		//separate call stack trace is create to promote contex switching
		
	}

}
