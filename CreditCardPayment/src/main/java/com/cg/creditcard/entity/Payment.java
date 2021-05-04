
package com.cg.creditcard.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//Entity with table name="Payment"
@Entity
@Table(name = "Payment")
public class Payment {
	@Id
	private int paymentId;
	@Column
	private String status;
	@Column
	private double amount;
	@Column
	private Date transaction_date;
	
//One to one mapping with Statement table
	@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "due_date")
   private Statement statement;
	
	//Many to one mapping with Customer table
	@ManyToOne
	@JoinColumn(name = "userid")
	private Customer customer;
	
	//Constructor
	public Payment() {
	}

	//Required getters and setters
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}
	public Statement getStatement() {
		return statement;
	}
	public void setStatement(Statement statement) {
		this.statement = statement;
	}	
}