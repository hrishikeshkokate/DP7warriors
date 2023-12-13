package com.methods;

public class ThreadSleepInterrupt extends Thread {

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName() + " :" + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println(e);
					}

				}
				System.out.println(Thread.currentThread().getName() + " has finished..........");
			}

		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 11; i <= 15; i++) {
					if (Thread.interrupted()) {
						System.out.println(Thread.currentThread().getName() + "-->Interrupt :" + i);

						//System.out.println(Thread.currentThread().getName() + " :" + i);
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							System.out.println(e);
						}
					} 
					else
					{
						System.out.println(Thread.currentThread().getName() + "-->Normal :" + i);

					}

				}
				System.out.println(Thread.currentThread().getName() + " has finished..........");
			}

		};
		Thread t3 = new Thread() {
			public void run() {
				//t2.interrupt();

				for (int i = 21; i <= 25; i++) {
					//t2.interrupt();
					System.out.println(Thread.currentThread().getName() + " :" + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println(e);
					}

				}
				System.out.println(Thread.currentThread().getName() + " has finished..........");
			}

		};

		//t1.interrupt();
		t2.interrupt();
		t1.start();
		//t2.interrupt();
		t2.start();
		t3.start();
		
	}

}
