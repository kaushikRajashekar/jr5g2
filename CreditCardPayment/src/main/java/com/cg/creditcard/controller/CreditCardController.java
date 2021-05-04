package com.cg.creditcard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcard.entity.CreditCard;
import com.cg.creditcard.service.CreditCardService;
@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/creditcard")
public class CreditCardController {
	@Autowired
	CreditCardService service;
	
	@PostMapping("/addcreditcard")
	public ResponseEntity<String> addCreditCard(@RequestBody CreditCard creditcard)
	{
		service.addCreditCard(creditcard);
		return new ResponseEntity<>("CreditCard added",HttpStatus.OK);
	}
	@DeleteMapping("/deletecard")
	public ResponseEntity<String> deleteCreditCard(@RequestParam int card_number)
	{
		service.removeCreditCard(card_number);
		return new ResponseEntity<String>("card deleted..",HttpStatus.OK);
	}
	@PutMapping("/updateCreditCard")
	public ResponseEntity<String> updateCreditCard(@RequestBody CreditCard creditcard,@RequestParam int card_number)
	{
		service.updateCreditCard(card_number, creditcard);
		return new ResponseEntity<String>("Successfully updated",HttpStatus.OK);
	}
	@GetMapping("/getCreditCard")
	public ResponseEntity<CreditCard> getCreditCard(@RequestParam int card_number)
	{
		CreditCard creditcard=service.getCreditCardById(card_number);
		return new ResponseEntity<CreditCard>(creditcard,HttpStatus.OK);
	}
	@GetMapping("/getall")
	public ResponseEntity<List<CreditCard>> getAllCreditCard()
	{
		List<CreditCard> numberList=service.getAllCreditCard();
		return new ResponseEntity<List<CreditCard>>(numberList,HttpStatus.OK);
	}
	

}
