package com.cg.creditcard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Login")
public class Login {
	@Id
	private int loginid;
	@Column
	private String password;
	public Login() {
		
	}
	public Login(int loginid, String password) {
		super();
		this.loginid = loginid;
		this.password = password;
	}
	public int getLoginid() {
		return loginid;
	}
	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [loginid=" + loginid + ", password=" + password + "]";
	}
	
}
