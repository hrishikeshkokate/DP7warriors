package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PositionOfString {

	public static void main(String[] args) {
		
		ArrayList<String> i1=new ArrayList<>();
		
		i1.add("Suraj");
		i1.add("Kailash");
		i1.add("Hrishikesh");
		i1.add("Anuj");
		i1.add("Shivam");
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name to search for: ");
        String nameToSearch = scanner.nextLine();

        int position = i1.indexOf(nameToSearch);
        
        if (position != -1)
        {
            System.out.println(nameToSearch + " at position " + (position + 1));
        } 
        else
        {
            System.out.println(nameToSearch + " not found in the list.");
        }
    }

	}


