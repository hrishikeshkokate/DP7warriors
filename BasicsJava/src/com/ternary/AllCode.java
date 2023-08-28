package com.ternary;

public class AllCode {

	public static void main(String[] args) {
//Voting
int age=19;
String status;
status=(age>=18)?"yes":"no";//it will print same on inverted commas
System.out.println(status);

//--------------------------------------------

boolean s=(age>=18)?true:false;//this only applicable for boolean
System.out.println(s+" you can vote");

//--------------------------------------------
//Bigger number
int num1=90;
int num2=78;
int max;
max=(num1>num2)?num1:num2;
System.out.println(max+" is greater");

	}

}
