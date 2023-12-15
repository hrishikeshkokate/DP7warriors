package com.synchronization;

class TableR {
	public void printTable(int n) {

		System.out.println(Thread.currentThread().getName() + " is started");

		synchronized (this) 
		{
			for (int i = 0; i <= 10; i++) {
				System.out.println(n + "x" + i + "=" + (n * i));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		try 
		{
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName() + " has finished");

	}
}

public class ThreadWithSyncBlock {
	public static void main(String[] args) {

		TableR obj = new TableR();

		Thread t1 = new Thread() {
			public void run() {
				obj.printTable(2);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				obj.printTable(5);
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				obj.printTable(9);
			}
		};
		t1.start();
		t2.start();
		t3.start();
	}
}
