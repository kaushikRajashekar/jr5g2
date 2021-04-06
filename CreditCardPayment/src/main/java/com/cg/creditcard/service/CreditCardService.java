package com.cg.creditcard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.creditcard.dao.CreditCardRepository;
import com.cg.creditcard.entity.CreditCard;
@Service
public class CreditCardService implements ICreditCardService {
	@Autowired
	CreditCardRepository dao;

	@Override
	public void addCreditCard(CreditCard creditcard) {
		dao.save(creditcard);
	}

	@Override
	public void removeCreditCard(long card_number) {
		dao.deleteById(card_number);
	}

	@Override
	public void updateCreditCard(long card_number, CreditCard creditcard) {
		dao.save(creditcard);
	}

	@Override
	public CreditCard getCreditCardById(long card_number) {
		return dao.findById(card_number).orElse(null);
	}

	@Override
	public List<CreditCard> getAllCreditCard() {
		return dao.findAll();
	}

}
