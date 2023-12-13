package com.country;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class Assignment {
	static Connection conn = null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	CallableStatement cst;
	static Scanner sc=new Scanner(System.in);
	
	public Assignment()
	{
		conn=DBconnect.getconnected();
		try
		{
			st=conn.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void countryname()
	{
		try
		{
			rs=st.executeQuery("select *from countries");
			while(rs.next())
			{
				System.out.println(rs.getString(2));
			}
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	
	public void employeemanagername()
	{
		try 
		{
			rs=st.executeQuery("select e1.first_name employee,e2.first_name manager from employees e1 join employees e2 where e1.manager_id=e2.employee_id");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"--->"+rs.getString(2));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void ExecuteStoredProcedure() {
	    try {
	        System.out.println("Enter the Id :");
	        int id = sc.nextInt();

	        cst = conn.prepareCall("{call avgSalary(?, ?)}");

	        cst.setInt(1, id);
	        cst.registerOutParameter(2, java.sql.Types.INTEGER);
	        cst.execute();

	        
	        int avgSalary = cst.getInt(2);
	        System.out.println("Average Salary: " + avgSalary);

	        cst.close();
	    } catch (Exception e) {
	        System.out.println(e);
	    }
	}
	
	
	public void deleteemployeessalaryiszero()
	{
		System.out.println("Hii");
		try 
		{
			pst=conn.prepareStatement("DELETE FROM employees WHERE salary = 0");
			
			int noOfRowDeleted=pst.executeUpdate();
			
			System.out.println("no of rows deleted:"+noOfRowDeleted);
			
			if(noOfRowDeleted>0) {
				System.out.println("employee Deleted..");
			}
			else {
				System.out.println("No employee with zero salary..");
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void EmployeeTransfer ()
	{
		try {
			rs=st.executeQuery("update employees set manager_id=10 where manager_id=1");
			while(rs.next())
			{
			    System.out.println(rs.getInt(1)+" "+rs.getInt(2));			
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	

	public static void main(String[] args) {
		
		Assignment c1=new Assignment();
		c1.countryname();
		//c1.employeemanagername();
		//c1.ExecuteStoredProcedure();
		//c1.deleteemployeessalaryiszero();
		//c1.EmployeeTransfer();

	}

}
