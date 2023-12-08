package com.resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect1 {
	public static final String JDBC_Driver="com.mysql.cj.jdbc.driver";
	public static final String JDBC_url="jdbc:mysql://localhost:3306/studentcourse";
	public static final String USERNAME="root";
	public static final String PASSWORD="root";
	
	static Connection conn=null;
	
	public static Connection getconnected()
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded..");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentcourse","root","root");
			System.out.println("Connection done...");
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return conn;

	}
	public static void main(String[] args) {
		
		getconnected();
	}

}
