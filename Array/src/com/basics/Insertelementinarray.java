package com.basics;
import java.util.Arrays;
import java.util.Scanner;
public class Insertelementinarray {
	public static void insert(int arr[], int index, int value) 
	{
		for (int i = arr.length-1; i>index;i--) 
		{
			arr[i]=arr[i-1];
		}
		arr[index]=value;
		
	}
	public static void main(String[] args) {

		int arr[]=new int[6];
		Scanner sc=new Scanner(System.in);
        System.out.println("element :");
        for(int i=0;i<5;i++)
        {
        	arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
		insert(arr,3,100);
		System.out.println(Arrays.toString(arr));
	}
}
