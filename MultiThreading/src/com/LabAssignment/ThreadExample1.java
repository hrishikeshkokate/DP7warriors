package com.LabAssignment;

class MyThread extends Thread {
	public void run() {
		
		for (int i = 100; i < 250; i++) {
			System.out.println(Thread.currentThread().getName()+ " -> " + i);
		}
	}
}

public class ThreadExample1 {
	public static void main(String args[]) {
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();

		
		t1.start();
		t2.start();
	}
}
