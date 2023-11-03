package com.comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) 
	{

		if(s1.getAge()==s2.getAge())
				return s1.getName().compareTo(s2.getName());
		if(s1.getAge()>s2.getAge())
			return 1;
		else
			return -1;
	}

	
}
