package com.cg.creditcard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcard.dao.LoginRepository;
import com.cg.creditcard.entity.Login;
@Service
public class LoginService implements ILoginService {
	@Autowired
	LoginRepository dao;

	@Override
	public Login signIn(int loginid) {
		 dao.findById(loginid);
		 return signIn(loginid);
	}

	@Override
	public void changePassword(Login login, String password) {
			dao.save(login);
		
	}

}
