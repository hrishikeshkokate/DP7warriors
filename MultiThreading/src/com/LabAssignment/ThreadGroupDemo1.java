package com.LabAssignment;

public class ThreadGroupDemo1 implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()); 
		
	}
	public static void main(String[] args) {
		
		ThreadGroupDemo1 obj=new ThreadGroupDemo1();
		
		ThreadGroup tg1=new ThreadGroup("parent threadgroup");
		ThreadGroup tg2=new ThreadGroup("child threadgroup");
		
		Thread t1=new Thread(tg1,obj,"one");
		t1.start();
		
		Thread t2=new Thread(tg1,obj,"two");
		t2.start();
		
		Thread t3=new Thread(tg2,obj,"three");
		t3.start();
		
		System.out.println("Thread Group Name: "+tg1.getName());
		System.out.println("Thread Group Name: "+tg2.getName()); 
	    //tg1.list();

	}

	

}
