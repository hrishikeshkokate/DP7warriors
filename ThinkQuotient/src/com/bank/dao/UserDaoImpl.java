package com.bank.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bank.connDB.DBConnection;
import com.bank.pojo.Account;
import com.bank.pojo.User;
import com.bank.test.User_login;



public class UserDaoImpl implements UserDao {

	Connection conn = DBConnection.getConnect();
	PreparedStatement ps;
	ResultSet rs;
	int result;
	String sql;
	User user;
	Account account;
	List<User> ulist;

	@Override
	public boolean addUser(User user) throws SQLException {
		sql = "insert into userinfo(user_name,user_email,user_contact,user_dob,user_pan,user_aadhar,user_address,user_pass)values(?,?,?,?,?,?,?,?)";
		ps = conn.prepareStatement(sql);
		ps.setString(1, user.getUsername());
		ps.setString(2, user.getUseremail());
		ps.setString(3, user.getUsercontact());
		ps.setString(4, user.getUserdob());
		ps.setString(5, user.getUserpan());
		ps.setString(6, user.getUseraadhar());
		ps.setString(7, user.getUseraddress());
		ps.setString(8, user.getUserpass());

		//System.out.println("Query:" + ps);
		result = ps.executeUpdate();
		if (result > 0)
			return true;
		return false;
	}

	@Override
	public boolean updateUser(User user) throws SQLException {
		sql = "update userinfo set user_name=?,user_email=?,user_contact=?,user_dob=?,user_pan=?,user_aadhar=?,user_address=?,user_pass=? where user_id=?";
		ps = conn.prepareStatement(sql);
		ps.setString(1, user.getUsername());
		ps.setString(2, user.getUseremail());
		ps.setString(3, user.getUsercontact());
		ps.setString(4, user.getUserdob());
		ps.setString(5, user.getUserpan());
		ps.setString(6, user.getUseraadhar());
		ps.setString(7, user.getUseraddress());
		ps.setString(8, user.getUserpass());
		ps.setInt(9, user.getUserid());
		//System.out.println("Query:" + ps);
		result = ps.executeUpdate();
		if (result > 0)
			return true;
		return false;
	}

