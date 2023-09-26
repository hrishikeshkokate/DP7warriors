package com.SpecifierAndmodifier;

public class Demo {

	public static void main(String[] args) {
		 
		AccessDemo obj=new AccessDemo();
		
		//obj.a=10;//private it canot be accessd inside or outside a package
		obj.b=90;//default it can be accessed inside a package only
		obj.d=88;//public it can be accesed everywhere
		
		//obj.show();//private it canot be accessd inside or outside a package
		obj.display();//default it can be accessed inside a package only
		obj.test();//public it can be accesed everywhere
	}

}
