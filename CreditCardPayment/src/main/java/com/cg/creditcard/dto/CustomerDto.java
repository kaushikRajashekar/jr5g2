package com.cg.creditcard.dto;

import java.sql.Date;
public class CustomerDto {
	private int userid;
	private String first_name;
	private String last_name;
	private String email;
	private String contact_no;
	private Date dob;
	private int account;
	private int creditcard;
	private int address;
	private int paymentTransaction;
	 private int statement;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public int getCreditcard() {
		return creditcard;
	}
	public void setCreditcard(int creditcard) {
		this.creditcard = creditcard;
	}
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
	public int getPaymentTransaction() {
		return paymentTransaction;
	}
	public void setPaymentTransaction(int paymentTransaction) {
		this.paymentTransaction = paymentTransaction;
	}
	public int getStatement() {
		return statement;
	}
	public void setStatement(int statement) {
		this.statement = statement;
	}	
}

