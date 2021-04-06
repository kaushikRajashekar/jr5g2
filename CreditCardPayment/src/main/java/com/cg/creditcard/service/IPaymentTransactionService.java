package com.cg.creditcard.service;

import java.util.List;

import com.cg.creditcard.entity.PaymentTransaction;
import com.cg.creditcard.utils.IDNotFoundException;
import com.cg.creditcard.utils.NoTransactionFoundException;

public interface IPaymentTransactionService {
	public PaymentTransaction getTransactionDetails(int transaction_id) throws IDNotFoundException;
	public List<PaymentTransaction> getAllTransactions() throws NoTransactionFoundException; 

}
