package com.cg.creditcard.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.creditcard.dao.AccountRepository;
import com.cg.creditcard.entity.Account;
import com.cg.creditcard.utils.DuplicateAccountException;
import com.cg.creditcard.utils.IDNotFoundException;
import com.cg.creditcard.utils.ListIsEmptyException;
@Service
public class AccountService implements IAccountService {
	@Autowired
	AccountRepository dao;
	List<Account> accountList=new ArrayList<>();

	@Override
	public void addAccount(Account account) throws DuplicateAccountException{
		 for(Account acc:accountList) {
	    	 if(acc.getAccount_id()==account.getAccount_id()) {
	    		 throw  new DuplicateAccountException();
	    	 }
	    }
		dao.save(account);
	}
	@Override
	public void removeAccount(int account_id) throws IDNotFoundException{
		accountList=dao.findAll();
		for(Account acc:accountList) {
			if(acc.getAccount_id()==account_id) {
	               	dao.deleteById(account_id);
	               	return;
	}
		}
		throw new IDNotFoundException();
	}

	@Override
	public Account getAccount(int account_id)throws IDNotFoundException {
		accountList=dao.findAll();
		for(Account acc:accountList) {
			if(acc.getAccount_id()==account_id) {
		return dao.findById(account_id).orElse(null);
	}
		}
		throw new IDNotFoundException();
	}
	@Override
	public void updateAccount(int account_id, Account account)throws IDNotFoundException {
		accountList=dao.findAll();
		for(Account acc:accountList) {
			if(acc.getAccount_id()==account_id) {
		dao.save(account);	
		return;
	}
		}
		throw new IDNotFoundException();
	}
	@Override
	public List<Account> getAllAccount() throws ListIsEmptyException{
		accountList=dao.findAll();
			if(accountList==null) {
			throw new ListIsEmptyException();
			}
		return dao.findAll();
	}
}
