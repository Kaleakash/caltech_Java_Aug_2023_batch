package com.pms.service;

import com.pms.bean.Login;
import com.pms.dao.LoginDao;

public class LoginService {
	
	LoginDao ld = new LoginDao();
	
	public String signUp(Login login) {
		

		if(login.getTypeOfUser().equals("admin")) {
			return "You can't create admin account";
		}else {
			String result = ld.signUp(login);
			return result;
		}		
	}
	
	public String signIn(Login login) {
		String result = ld.signIn(login);
		return result;
	}
}
