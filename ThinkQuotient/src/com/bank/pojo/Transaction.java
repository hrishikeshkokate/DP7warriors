package com.bank.pojo;

public class Transaction {

	private String trn_id;
	private String acc_no_from;
	private String acc_no_to;
	private String trn_type;
	private double trn_amt;
	private String trn_date;
	private String trn_mode;
	
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Transaction(String trn_id,String acc_no_from, String acc_no_to, String trn_type, double trn_amt, String trn_date, String trn_mode) {
		super();
		this.trn_id=trn_id;
		this.acc_no_from = acc_no_from;
		this.acc_no_to = acc_no_to;
		this.trn_type = trn_type;
		this.trn_amt = trn_amt;
		this.trn_date = trn_date;
		this.trn_mode=trn_mode;
	}


	public String getAcc_no_from() {
		return acc_no_from;
	}


	public String getAcc_no_to() {
		return acc_no_to;
	}


	public String getTrn_type() {
		return trn_type;
	}


	public double getTrn_amt() {
		return trn_amt;
	}


	public String getTrn_date() {
		return trn_date;
	}


	public void setAcc_no_from(String acc_no_from) {
		this.acc_no_from = acc_no_from;
	}


	public void setAcc_no_to(String acc_no_to) {
		this.acc_no_to = acc_no_to;
	}


	public void setTrn_type(String trn_type) {
		this.trn_type = trn_type;
	}


	public void setTrn_amt(double trn_amt) {
		this.trn_amt = trn_amt;
	}


	public void setTrn_date(String trn_date) {
		this.trn_date = trn_date;
	}


	public String getTrn_id() {
		return trn_id;
	}


	public void setTrn_id(String trn_id) {
		this.trn_id = trn_id;
	}


	public String getTrn_mode() {
		return trn_mode;
	}


	public void setTrn_mode(String trn_mode) {
		this.trn_mode = trn_mode;
	}


	@Override
	public String toString() {
		return "\nTransaction ID\t\t: " + trn_id 
				+ "\nDebited from\t\t: " + acc_no_from 
				+ "\nCreadited to\t\t: " + acc_no_to
				+ "\nTransaction Type\t: " + trn_type 
				+ "\nTrasaction Amount\t: " + trn_amt 
				+ "\nTransaction Date\t: " + trn_date 
				+ "\ntransaction Mode\t: "+ trn_mode;
	}
	
	
	
}
