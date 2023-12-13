package com.synchronization;

class Mytable {
	public synchronized void printTable(int n) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(n + "X" + i + "=" + (n * i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadWithSync {
	public static void main(String[] args) {

		Mytable obj = new Mytable();

		Thread t1 = new Thread() 
		{
			public void run()
			{
				obj.printTable(2);
			}
		};
		Thread t2 = new Thread() 
		{
			public void run()
			{
				obj.printTable(5);
			}
		};
		Thread t3 = new Thread() 
		{
			public void run()
			{
				obj.printTable(9);
			}
		};
		t1.start();
		t2.start();
		t3.start();
	}
}
