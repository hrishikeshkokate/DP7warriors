package com.bank.connDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static String driver="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/kuber_bank";
	static String username="root";
	static String userpass="root";
	static Connection conn=null;
	public static Connection getConnect() {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/kuber_bank","root","root");
			System.out.println("Connection Done...");
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) {
		
		getConnect();
	}
}

/*CREATE DEFINER = CURRENT_USER TRIGGER `kuberbank_db`.`userinfo_AFTER_INSERT` AFTER INSERT ON `userinfo` FOR EACH ROW
BEGIN
declare ur varchar(10);
select userrole into ur from userinfo where userid=new.userid;
if ur='user' then
	insert into accountinfo(userid)values(new.userid);
    end if;
END
*/