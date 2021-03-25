package com.smile.customer.service.impl;

import com.smile.customer.dao.CustomerLoginDAO;
import com.smile.customer.dao.impl.CustomerLoginDAOImpl;
import com.smile.customer.service.CustomerLoginService;
import com.smile.exception.SmileException;
import com.smile.model.UserLogin;

public class CustomerLoginServiceImpl implements CustomerLoginService {
	private CustomerLoginDAO customerlogindao = new CustomerLoginDAOImpl();
	
	@Override
	public int customerLogin(UserLogin login) throws SmileException {
		if (!CustomerValidation.isValidEmail(login.getEmail())) {
			throw new SmileException(login.getEmail() + " is not a valid Email.");
		}
		if (!CustomerValidation.isValidPassword(login.getPassword())) {
			throw new SmileException(login.getPassword() + " is not a valid Password.");
		}
		return customerlogindao.customerLogin(login);
	}
}
