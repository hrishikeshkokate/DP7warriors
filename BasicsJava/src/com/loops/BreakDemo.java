package com.loops;

public class BreakDemo {

	public static void main(String[] args) {
		
     for(int i=0;i<10;i++)
     {
    	 //System.out.println(i); //if this statement is printed here it will
    	 if(i==5)                 //give output 0 1 2 3 4 5 
                                  //which is because first it is printing then 
    		                      //checking
    		 break;
     System.out.println(i);
     }
	}

}
