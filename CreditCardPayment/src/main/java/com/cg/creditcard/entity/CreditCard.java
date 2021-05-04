package com.cg.creditcard.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

//Entity with table name="CreditCard"
@Entity
@Table(name="CreditCard")
public class CreditCard {
	@Id
	private int card_number;
	@Column
	private String card_name;
	@Column
	private int expiry_month;
	@Column
	private int expiry_year;
	@Column
	private double amount_limit;
	
	//Constructor
	public CreditCard() {
	}
	
	//Many to one mapping with Customer table
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonBackReference
	@JoinColumn(name = "userid")
	private Customer customer;
	
	//Required getters and setters
	public int getCard_number() {
		return card_number;
	}
	public void setCard_number(int card_number) {
		this.card_number = card_number;
	}
	public String getCard_name() {
		return card_name;
	}
	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}
	public int getExpiry_month() {
		return expiry_month;
	}
	public void setExpiry_month(int expiry_month) {
		this.expiry_month = expiry_month;
	}
	public int getExpiry_year() {
		return expiry_year;
	}
	public void setExpiry_year(int expiry_year) {
		this.expiry_year = expiry_year;
	}
	public double getAmount_limit() {
		return amount_limit;
	}
	public void setAmount_limit(double amount_limit) {
		this.amount_limit = amount_limit;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
