package com.methods;

public class ThreadDaemon implements Runnable {

	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName() + " is daemon thread");
		} else {
			System.out.println(Thread.currentThread().getName() + " is user thread");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDaemon r1 = new ThreadDaemon();
		ThreadDaemon r2 = new ThreadDaemon();

		Thread t;
		t = new Thread(r1, "first");
		t.start();

		t = new Thread(r2, "second");
		t.setDaemon(true);
		t.start();

	}

}
