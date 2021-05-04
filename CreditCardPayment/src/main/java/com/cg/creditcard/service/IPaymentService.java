package com.cg.creditcard.service;

import java.util.List;
import com.cg.creditcard.entity.Payment;
import com.cg.creditcard.utils.IDNotFoundException;
import com.cg.creditcard.utils.NoTransactionFoundException;
public interface IPaymentService {
	public void addPayment(Payment payment);
	public Payment getPaymentDetails(int paymentId) throws IDNotFoundException;
	public List<Payment> getAllDetails() throws NoTransactionFoundException; 

}
