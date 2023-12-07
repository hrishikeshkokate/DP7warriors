package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FetchCourseData {

	static Connection con = null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	static Scanner sc = new Scanner(System.in);

	public FetchCourseData() {
		con = DBconnect.getconnected();
		System.out.println("Connection done.....");
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public void fetchCourseDetails() {
		try {
			rs = st.executeQuery("select * from course");

			System.out.println("--------------Courses---------------------");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3) + "  " + rs.getFloat(4));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void insertCourse() {
		System.out.println("Enter course id:");
		int id = sc.nextInt();

		System.out.println("Enter the course name:");
		String cname = sc.next();

		System.out.println("Enter duration(in months):");
		int dur = sc.nextInt();

		System.out.println("Enter fees:");
		float fees = sc.nextFloat();

		try {
			pst = con.prepareStatement("insert into course values(?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, cname);
			pst.setInt(3, dur);
			pst.setFloat(4, fees);
			// pst.setInt(5, 0);

			int noOfRowsInserted = pst.executeUpdate();

			if (noOfRowsInserted > 0) {
				System.out.println("Course added.....");
			} else {
				System.out.println("Error in course....");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void deleteCourse() {
		System.out.println("Enter the course id to be deleted:");
		int id = sc.nextInt();

		try {
			pst = con.prepareStatement("delete from course where cid=?");
			pst.setInt(1, id);

			int noOfRowsDeleted = pst.executeUpdate();

			if (noOfRowsDeleted > 0) {
				System.out.println("Course " + id + " is deleted");
				fetchCourseDetails();
			} else {
				System.out.println("Error in deleting course...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void deleteCourse2() {
		System.out.println("Enter the course id to be deleted:");
		int id = sc.nextInt();

		try {
			int noOfRowsDeleted = st.executeUpdate("delete from course where cid=" + id + ";");

			if (noOfRowsDeleted > 0) {
				System.out.println("Course " + id + " is deleted");
				fetchCourseDetails();
			} else {
				System.out.println("Error in deleting course...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void deleteCourseByName() {
		System.out.println("Enter the course name to be deleted:");
		String cname = sc.next();

		try {
			int noOfRowsDeleted = st.executeUpdate("delete from course where cname='" + cname + "';");

			if (noOfRowsDeleted > 0) {
				System.out.println("Course " + cname + " is deleted");
				fetchCourseDetails();
			} else {
				System.out.println("Error in deleting course...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public boolean searchCourseById(int id) {
		boolean isFound = false;
		try {
			pst = con.prepareStatement("select * from course where cid=?");
			pst.setInt(1, id);

			rs = pst.executeQuery();

			while (rs.next()) {
				isFound = true;
				System.out.println("Course id :" + rs.getInt(1));
				System.out.println("Course name:" + rs.getString(2));
				System.out.println("Duration:" + rs.getInt(3));
				System.out.println("Fees:" + rs.getFloat(4));
							}

		} catch (Exception e) {
			System.out.println(e);
		}

		return isFound;

	}

	public void updateCourseFees() {
		System.out.println("Enter course id whose fees is to updated:");
		int id = sc.nextInt();

		if (searchCourseById(id)) {
			System.out.println("Ente the new fees:");
			float fees = sc.nextFloat();

			try {
				pst = con.prepareStatement("update course set fees=? where cid=?");
				pst.setFloat(1, fees);
				pst.setInt(2, id);

				int noOfRowsUpdated = pst.executeUpdate();
				if (noOfRowsUpdated > 0) {
					System.out.println("Course updated .....");
					searchCourseById(id);
				} else {
					System.out.println("Error in updating course.........");
				}
			} catch (Exception e) {
				System.out.println(e);
			}

		} else {
			System.out.println("Course " + id + " not found..");
		}

	}

	public static void main(String[] args) {

		FetchCourseData f1 = new FetchCourseData();
		//f1.fetchCourseDetails();
		// f1.insertCourse();
		//f1.deleteCourse();
		//f1.deleteCourse2();
		//f1.deleteCourseByName();
		//f1.searchCourseById(3);
		 //f1.updateCourseFees();
		

		while(true)
		{
			
			System.out.println("1.Show Details"
					+ "\n2.Insert Data"
					+ "\n3.Delete Course"
					+ "\n4.Delete Course By Name"
					+ "\n5.Search Course By Id"
					+ "\n6.Update Course Fees");
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			
			switch (choice) 
			{
			case 1:f1.fetchCourseDetails();
			break;
			
			case 2:f1.insertCourse();
			break;
			
			case 3:f1.deleteCourse();
			break;
			
			case 4:f1.deleteCourseByName();
			break;
			
			case 5:System.out.println("Enter the course Id");
			      int id=sc.nextInt();
				  f1.searchCourseById(id);
				  break;
				  
			case 6:f1.updateCourseFees();
			break;
			
			default:System.out.println("Wrong Input...");
			
			}
		}

	}

}
