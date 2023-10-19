package com.stringbuffer;

public class Stringbuffermethod {

	public static void main(String[] args) {
		
		StringBuffer st=new StringBuffer();
		System.out.println(st.capacity());
		
		st.append("Java programs");
		
		//reverse
		
		System.out.println(st.reverse());
		
		//replace
		
		st.reverse();
		
		st.replace(0, 1, "p");
		
		System.out.println(st);
		
		st.replace(0, 1, "java");
		
		System.out.println(st);
		
		//insert
		
		st.insert(6, "Developer");
		System.out.println(st);
		
		System.out.println(st.length());
		
		System.out.println(st.charAt(0));
		
		st.deleteCharAt(4);
		
		System.out.println(st);
		
		System.out.println(st.indexOf("programs"));
		
		st.setCharAt(1, 'b');
		System.out.println(st);
		
		System.out.println(st.substring(3));
		
		System.out.println(st.substring(3, 6));
		

	}

}
