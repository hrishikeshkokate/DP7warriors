package com.constructors;

public class Account 
{
	int customerId;
	String customerName;
	String status;
	double balance;
	
	Account()
	{
		
	}
	
	Account(int customerId,String customerName,String status,double balance)
	{
		this.customerId=customerId;
		this.customerName=customerName;
		this.status=status;
		this.balance=balance;
		
	}

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	public String toString() {
		return "customerId=" + customerId + ", customerName=" + customerName + ", status=" + status
				+ ", balance=" + balance + "";
	}
	
	
}
