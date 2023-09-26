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
public class Demo2 {
	public static void main(String[] args) {

		Covarant c=new Subclass();
		System.out.println(c.show());
	}
	
	

}
