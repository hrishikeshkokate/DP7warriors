package com.exception;

public class SecondException {

	public static void main(String[] args) {

		try {
			String s = null;

			System.out.println(s.length());

			int arr[] = { 1, 2, 3 };

			System.out.println("Value:" + arr[0]);

		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Rest of the code...");
	}

}
