package com.country;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
	public static final String JDBC_Driver="com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL="jdbc:mysql://localhost:3306/companydb";
	public static final String USERNAME="root";
	public static final String PASSWORD="root";
	
	static Connection conn=null;
	
	public static Connection getconnected()
	{
		try {
			Class.forName(JDBC_Driver);
			System.out.println("Driver loaded...");
			conn=DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
			System.out.println("Connection Done...");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		return conn;
	}

	public static void main(String[] args) {
		
		getconnected();
		

	}

}
