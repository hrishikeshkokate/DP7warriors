package com.designEmployee;

public class GetEmployeeType {
	public Employee getEmployee(String type)
	{
		if(type==null)
			return null;
		else if(type.equalsIgnoreCase("HrManager"))
			return new HrManager();
		else if(type.equalsIgnoreCase("SoftwareTester"))
			return new SoftwareTester();
		else if(type.equalsIgnoreCase("SoftwareDeveloper"))
			return new SoftwareDeveloper();
		
		return null;
	}

}
