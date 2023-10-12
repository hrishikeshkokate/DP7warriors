package com.arraylab;

import java.util.Arrays;
import java.util.Random;

public class Shufflearray {

	public static void main(String[] args) {
		
		int arr[]= {1,5,8,3,5,9,2};
				
				Random r=new Random();
				
				for(int i=0;i<arr.length;i++)
				{
					int temp=r.nextInt(arr.length);
					
					int ran=arr[temp];
					arr[temp]=arr[i];
					arr[i]=ran;
				}
				System.out.println(Arrays.toString(arr));

	}

}
