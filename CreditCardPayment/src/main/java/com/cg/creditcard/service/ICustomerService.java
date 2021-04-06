package com.cg.creditcard.service;

import java.util.List;

import com.cg.creditcard.entity.Customer;

public interface ICustomerService {
	public void addCustomer(Customer customer);
	public void removeCustomer(int userid);
	public Customer getCustomer(int userid);
	public void updateCustomer(int userid, Customer customer);
	public List<Customer> getAllCustomer();

}
