package com.bank.pojo;

public class Account {

	private int accountno;
	private int userid;
	private String accounttype;
	private double balance;
	private String accstatus;

	public Account() {
		super();
	}

	public Account(int accountno, int custid, String accounttype, double balance, String accstatus) {
		super();
		this.accountno = accountno;
		//this.userid = custid;
		this.accounttype = accounttype;
		this.balance = balance;
		this.accstatus = accstatus;
	}

	public Account(int custid, String account_type, double balance) {
		super();
		this.userid = custid;
		this.accounttype = account_type;
		this.balance = balance;
	}

	public Account(int account_no, int custid, String account_type, double balance) {
		super();
		this.accountno = account_no;
		this.userid = custid;
		this.accounttype = account_type;
		this.balance = balance;
	}

	public Account(int accountno, String accounttype, double balance, String accstatus) {
		super();
		this.accountno = accountno;
		this.accounttype = accounttype;
		this.balance = balance;
		this.accstatus = accstatus;
	}

	public int getAccount_no() {
		return accountno;
	}

	public void setAccount_no(int account_no) {
		this.accountno = account_no;
	}

	public int getCustid() {
		return userid;
	}

	public void setCustid(int custid) {
		this.userid = custid;
	}

	public String getAccount_type_id() {
		return accounttype;
	}

	public void setAccount_type_id(String account_type_id) {
		this.accounttype = account_type_id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double d) {
		this.balance = d;
	}

	public String getAccount_type() {
		return accounttype;
	}

	public void setAccount_type(String account_type) {
		this.accounttype = account_type;
	}

	public String getAcc_status() {
		return accstatus;
	}

	public void setAcc_status(String acc_status) {
		this.accstatus = acc_status;
	}

	@Override
	public String toString() {
		return "\nAccount No\t: " + accountno 
				//+ "\nUser ID\t\t: " + userid 
				+ "\nAccount type\t: " + accounttype
				+ "\nAccount Balance\t: " + balance 
				+ "\nAccount Status\t: " + accstatus;
	}

}
