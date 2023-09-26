package com.constructors;

class Demo {
	int a;
	int b;
	String name;

	Demo() {
		this(10, 20);
		System.out.println("Default constructor");
	}

	Demo(int a, int b) {
		System.out.println("Paramaterise constructor");
		this.a = a;
		this.b = b;
		this.name = "unknown";

	}

	Demo(int a, int b, String name) {
		System.out.println("Paramaterise constructor");
		this.a = a;
		this.b = b;
		this.name = name;
	}

	public String toString() {
		return "a=" + a + ", b=" + b + ", name=" + name + "";
	}

	public static void main(String[] args) {
		System.out.println("_____________________");
		Demo d1 = new Demo();
		System.out.println(d1);

		System.out.println("_____________________");
		Demo d2 = new Demo(20, 30);
		System.out.println(d2);

		System.out.println("_____________________");
		Demo d3 = new Demo(200, 300, "Hrishi");
		System.out.println(d3);

	}
}
