package com.cg.creditcard.test;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.cg.creditcard.dao.LoginRepository;
import com.cg.creditcard.entity.Login;
import com.cg.creditcard.service.LoginService;

@RunWith(MockitoJUnitRunner.class)
public class TestLogin {
	@InjectMocks
	LoginService loginservice;
	
	@Mock
	LoginRepository loginDao;
	
	@Test
	public void signIn() {
//		List<Login> loginList=new ArrayList<Login>();
//		loginList.add(new Login(12,"abc123"));
//		loginList.add(new Login(13,"abd123"));
//		loginList.add(new Login(15,"bbc123"));
//		Mockito.when(loginDao.findById(loginId))
		Login login=new Login();
		login.setLoginid(123);
		login.setPassword("abc123");
		loginDao.save(login);
		Assert.assertNotNull(login.getLoginid());
		Mockito.verify(loginDao,Mockito.times(1)).save(login);
		
	}
	
}
