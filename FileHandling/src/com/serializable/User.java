package com.serializable;

import java.io.Serializable;

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userid;
	private String uname;
	private transient String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userid, String uname, String password) {
		super();
		this.userid = userid;
		this.uname = uname;
		this.password = password;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", uname=" + uname + ", password=" + password + "]";
	}
	
	

}
