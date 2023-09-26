package com.constructors;

class MyClass 
{
int a;
int b;

MyClass()
{
this(10,20);//2] constr chaining	
}

MyClass(int a,int b)//1] in paramertizedconstrc to differentiate btw local and instance variable
{
this.a=a;
this.b=b;
}

void display()
{
int a;
a=99;
System.out.println("local:"+a);//99:local variable
System.out.println("Instance:"+this.a);//instance variable
addition(this);//4] to call one method from another method
}

void addition(MyClass c)//3]to pass one object to another
{
	
}
}




