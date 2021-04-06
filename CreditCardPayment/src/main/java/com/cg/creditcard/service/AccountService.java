package com.cg.creditcard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.creditcard.dao.AccountRepository;
import com.cg.creditcard.entity.Account;
@Service
public class AccountService implements IAccountService {
	@Autowired
	AccountRepository dao;

	@Override
	public void addAccount(Account account) {
		dao.save(account);
	}

	@Override
	public void removeAccount(int account_id) {
		dao.deleteById(account_id);
	}

	@Override
	public Account getAccount(int account_id) {
		return dao.findById(account_id).orElse(null);
	}

	@Override
	public void updateAccount(int account_id, Account account) {
		dao.save(account);	
	}
	@Override
	public List<Account> getAllAccount() {
		return dao.findAll();
	}

}
