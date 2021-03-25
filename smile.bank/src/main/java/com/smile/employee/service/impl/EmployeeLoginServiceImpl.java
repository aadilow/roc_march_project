package com.smile.employee.service.impl;

import com.smile.customer.service.impl.CustomerValidation;
import com.smile.employee.dao.EmployeeLoginDAO;
import com.smile.employee.dao.impl.EmployeLoginDAOImpl;
import com.smile.employee.service.EmployeeLoginService;
import com.smile.exception.SmileException;
import com.smile.model.UserLogin;

public class EmployeeLoginServiceImpl implements EmployeeLoginService {
	private EmployeeLoginDAO employeelogindao = new EmployeLoginDAOImpl();

	@Override
	public int employeeLogin(UserLogin login) throws SmileException {
		if (!CustomerValidation.isValidEmail(login.getEmail())) {
			throw new SmileException(login.getEmail() + " is not a valid Email.");
		}
		if (!CustomerValidation.isValidPassword(login.getPassword())) {
			throw new SmileException(login.getPassword() + " is not a valid Password.");
		}
		return employeelogindao.employeeLogin(login);
	}

}
