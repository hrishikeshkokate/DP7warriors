package com.filehandling;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderConsole {
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter full name:");
		
		try {
			String name= br.readLine();
			System.out.println("welcome: "+name);
		} 
		catch (IOException e) {
			System.out.println(e);
		
	   }

		
	}
}