	@Override
	public boolean deleteUser(int userid) throws SQLException {

		sql = "delete from userinfo where user_id=?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, userid);
		result = ps.executeUpdate();
		if (result > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<User> showUserList() throws SQLException {

		ulist = new ArrayList<User>();

		sql = "select *from userinfo where user_role='user'";
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();

		while (rs.next()) {
			user = new User();
			user.setUserid(rs.getInt(1));
			user.setUsername(rs.getString(2));
			user.setUseremail(rs.getString(3));
			user.setUsercontact(rs.getString(4));
			user.setUserdob(rs.getString(5));
			user.setUserpan(rs.getString(6));
			user.setUseraadhar(rs.getString(7));
			user.setUseraddress(rs.getString(8));
			user.setUserpass(rs.getString(9));
			user.setUserrole(rs.getString(10));
			ulist.add(user);
		}

		return ulist;
	}

	@Override
	public List<User> showUserWithAccount() throws SQLException {

		ulist = new ArrayList<User>();
		sql = "select u.user_id,user_name,user_email,user_contact,user_dob,user_pan,user_aadhar,user_address,user_pass,user_role,acc_no,acc_type,acc_balance,acc_status"
				+ " from userinfo u join user_account a on u.user_id=a.user_id";
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();

		while (rs.next()) {
			user = new User();
			user.setUserid(rs.getInt(1));
			user.setUsername(rs.getString(2));
			user.setUseremail(rs.getString(3));
			user.setUsercontact(rs.getString(4));
			user.setUserdob(rs.getString(5));
			user.setUserpan(rs.getString(6));
			user.setUseraadhar(rs.getString(7));
			user.setUseraddress(rs.getString(8));
			user.setUserpass(rs.getString(9));
			user.setUserrole(rs.getString(10));
			account = new Account(rs.getInt(11), rs.getInt(1), rs.getString(12), rs.getDouble(13), rs.getString(14));
			
			user.setAccount(account);
			ulist.add(user);
		}
		return ulist;
	}

	@Override
	public User searchUserByUserid(int userid) throws SQLException {

		sql = "select u.user_id,user_name,user_email,user_contact,user_dob,user_pan,user_aadhar,user_address,user_pass,user_role,acc_no,acc_type,acc_balance,acc_status"
				+ " from userinfo u join user_account a on u.user_id=a.user_id where u.user_id=?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, userid);
		//System.out.println("query:" + ps);
		rs = ps.executeQuery();

		while (rs.next()) {
			user = new User();
			user.setUserid(rs.getInt(1));
			user.setUsername(rs.getString(2));
			user.setUseremail(rs.getString(3));
			user.setUsercontact(rs.getString(4));
			user.setUserdob(rs.getString(5));
			user.setUserpan(rs.getString(6));
			user.setUseraadhar(rs.getString(7));
			user.setUseraddress(rs.getString(8));
			user.setUserpass(rs.getString(9));
			user.setUserrole(rs.getString(10));
			account = new Account(rs.getInt(11), rs.getInt(1), rs.getString(12), rs.getDouble(13), rs.getString(14));
		
			user.setAccount(account);
		}
		return user;
	}

	@Override
	public User searchUserByEmail(String email) throws SQLException {

		sql = "select * from userinfo where user_email=? and user_role='User' ";

		ps = conn.prepareStatement(sql);
		ps.setString(1, email);

		rs = ps.executeQuery();

		if (rs.next()) {
			user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
		}
		return user;
	}

	@Override
	public User searchUserByAadhar(String aadhar) throws SQLException {
		sql = "select * from userinfo where user_aadhar=? ";

		ps = conn.prepareStatement(sql);
		ps.setString(1, aadhar);

		rs = ps.executeQuery();

		if (rs.next()) {
			user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
		}
		return user;
	}

	@Override
	public User searchUserByAccountno(int accno) throws SQLException {

		sql = "select u.* from userinfo u join user_account a where u.user_id=a.user_id and u.user_role='user' and a.acc_no=?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, accno);
		rs = ps.executeQuery();
		if (rs.next()) {
			user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
		}
		return user;
	}

	@Override
	public User searchUserByContact(String email, String pass) throws SQLException, Exception {
		
		
		sql = "select u.user_id,user_name,user_email,user_contact,user_dob,user_pan,user_aadhar,user_address,user_pass,user_role,acc_no,acc_type,acc_balance,acc_status"
				+ " from userinfo u join user_account a on u.user_id=a.user_id where user_email=? and user_pass=? ";
		
		ps = conn.prepareStatement(sql);
		ps.setString(1, email);
		ps.setString(2, pass);

		rs = ps.executeQuery();

		
		
		
		while (rs.next()) {
			user = new User();
			user.setUserid(rs.getInt(1));
			user.setUsername(rs.getString(2));
			user.setUseremail(rs.getString(3));
			user.setUsercontact(rs.getString(4));
			user.setUserdob(rs.getString(5));
			user.setUserpan(rs.getString(6));
			user.setUseraadhar(rs.getString(7));
			user.setUseraddress(rs.getString(8));
			user.setUserpass(rs.getString(9));
			user.setUserrole(rs.getString(10));
			account = new Account(rs.getInt(11), rs.getInt(1), rs.getString(12), rs.getDouble(13), rs.getString(14));
			// account=new Account();
			// account.setAccount_no(rs.getInt(11));
			user.setAccount(account);
			
			if(rs.getString(14).equals("Inactive")) {
				throw new Exception ("Activate Your Account First...!");

			}
			
			System.out.println("\n-----: Welcome "+rs.getString(2)+" :-----");
		}
		
		return user;
	}

	public User searchAdminByContact(String email, String pass) throws SQLException {
		sql = "select * from userinfo where user_role='Admin' and user_email=? and user_pass=?";
		ps = conn.prepareStatement(sql);
		ps.setString(1, email);
		ps.setString(2, pass);

		rs = ps.executeQuery();
		if (rs.next()) {
			user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
			System.out.println("\n-----: Welcome "+rs.getString(2)+" :-----");
		}
		return user;
	}

	@Override
	public boolean updateStatus(String mail,String pass) throws SQLException {
		sql = "update userinfo u join user_account a\r\n"
				+ "on u.user_id=a.user_id\r\n"
				+ "set acc_status = 'Active' \r\n"
				+ "where u.user_email ='"+mail+"' and u.user_pass ='" +pass+"'";
		
		ps = conn.prepareStatement(sql);
		
		
		//System.out.println("Query:" + ps);
		result = ps.executeUpdate();
		if (result > 0)
			return true;	
		
		return false;
	}
}
