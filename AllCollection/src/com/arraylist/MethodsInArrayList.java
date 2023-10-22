package com.arraylist;

import java.util.ArrayList;

public class MethodsInArrayList {
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			ArrayList<String> al=new ArrayList<>();
			
			System.out.println(al.isEmpty());
			al.add("Java");
			al.add("Python");
			al.add("Angular");
			al.add("Spring");
			al.add("Java");
			al.add(null);
			al.add(null);
			System.out.println(al.isEmpty());
			System.out.println(al);
			
			
			//difference set and add
			al.add(2,"HTML");
			System.out.println(al);//add and shifts
			
			al.set(5,"Devops");
			System.out.println(al);//replaces
			
			ArrayList<String> al2=new ArrayList<>(5);
			
			al2.add(".net");
			al2.add("Sql");
			
			ArrayList<String> al3=new ArrayList<>(5);
			al3.add(".net");
			al3.add("Sql");
			al3.add("java");
			al3.add("React");
			
			System.out.println(al2);
			//al.addAll(al2);
			//System.out.println(al);
			
		//	al.addAll(2,al2);
			//System.out.println(al);
			
			al.addAll(2,al2);
			System.out.println(al);
			
			System.out.println(al.contains("Java"));
			System.out.println(al.contains("React"));
			
			
			System.out.println(al.containsAll(al3));//All elements af al3 must be present in al
			
			System.out.println(al.size());
			//remove
			
			System.out.println(al.remove(4));
			System.out.println(al.remove("HTML"));
			
			//System.out.println(al.remove("Java));//return boolean
			
			al.removeAll(al3);//remove all elements which matches al3
			System.out.println(al);
			
			al.retainAll(al3);//keeps only those elements which matches al3 and removes rest
			System.out.println(al);
			
			
		}


}
