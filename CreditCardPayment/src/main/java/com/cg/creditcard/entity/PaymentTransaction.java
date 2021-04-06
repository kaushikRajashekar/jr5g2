package com.cg.creditcard.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "PaymentTransaction")
public class PaymentTransaction {
	@Id
	private int transaction_id;
	@Column
	private Date transaction_date;
	@Column
	private String status;
	@Column
	private double amount;
	public PaymentTransaction() {

	}
	public PaymentTransaction(int transaction_id, Date transaction_date, String status, double amount) {
		super();
		this.transaction_id = transaction_id;
		this.transaction_date = transaction_date;
		this.status = status;
		this.amount = amount;
	}
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public Date getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
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
	@Override
	public String toString() {
		return "PaymentTransaction [transaction_id=" + transaction_id + ", transaction_date=" + transaction_date
				+ ", status=" + status + ", amount=" + amount + "]";
	}
}
