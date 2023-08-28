package com.Labwork;

public class LowerToUpper {

	public static void main(String[] args) {

       char ch='a';
       
       char ch2=(char)(ch-32);
       System.out.println(ch2);
       
       //there is difference of 32 between a and A of ascii value
       //using this we can convert any lower case to upper case just by 
       //substrating 32 from it                
       
       char c='A';
       char c1=(char)(c+32);
       System.out.println(c1);
	}

}
