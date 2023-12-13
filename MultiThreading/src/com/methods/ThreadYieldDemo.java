package com.methods;

public class ThreadYieldDemo extends Thread {

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 100; i++) {
					Thread.yield();
					System.out.println(Thread.currentThread().getName() + " :" + i);

				}
				System.out.println(Thread.currentThread().getName() + " has finished..........");
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 11; i <= 15; i++) {

					System.out.println(Thread.currentThread().getName() + " :" + i);

				}
				System.out.println(Thread.currentThread().getName() + " has finished..........");
			}
		};
		t1.start();
		t2.start();
	}
}
