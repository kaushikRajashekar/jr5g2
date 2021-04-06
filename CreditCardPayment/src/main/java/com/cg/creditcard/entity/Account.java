package com.cg.creditcard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {
	@Id
	private int account_id;
	@Column
	private String account_name;
	@Column
	private double balance;
	public Account() {
		
	}
	public Account(int account_id, String account_name, double balance) {
		super();
		this.account_id = account_id;
		this.account_name = account_name;
		this.balance = balance;
	}
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [account_id=" + account_id + ", account_name=" + account_name + ", balance=" + balance + "]";
	}
}
