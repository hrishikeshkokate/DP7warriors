package com.LabAssignment;

class PriorityTask implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " is running " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadPriorityExample5 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new PriorityTask(), "Thread 1");
		Thread t2 = new Thread(new PriorityTask(), "Thread 2");

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();
	}
}
