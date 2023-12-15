package com.bank.dao;

import java.sql.SQLException;
import java.util.List;

import com.bank.pojo.Account;
import com.bank.pojo.Transaction;
import com.bank.pojo.User;

public interface AccountDao {
	


	public boolean deposit(String contact, double amt) throws Exception,SQLException;

	public boolean withdraw(String contact, double amt) throws Exception,SQLException;
	
	public boolean transaction(String contact,String t_contact, double amt) throws Exception,SQLException;

	public double showBalance(String contact) throws Exception,SQLException;
	
	List<Transaction> showTransactions(String email) throws Exception,SQLException;

	

}
