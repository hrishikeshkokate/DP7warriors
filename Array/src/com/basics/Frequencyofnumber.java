package com.basics;

public class Frequencyofnumber {
	static void frequency(char arr[]) {
		int count;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '0')
				continue;
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
					arr[j] = '0';
				}
			}
			System.out.println(arr[i] + "-->" + count);
		}
	}

	public static void main(String[] args) {

		char arr[] = {'a','b','c','a','c','d','a'};
		frequency(arr);

	}

}
