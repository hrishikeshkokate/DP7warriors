package com.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) 
	{

//		if(s1.getAge()==s2.getAge())
//				return s1.getName().compareTo(s2.getName());
//		if(s1.getAge()>s2.getAge())
//			return 1;
//		else
//			return -1;
		int namecomp=s1.getName().compareTo(s2.getName());
		
		if(namecomp==0)
		return Integer.compare(s1.getAge(), s2.getAge());
		
		return namecomp;
		
	}

	
}
