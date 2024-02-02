package com.basics;
import java.util.Arrays;
public class Duplicateint {
	static void findDuplicates(int arr[]) {
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++)
		{
			count = 1;
			flag = false;
			for (int j = i - 1; j >= 0; j--)
			{
				if (arr[i] == arr[j]) 
				{
					 //System.out.println("Duplicate : " + arr[i]);
					flag = true;
					break;
				}
			}
			if (flag == false)
			{
				for (int k = i + 1; k < arr.length; k++)
				{
					if (arr[i] == arr[k])
					{
						count++;
					}
				}
				System.out.println(arr[i] + "-->" + count);
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 2, 4, 6, 3 };

		findDuplicates(arr);
		System.out.println(Arrays.toString(arr));
	}
}
