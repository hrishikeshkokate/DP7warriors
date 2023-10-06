package com.basics;

public class Duplicateelements {
	static void same(char arr[]) {
		char count;
		for (char i = 0; i < arr.length; i++) {
			//if (arr[i] == '0')
				//continue;
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
					//arr[j] = '0';
				}
			}
			if(count>1)//if count==1 it will display unique element
			{
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		char arr[] = {'a','b','c','a','c','d','a'};
		same(arr);
	}
}
