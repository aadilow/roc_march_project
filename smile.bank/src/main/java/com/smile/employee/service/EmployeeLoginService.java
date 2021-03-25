package com.smile.employee.service;

import com.smile.exception.SmileException;
import com.smile.model.UserLogin;

public interface EmployeeLoginService {

	public int employeeLogin(UserLogin login) throws SmileException;
}
