package com.LabAssignment;

class DefaultPriorityTask implements Runnable {
	@Override
	public void run() {
		System.out.println(
				Thread.currentThread().getName() + " has default priority: " + Thread.currentThread().getPriority());
	}
}

public class DefaultPriorityExample6 {
	public static void main(String[] args) {
		Thread thread = new Thread(new DefaultPriorityTask(), "DefaultPriorityThread");

		// Start the thread
		thread.start();
	}
}
