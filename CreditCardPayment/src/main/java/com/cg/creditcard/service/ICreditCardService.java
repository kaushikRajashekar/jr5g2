package com.cg.creditcard.service;
import java.util.List;
import com.cg.creditcard.entity.CreditCard;
import com.cg.creditcard.utils.CardNumberNotFoundException;
import com.cg.creditcard.utils.ListIsEmptyException;
public interface ICreditCardService {
	public void addCreditCard(CreditCard creditcard);
	public void removeCreditCard(int card_number)throws CardNumberNotFoundException;
	public void updateCreditCard(int card_number,CreditCard creditcard)throws CardNumberNotFoundException;
	public CreditCard getCreditCardById(int card_number)throws CardNumberNotFoundException;
	public List<CreditCard> getAllCreditCard() throws ListIsEmptyException;
}
