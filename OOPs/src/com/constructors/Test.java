package com.constructors;

class Test {
	int a;
	int b;
	String name;

	Test() {
		System.out.println("Default constructor");
		this.a = 10;
		this.b = 20;
		this.name = "unknown";
		System.out.println("Task has to be done everytime");
	}

	Test(int a, int b) {
		this();
		System.out.println("Param constructor");
		this.a = a;
		this.b = b;
		this.name = name;
	}

	Test(int a, int b, String name) {
		this();
		System.out.println("Param constructor");
		this.a = a;
		this.b = b;
		this.name = name;

	}

	public String toString() {
		return "a=" + a + ", b=" + b + ", name=" + name + "";
	}

	public static void main(String[] args) {
		System.out.println("________________________");
		Test t1 = new Test();
		System.out.println(t1);

		System.out.println("________________________");
		Test t2 = new Test(30, 40);
		System.out.println(t2);

		System.out.println("________________________");
		Test t3 = new Test(300, 400);
		System.out.println(t3);

	}
}
