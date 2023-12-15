package com.design;

public class GetDeveloperType {
	
	public Developer getDeveloper(String type)
	{
		if(type==null)
			return null;
		else if(type.equalsIgnoreCase("Java"))
			return new JavaDeveloper();
		else if(type.equalsIgnoreCase("Python"))
			return new PythonDeveloper();
		else if(type.equalsIgnoreCase("FullStack"))
			return new FullStackDeveloper();
		
		return null;
	}

}
