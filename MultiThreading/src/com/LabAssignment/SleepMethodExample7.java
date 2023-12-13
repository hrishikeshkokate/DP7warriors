package com.LabAssignment;

public class SleepMethodExample7 {
	public static void main(String[] args) {
		Thread sleepThread = new Thread(new SleepTask());

		
		sleepThread.start();
	}
}

class SleepTask implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Iteration " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
