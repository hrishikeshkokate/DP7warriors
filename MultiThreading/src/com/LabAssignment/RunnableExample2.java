package com.LabAssignment;

class MyRunnable implements Runnable {
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " -> " + i);
			
			try {
				Thread.sleep(1500);
				System.out.println("Complete");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class RunnableExample2 {
	public static void main(String args[]) {

		MyRunnable r1 = new MyRunnable();

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		
		
		t1.start();
		t2.start();
	}
}
