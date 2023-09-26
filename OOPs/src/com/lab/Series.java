package com.lab;

public class Series {
	static void checkSeries() {
		int n = 10;
		System.out.println("Series:");
		for (int i = 1; i <= n; i++) {
			int num = i * i + i * i * i;
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		checkSeries();
	}

}
