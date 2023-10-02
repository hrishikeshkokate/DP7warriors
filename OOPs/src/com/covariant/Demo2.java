package com.covariant;
class Covarant
{
	Object show()
	{
		return new Object();
		
	}
	
}
class Subclass extends Covarant
{
	Integer show()
	{
		return 10;
	}
	
}
class Subcovarant extends Covarant
{
	String show()
	{
		return "ABCD";
	}
	
}
class Subcharacter extends Covarant
{
	Character show()
	{
		return 'A';
	}
	
}
public class Demo2 {
	public static void main(String[] args) {

		Covarant c;
		c=new Subclass();
		System.out.println(c.show());
		
		c=new Subcovarant();
		System.out.println(c.show());
		
		c=new Subcharacter();
		System.out.println(c.show());
	}
	
	

}
