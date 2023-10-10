package com.lab;

public class Booking {

	public static void main(String[] args) {
		
		
		Movie m=new Movie("RRR",9.5f);
		
		Theater tr[]=new Theater[2];
		tr[0]=new Theater(111,"PVR","Hinjawadi",m);
		tr[1]=new Theater(222,"INOX","Wakad",m);
		
		for(Theater t:tr)
		{
			System.out.println(t);
		}

	}

}
