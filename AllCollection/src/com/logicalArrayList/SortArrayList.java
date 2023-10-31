package com.logicalArrayList;
import java.util.ArrayList;
public class SortArrayList {
	
	static void sort(ArrayList<Integer> list)
	{
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)>list.get(j))
				{
					int temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
					
				}
			}
			System.out.println(list.get(i));
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> i1=new ArrayList<>();
		
		i1.add(5);
		i1.add(20);
		i1.add(4);
		i1.add(15);
		i1.add(40);
		i1.add(9);
		i1.add(7);
		i1.add(6);
		
		sort(i1);
	}
}
