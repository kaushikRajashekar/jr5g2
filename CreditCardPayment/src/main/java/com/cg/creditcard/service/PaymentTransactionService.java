package com.cg.creditcard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcard.dao.PaymentTransactionRepository;
import com.cg.creditcard.entity.PaymentTransaction;
import com.cg.creditcard.utils.IDNotFoundException;
import com.cg.creditcard.utils.NoTransactionFoundException;

@Service
public class PaymentTransactionService implements IPaymentTransactionService {
	@Autowired
	PaymentTransactionRepository dao;
	List<PaymentTransaction>paymenttransactionList=new ArrayList<>();

	@Override
	public PaymentTransaction getTransactionDetails(int transaction_id) throws IDNotFoundException {
		paymenttransactionList=dao.findAll();
		for(PaymentTransaction pt:paymenttransactionList) {
		if(pt.getTransaction_id()==transaction_id) {
			dao.findById(transaction_id);
		return getTransactionDetails(transaction_id);
		}
		}
		throw new IDNotFoundException ();
	}

	@Override
	public List<PaymentTransaction> getAllTransactions()throws NoTransactionFoundException {
		paymenttransactionList=dao.findAll();
		if(paymenttransactionList==null) {
			throw new NoTransactionFoundException();
			
		}
		return dao.findAll();
	}

}
