package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
	
	public static final String JDBC_Driver="com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URl="jdbc:mysql://localhost:3306/studentcourse";
	public static final String USERNAME="root";
	public static final String PASSWORD="root";
	
	static Connection conn=null;
	public static Connection getconnected() {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentcourse","root","root");
			System.out.println("Connection Done...");
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
		return conn;
	}

	public static void main(String[] args) {
		
		getconnected();
	}
}
