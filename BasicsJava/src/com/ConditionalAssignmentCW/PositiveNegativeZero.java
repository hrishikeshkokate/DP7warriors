package com.ConditionalAssignmentCW;
import java.util.Scanner;
public class PositiveNegativeZero {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         int num=sc.nextInt();
         
         if(num>0)
         {
        	 System.out.println(num+" is positive"); 
         }
         else if(num<0)
         {
        	 System.out.println(num+" is negative");
         }
         else
         {
        	 System.out.println(" is zero");
         }
         sc.close();
	}

}
