package com.smile.customer.dao;

import com.smile.exception.SmileException;
import com.smile.model.UserLogin;

public interface CustomerLoginDAO {
	public int customerLogin(UserLogin login) throws SmileException;
}
