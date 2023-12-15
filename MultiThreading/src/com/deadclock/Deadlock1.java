package com.deadclock;

class Test {

	// synchronized void javaTest(Test1)
	synchronized void javaTest() {
		System.out.println(Thread.currentThread().getName() + ": java test has started");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ":Java test completed");
		// t.sqlTest();

		System.out.println(Thread.currentThread().getName() + ":Test completed..........");

	}

	synchronized void sqlTest() {
		System.out.println(Thread.currentThread().getName() + ": sql test has started");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ":Sql test completed");

	}

}

class Student1 extends Thread {
	Test t1;
	Test t2;

	public Student1(Test t1, Test t2) {
		this.t1 = t1;
		this.t2 = t2;
	}

	public void run() {
		t1.javaTest();
		t2.sqlTest();
	}

}

class Student2 extends Thread {
	Test t1;
	Test t2;

	public Student2(Test t1, Test t2) {
		this.t1 = t1;
		this.t2 = t2;
	}

	public void run() {
		t2.javaTest();
		t1.sqlTest();
	}

}

public class Deadlock1 {

	public static void main(String[] args) throws InterruptedException {

		Test obj1 = new Test();
		Test obj2 = new Test();

		Student1 s1 = new Student1(obj1, obj2);
		Student2 s2 = new Student2(obj1, obj2);

		s1.start();
		// s1.join(); // Solution
		s2.start();

	}

}
