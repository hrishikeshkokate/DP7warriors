package com.arraylist;

import java.util.ArrayList;

public class First50Odd {

	public static void main(String[] args) {

		ArrayList<Integer> odd = new ArrayList<Integer>();

		for (int i = 1; odd.size() <= 50; i += 2) {
			odd.add(i);

		}
		System.out.println(odd);

	}

}
