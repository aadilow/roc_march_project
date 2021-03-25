package com.smile.employee.dao;

import com.smile.exception.SmileException;
import com.smile.model.UserLogin;

public interface EmployeeLoginDAO {
	public int employeeLogin(UserLogin login) throws SmileException;
}
