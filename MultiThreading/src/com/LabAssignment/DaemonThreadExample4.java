package com.LabAssignment;

public class DaemonThreadExample4 {
	public static void main(String[] args) {

		Thread daemonThread = new Thread(new DaemonTask());

		daemonThread.setDaemon(true);

		daemonThread.start();

		try {
			Thread.sleep(2000); // Sleep for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Main thread exiting. Daemon thread is still running.");

	}
}

class DaemonTask implements Runnable {
	@Override
	public void run() {
		while (true) {
			System.out.println("Daemon thread is running...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
