package com.logical;

import java.util.Comparator;

public class Employee  {

	private int eid;
	private String ename;
	private double esal;

	public Employee() {
		super();
	}

	public Employee(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
//
//	@Override
//	public int compareTo(Employee o) {
////		if(this.eid==o.eid)
////			return 0;
////		else if(this.eid>o.eid)
////			return 1;
////		else
////			return -1;
//		return (int) (this.esal - o.esal);
//	}



//class IDCompare implements Comparator<Employee> {
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		if(o1.getEid()==o2.getEid())
//			return 0;
//		else if(o1.getEid()>o2.getEid())
//			return 1;
//		else
//			return -1;
//	}
//
//}

//class NameCompare implements Comparator<Employee>{
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		return o1.getEname().compareTo(o2.getEname());
//	}
	
//}

public int compareTo(Employee e) {
	
   if(this.getEname().compareTo(e.getEname()))
   return (int) (this.getEsal()-e.getEsal());
		   else if(this.getEname().compareTo(e.getEname()))
				   return 1;
				   else
					   return -1;
					   
			   
	
}
}
