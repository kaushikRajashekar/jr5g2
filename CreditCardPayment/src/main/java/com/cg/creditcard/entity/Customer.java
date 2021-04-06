package com.cg.creditcard.entity;
import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	private int userid;
	@Column
	private String first_name;
	@Column
	private String last_name;
	@Column
	private String email;
	@Column
	private String contact_no;
	@Column
	private Date dob;
	public Customer() {

	}
	public Customer(int userid, String first_name, String last_name, String email, String contact_no, Date dob,
			Account account, CreditCard creditcard, Address address, PaymentTransaction paymentTransaction,
			Statement statement) {
		super();
		this.userid = userid;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.contact_no = contact_no;
		this.dob = dob;
		this.account = account;
		this.creditcard = creditcard;
		this.address = address;
		this.paymentTransaction = paymentTransaction;
		this.statement = statement;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "account_id")
	private Account account;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="card_number")
	private CreditCard creditcard;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "door_no")
	private Address address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "transaction_id")
	private PaymentTransaction paymentTransaction;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "statement_id")
    private Statement statement;
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
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public CreditCard getCreditcard() {
		return creditcard;
	}
	public void setCreditcard(CreditCard creditcard) {
		this.creditcard = creditcard;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public PaymentTransaction getPaymentTransaction() {
		return paymentTransaction;
	}
	public void setPaymentTransaction(PaymentTransaction paymentTransaction) {
		this.paymentTransaction = paymentTransaction;
	}
	public Statement getStatement() {
		return statement;
	}
	public void setStatement(Statement statement) {
		this.statement = statement;
	}
	@Override
	public String toString() {
		return "Customer [userid=" + userid + ", first_name=" + first_name + ", last_name=" + last_name + ", email="
				+ email + ", contact_no=" + contact_no + ", dob=" + dob + ", account=" + account + ", creditcard="
				+ creditcard + ", address=" + address + ", paymentTransaction=" + paymentTransaction + ", statement="
				+ statement + "]";
	}
}
