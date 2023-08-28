package com.ConditionalAssignmentCW;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

System.out.println("Enter number of electricity unit used");
double unit=sc.nextDouble();

if(unit<=50)
{
	System.out.println("Your bill for"+unit+"is"+((unit*0.50)+((unit*0.50)*0.20)+"Rupees"));
}
else if(unit<=150)
{
	System.out.println("Your bill for"+unit+"is"+((25+(unit-50)*0.75)+(25+(unit-50)*0.75)*0.20)+"Rupees");
}
else if(unit<=250)
{
	System.out.println("Your bill for"+unit+"is"+((100+(unit-150)*1.20)+(100+(unit-100)*1.20)*0.20)+"Rupees");
}
else
{
	System.out.println("Your bill for"+unit+"is"+((220+(unit-250)*1.50)+(220+(unit-250)*1.50)*0.20)+"Rupees");
}


	}

}
