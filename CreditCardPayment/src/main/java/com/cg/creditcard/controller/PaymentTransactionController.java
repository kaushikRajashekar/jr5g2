package com.cg.creditcard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cg.creditcard.entity.PaymentTransaction;
import com.cg.creditcard.service.PaymentTransactionService;

@RestController
@RequestMapping("/transaction")
public class PaymentTransactionController {
	@Autowired
	PaymentTransactionService service;
	
	@GetMapping("/alltrans")
	public ResponseEntity<List<PaymentTransaction>>getAllTransactions()
	{
		List<PaymentTransaction>transList=service.getAllTransactions();
		return new ResponseEntity<List<PaymentTransaction>>(transList,HttpStatus.OK);
	}
	
	@GetMapping("/gettrans")
	public ResponseEntity<PaymentTransaction>getTransactionDetails(@RequestParam int transaction_id)
	{
		PaymentTransaction transaction=service.getTransactionDetails(transaction_id);
		return new ResponseEntity<PaymentTransaction>(transaction,HttpStatus.OK);
	}
}
