package com.cg.creditcard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcard.dao.AccountRepository;
import com.cg.creditcard.dao.CreditCardRepository;
import com.cg.creditcard.dao.CustomerRepository;
import com.cg.creditcard.dao.PaymentTransactionRepository;
import com.cg.creditcard.dao.StatementRepository;
import com.cg.creditcard.dto.CustomerDto;
import com.cg.creditcard.entity.Account;
import com.cg.creditcard.entity.CreditCard;
import com.cg.creditcard.entity.Customer;
import com.cg.creditcard.entity.PaymentTransaction;
import com.cg.creditcard.entity.Statement;
import com.cg.creditcard.utils.DuplicateAccountException;
import com.cg.creditcard.utils.IDNotFoundException;
import com.cg.creditcard.utils.ListIsEmptyException;
@Service
public class CustomerService implements ICustomerService {
	@Autowired
	CustomerRepository dao;
	@Autowired
	AccountRepository accountdao;
	@Autowired
	CreditCardRepository creditcarddao;
	@Autowired
		PaymentTransactionRepository paymentdao;
	@Autowired
	StatementRepository statementdao;
	List<Customer> customerList=new ArrayList<>();
	public void addCustomer(CustomerDto customerdto)throws DuplicateAccountException {
		Customer customer=new Customer();
	    customer.setFirst_name(customerdto.getFirst_name());
	    customer.setUserid(customerdto.getUserid());
	    customer.setLast_name(customerdto.getLast_name());
	    customer.setEmail(customerdto.getEmail());
	    customer.setDob(customerdto.getDob());
	    customer.setContact_no(customerdto.getContact_no());
	    Account account =accountdao.getAccountById(customerdto.getAccount());
	    customer.setAccount(account);
	    CreditCard creditcard=creditcarddao.getCardNumberById(customerdto.getCreditcard());
	    customer.setCreditcard(creditcard);
	    PaymentTransaction paymenttransaction= paymentdao.getTransactionById(customerdto.getPaymentTransaction());
	    customer.setPaymentTransaction(paymenttransaction);
	    Statement  statement=statementdao.getStatementById(customerdto.getStatement());
	    customer.setStatement(statement);
	    customerList=dao.findAll();
	    for(Customer cdt:customerList) {
	    	 if(cdt.getUserid()==customerdto.getUserid()) {
	    		 throw  new DuplicateAccountException();
	    	 }
	    }
	    dao.save(customer);  
	}

	@Override
	public void removeCustomer(int userid) throws IDNotFoundException {
		customerList=dao.findAll();
		for(Customer cdt:customerList) {
			if(cdt.getUserid()==userid) {
				dao.deleteById(userid);
				return;
	}	
	}
		throw new  IDNotFoundException();
	}

	@Override
	public Customer getCustomer(int userid) throws IDNotFoundException{
		 customerList=dao.findAll();
		for(Customer cdt:customerList) {
			if(cdt.getUserid()==userid) {
				return dao.findById(userid).orElse(null);
			}
		}
		throw new  IDNotFoundException();
	}

	@Override
	public void updateCustomer(int userid, Customer customer) throws IDNotFoundException{
		customerList=dao.findAll();
		for(Customer cdt:customerList) {
			if(cdt.getUserid()==userid) {
		dao.save(customer);
		return;
	}
		}
		throw new IDNotFoundException();
	}

	@Override
	public List<Customer> getAllCustomer() throws ListIsEmptyException {
		customerList=dao.findAll();
	if(customerList==null) {
		throw new ListIsEmptyException();
	}
		return customerList;
	}
}
