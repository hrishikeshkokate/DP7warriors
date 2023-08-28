package com.loops;

public class Print3or5 {

	public static void main(String[] args) {
		

		for (int i = 1; i <= 20; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("bye");
			} else if (i % 5 == 0) {
				System.out.println("Welcome");
			} else if (i % 3 == 0) {
				System.out.println("hello");
			} else {
				System.out.println(i);
			}
		}

	}

}
