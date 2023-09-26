package com.lab;

public class Printer1 
{
	private int pid;
    private String pname;
    private float pprice;
    
    Printer1()
    {
    	
    }
    Printer1(int pid,String pname,float pprice)
    {
    	this.pid=pid;
    	this.pname=pname;
    	this.pprice=pprice;
    }
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPprice() {
		return pprice;
	}
	public void setPprice(float pprice) {
		this.pprice = pprice;
	}

	public String toString() {
		return "\n\nprinter detail\npid=" + pid + ", \npname=" + pname + ", \npprice=" + pprice ;
	}
    

}
