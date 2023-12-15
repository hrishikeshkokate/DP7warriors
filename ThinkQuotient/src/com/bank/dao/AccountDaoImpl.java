package com.bank.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.bank.connDB.DBConnection;
import com.bank.pojo.Account;
import com.bank.pojo.Transaction;
import com.bank.pojo.User;

public class AccountDaoImpl implements AccountDao {

	static Connection conn = DBConnection.getConnect();
	PreparedStatement ps;
	ResultSet rs;
	int result;
	String sql;
	Statement stmt;
	User user;
	Transaction trans;
	List<User> ulist;
	List<Transaction> tlist;

	@Override
	public boolean deposit(String email, double amt) throws Exception, SQLException {
		Statement stmt = conn.createStatement();

		String sql = "update userinfo u join user_account a on u.user_id=a.user_id " + "set a.acc_balance = " + amt
				+ " + acc_balance where " + amt + ">0 and u.user_email = '" + email + "'";

		int result = stmt.executeUpdate(sql);

		if (result > 0) {
			return true;
		} else
			return false;

	}

	@Override
	public boolean withdraw(String email, double w_amt) throws Exception, SQLException {
		Statement stmt = conn.createStatement();

		String sql = "update userinfo u join user_account a on u.user_id=a.user_id "
				+ "set a.acc_balance = a.acc_balance - " + w_amt + "where u.user_email = '" + email + "'"
				+ " and a.acc_balance >=" + w_amt;

		int result = stmt.executeUpdate(sql);

		if (result > 0) {
			return true;
		} else
			return false;

	}

	Account acc;

	@Override
	public double showBalance(String email) throws Exception, SQLException {

		double balance = 0;
		stmt = conn.createStatement();
		ulist = new ArrayList<User>();

		sql = "select a.acc_balance from userinfo u join user_account a on u.user_id=a.user_id where u.user_email= '"
				+ email + "'";

		rs = stmt.executeQuery(sql);

		while (rs.next()) {

			balance = rs.getDouble(1);
		}

		return balance;
	}

	@Override
	public boolean transaction(String email, String t_contact, double t_amt) throws Exception, SQLException {

		String num = null, num1 = null;
		Statement stmt = conn.createStatement();
		// stmt = conn.createStatement();
		ulist = new ArrayList<User>();

//-----------------------------------------------------------------------------------------------------------------

		sql = "select a.acc_no from userinfo u join user_account a on u.user_id=a.user_id where u.user_contact="
				+ t_contact;

		rs = stmt.executeQuery(sql);

		while (rs.next()) {

			num = rs.getString(1);
		} // Getting Account number of customer

//-----------------------------------------------------------------------------------------------------------------

		sql = "select a.acc_no from userinfo u join user_account a on u.user_id=a.user_id where u.user_email= '" + email
				+ "'";

		rs = stmt.executeQuery(sql);

		while (rs.next()) {

			num1 = rs.getString(1);
		} // Getting account number of user

//-----------------------------------------------------------------------------------------------------------------

		String sql = "update userinfo u join user_account a on u.user_id=a.user_id "
				+ "set a.acc_balance = a.acc_balance - " + t_amt + "where u.user_email = '" + email
				+ "' and a.acc_balance >=" + t_amt;

		result = stmt.executeUpdate(sql);

		if (result > 0) {

			String sql1 = "update userinfo u join user_account a on u.user_id=a.user_id "
					+ "set a.acc_balance = a.acc_balance + " + t_amt + "where u.user_contact =" + t_contact;

			result = stmt.executeUpdate(sql1);

			String sql2 = "insert into transactions (acc_no_from,acc_no_to,t_type,t_amt,t_date)" + "values(" + num1
					+ "," + num + ",'Online'," + t_amt + ",curdate())";

			result = stmt.executeUpdate(sql2);

			return true;
		} else
			return false;

	}

	

	@Override
	public List<Transaction> showTransactions(String email) throws Exception, SQLException {

		tlist = new ArrayList<Transaction>();

		sql = "select t.* from transactions t join user_account a join userinfo u on t.acc_no_from=a.acc_no and a.user_id=u.user_id where u.user_email = '"+email+"'";
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();

		while (rs.next()) {
		
			trans = new Transaction();
			trans.setTrn_id(rs.getString(1));
			trans.setAcc_no_from(rs.getString(2));
			trans.setAcc_no_to(rs.getString(3));
			trans.setTrn_type(rs.getString(4));
			trans.setTrn_amt(rs.getDouble(5));
			trans.setTrn_date(rs.getString(6));
			trans.setTrn_mode(rs.getString(7));
	
			tlist.add(trans);
		}
		
		return tlist;
	}

	

}
