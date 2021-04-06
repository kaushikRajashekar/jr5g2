package com.cg.creditcard.service;

import java.util.List;

import com.cg.creditcard.entity.Account;

public interface IAccountService {
	public void addAccount(Account account);
	public void removeAccount(int account_id);
	public Account getAccount(int account_id);
	public void updateAccount(int account_id, Account account);
	public List<Account> getAllAccount();

}
