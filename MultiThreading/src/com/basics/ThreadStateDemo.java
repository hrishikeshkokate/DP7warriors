package com.basics;

public class ThreadStateDemo {

	public static void main(String[] args) {
		
		Thread.State[] states=Thread.State.values();
		
		for(Thread.State s:states)
		{
			System.out.println(s);
			/*
			  NEW
			  RUNNABLE
			  BLOCKED
			  WAITING
			  TIMED_WAITING
			  TERMINATED
			*/
		}

	}

}
