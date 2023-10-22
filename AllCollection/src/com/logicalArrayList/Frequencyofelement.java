package com.logicalArrayList;

import java.util.ArrayList;

public class Frequencyofelement {
	static void frequency(ArrayList<String> list)
	{
		int count=0;
		for(int i=0;i<list.size();i++)
		{
			count=1;
			if(list.get(i).equals("Visited"))
				continue;
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					count++;
					list.set(j, "Visited");
				}
				
			}
			System.out.println(list.get(i)+"-->"+count);
//			if(count>1) duplicate
//				//if(count==1) unique
//			{
//				System.out.println(list.get(i));
//			}
		}
	}

	public static void main(String[] args) {
		
		ArrayList<String> i1=new ArrayList<>();
		
		i1.add("A");
		i1.add("B");
		i1.add("C");
		i1.add("D");
		i1.add("B");
		i1.add("C");
		i1.add("B");
		i1.add("E");
		
		frequency(i1);
		
		

	}

}
