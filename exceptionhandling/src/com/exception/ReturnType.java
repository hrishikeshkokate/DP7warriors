package com.exception;

public class ReturnType {

	static int method1(int data) {
		try {
			return 30 / data;
		}

		catch (Exception e) {
			System.out.println(e);
		}

		return 0;

	}

	static int method2(int data) {
		try {
			return 30 / data;
		}

		catch (Exception e) {
			System.out.println(e);
			return 0;
		}

		// return -1;

	}

	@SuppressWarnings("finally")

	static int method3(int data) {
		try {
			return 30 / data;
		}

		catch (Exception e) {
			System.out.println(e);
			return 0;
		}

		finally {
			return -1;
		}

		// return -1;

	}

	public static void main(String[] args) {

		System.out.println(method1(0));
		System.out.println(method1(2));

		System.out.println("---------------------------");

		System.out.println(method3(2));
		System.out.println(method3(0));

	}
}
