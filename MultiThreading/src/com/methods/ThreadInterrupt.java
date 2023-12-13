package com.methods;

public class ThreadInterrupt extends Thread{
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			if(Thread.interrupted())
			{
				System.out.println("Interrupt :"+i);
			}
			else
			{
				System.out.println("Normal :"+i);
			}
		}
	}

	public static void main(String[] args) {
		
		ThreadInterrupt t1=new ThreadInterrupt();
		
		t1.start();
		t1.interrupt();
		

	}

}
