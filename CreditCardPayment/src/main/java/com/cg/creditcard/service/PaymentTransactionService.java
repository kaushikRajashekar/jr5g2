package com.cg.creditcard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcard.dao.PaymentTransactionRepository;
import com.cg.creditcard.entity.PaymentTransaction;

@Service
public class PaymentTransactionService implements IPaymentTransactionService {
	@Autowired
	PaymentTransactionRepository dao;

	@Override
	public PaymentTransaction getTransactionDetails(int transaction_id) {
		dao.findById(transaction_id);
		return getTransactionDetails(transaction_id);
	}

	@Override
	public List<PaymentTransaction> getAllTransactions() {
		return dao.findAll();
	}

}
