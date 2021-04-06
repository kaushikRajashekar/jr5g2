package com.cg.creditcard.service;

import java.util.List;

import com.cg.creditcard.entity.CreditCard;

public interface ICreditCardService {
	public void addCreditCard(CreditCard creditcard);
	public void removeCreditCard(long card_number);
	public void updateCreditCard(long card_number,CreditCard creditcard);
	public CreditCard getCreditCardById(long card_number);
	public List<CreditCard> getAllCreditCard();

}
