package com.modelcurd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BikeCrudOperation {
	static Connection con = null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	static Scanner sc = new Scanner(System.in);
	
	public BikeCrudOperation()
	{
		con=DBconnect.getconnected();
		try
		{
			st=con.createStatement();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	
	public void fetchAllDetails()
	{
		try
		{
			rs=st.executeQuery("select * from model");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
public void insertModel() {
		
		System.out.println("Enter Model Id:");
		int id=sc.nextInt();
		
		System.out.println("Enter Model Name:");
		String name=sc.next();
		
		System.out.println("Enter Price:");
		int price=sc.nextInt();
		
		try {
			pst=con.prepareStatement("insert into model values(?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setInt(3, price);
			pst.execute();
			
			int noOfModel=pst.executeUpdate();
			
			if(noOfModel>0) {
				System.out.println("Model Added..");
			}
			else {
				System.out.println("Error in Model..");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteModelById() {
		
		System.out.println("Enter Model Id To Be Deleted..");
		int id=sc.nextInt();
		
		try {
			pst=con.prepareStatement("delete from model where=?");
			pst.setInt(1, id);
			
			int noOfRowDeleted=pst.executeUpdate();
			
			if(noOfRowDeleted>0) {
				System.out.println("Model Deleted..");
			}
			else {
				System.out.println("Error In Model..");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateModel() {
		
		System.out.println("Enter Model Name To Be Updated:");
		String name=sc.next();
		
		try {
			pst=con.prepareStatement("update model set cost=cost+(cost*0.1) where model_name=?");
			pst.setString(1, name);
			
			int noOfRowUpdated=pst.executeUpdate();
			
			if(noOfRowUpdated>0) {
				System.out.println("Model Updated..");
			}
			else {
				System.out.println("Error in Model..");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void searchByName() {
		
		System.out.println("Enter Model Name:");
		String name=sc.next();
		
		try {
			pst=con.prepareStatement("select * from model where model_name=?");
			pst.setString(1, name);
			
			rs=pst.executeQuery();
			while(rs.next()) {
				System.out.println("Model Id:"+rs.getInt(1));
				System.out.println("Model Name:"+rs.getString(2));
				System.out.println("Model Price:"+rs.getInt(3));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		
BikeCrudOperation b1=new BikeCrudOperation();
		
		int choice;
		char ch;
		
		do {
			
			System.out.println("1.View All Models\n2.Insert Model\n3.Delete Model\n4.Update Model\n5.Search Model By Name\n6.Exit");
			System.out.println("Enter Your Choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:b1.fetchAllDetails();
			break;
			case 2:b1.insertModel();
			break;
			case 3:b1.deleteModelById();
			break;
			case 4:b1.updateModel();
			break;
			case 5:b1.searchByName();
			break;
			case 6:System.out.println("----Model Application is Cloesd----");
			       System.exit(0);
			       break;
			default:System.out.println("Wrong Input..");
			}
			System.out.println("Want To Continue Enter (y-yes/n-no)");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		
		//b1.fetchAllDetails();
		//b1.insertModel();
		//b1.updateModel();
		//b1.searchByName();

	}

}
