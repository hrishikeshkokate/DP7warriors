package com.revision;

public class Frequency {

	static void countfrequency(char arr[]) {

		int count;

		for (char i = 0; i < arr.length; i++) {
			if(arr[i]=='0')
				continue;
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j]='0';
				}
			}
			if(count>=0) {
				System.out.println(arr[i] + "-->" + count);
			}
		}
	}
	public static void main(String[] args) {

		char ch[] = { 'a', 'b', 'c', 'a', 'c', 'a' };
		countfrequency(ch);
	}
}
