package com.lab;
//same
public class Printer 
{
	private int pid;
    private String pname;
    private float pprice;
    
    Printer()
    {
    	
    }
    Printer(int pid,String pname,float pprice)
    {
    	this.pid=pid;
    	this.pname=pname;
    	this.pprice=pprice;
    }
	
	public String toString() {
		return "pid=" + pid + ", pname=" + pname + ", pprice=" + pprice;
	}
    


}
