package com.cg.creditcard.service;

import java.util.List;

import com.cg.creditcard.entity.PaymentTransaction;

public interface IPaymentTransactionService {
	public PaymentTransaction getTransactionDetails(int transaction_id);
	public List<PaymentTransaction> getAllTransactions(); 

}
