package com.loops;

public class SumOfEvenNumber1To20 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				sum = sum + i;

			}

		}
		System.out.println(sum);
	}

}
