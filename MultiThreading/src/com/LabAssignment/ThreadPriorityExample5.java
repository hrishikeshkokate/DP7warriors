package com.LabAssignment;

public class ThreadPriorityExample5 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new PriorityTask(), "Thread 1");
		Thread thread2 = new Thread(new PriorityTask(), "Thread 2");

		
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.MAX_PRIORITY);

		
		thread1.start();
		thread2.start();
	}
}

class PriorityTask implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " is running - Iteration " + i);
			try {
				Thread.sleep(100); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
