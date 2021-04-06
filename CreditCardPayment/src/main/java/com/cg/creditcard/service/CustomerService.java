package com.cg.creditcard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcard.dao.CustomerRepository;
import com.cg.creditcard.entity.Customer;
@Service
public class CustomerService implements ICustomerService {
	@Autowired
	CustomerRepository dao;

	@Override
	public void addCustomer(Customer customer) {
		dao.save(customer);
	}

	@Override
	public void removeCustomer(int userid) {
		dao.deleteById(userid);
	}

	@Override
	public Customer getCustomer(int userid) {
		return dao.findById(userid).orElse(null);
	}

	@Override
	public void updateCustomer(int userid, Customer customer) {
		dao.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		List<Customer>customerList=dao.findAll();
		return customerList;
	}

}
