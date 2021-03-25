package com.smile.customer.service;

import com.smile.exception.SmileException;
import com.smile.model.UserLogin;

public interface CustomerLoginService {

	public int customerLogin(UserLogin login) throws SmileException;
}
