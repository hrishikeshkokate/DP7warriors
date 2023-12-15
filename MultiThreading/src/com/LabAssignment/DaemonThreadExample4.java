package com.LabAssignment;

class DaemonTask implements Runnable {
	@Override
	public void run() 
	{
		while (true) 
		{
			System.out.println("Daemon thread is running...");
			try 
			{
				Thread.sleep(500);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class DaemonThreadExample4 {
	public static void main(String[] args) {

		Thread dt = new Thread();

		dt.setDaemon(true);

		dt.start();

		try {
			Thread.sleep(2000); // Sleep for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Main thread exiting. Daemon thread is still running.");

	}
}
