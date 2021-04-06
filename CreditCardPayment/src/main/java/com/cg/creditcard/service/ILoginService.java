package com.cg.creditcard.service;

import com.cg.creditcard.entity.Login;
public interface ILoginService {
	public Login signIn(int loginid);
	public void changePassword(Login login,String password) ;

}
