package com.Incapulation;

public class Customer 
{
	private int customerId;
	private String customerName;
	private int accountNo;
	private double balance=10000;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return "customerId=" + customerId + ", customerName=" + customerName + ", accountNo=" + accountNo+ ", balance=" + balance + "";
	}
	
	

}
