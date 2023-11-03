package com.treemap;

import java.util.Comparator;

public class CustomerOrderComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		if(c1.getMobileNo()==c2.getMobileNo())
		return 0;
		if(c1.getMobileNo()>c2.getMobileNo())
			return 1;
		else
			return -1;
		
	}

}
