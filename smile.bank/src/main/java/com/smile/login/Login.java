package com.smile.login;

import java.util.Scanner;

import com.smile.consoles.CustomerConsole;
import com.smile.consoles.EmployeeConsole;
import com.smile.customer.service.CustomerLoginService;
import com.smile.customer.service.impl.CustomerLoginServiceImpl;
import com.smile.employee.service.EmployeeLoginService;
import com.smile.employee.service.impl.EmployeeLoginServiceImpl;
import com.smile.exception.SmileException;
import com.smile.log.SmileLog;
import com.smile.model.UserLogin;

public class Login {
	SmileLog smile = new SmileLog();
	Scanner scanner = new Scanner(System.in);

	public void CustomerLoginMethod() {

		UserLogin newLogin = new UserLogin();
		CustomerLoginService loginService = new CustomerLoginServiceImpl();
		CustomerConsole auth = new CustomerConsole();
		
		smile.message("Please Login with your Credentials");
		smile.message("");

		smile.message("Enter your Email: ");
		newLogin.setEmail(scanner.nextLine());

		smile.message("Enter your Password: ");
		newLogin.setPassword(scanner.nextLine());

		try {
			if (loginService.customerLogin(newLogin) == 1) {
				smile.message("Login Success!");
				String email=newLogin.getEmail();
				
				auth.customerMainConsole(email);
				
			} else {
				smile.warn("Login Failed! Incorrect Email or Password");
			}

		} catch (SmileException e) {
			smile.message("Login Failed!");
			smile.eventFail(e);
		}
	}

	public void EmployeeLoginMethod() {
		UserLogin newLogin = new UserLogin();
		EmployeeLoginService loginService = new EmployeeLoginServiceImpl();
		EmployeeConsole auth = new EmployeeConsole();
		
		smile.message("Please Login with your Credentials");
		smile.message("");

		smile.message("Enter your Email: ");
		newLogin.setEmail(scanner.nextLine());

		smile.message("Enter your Password: ");
		newLogin.setPassword(scanner.nextLine());

		try {
			if ((loginService.employeeLogin(newLogin)) == 1) {
				smile.message("Login Success!");
				auth.employeeMainConsole();
				
			} else {
				smile.warn("Login Failed! Incorrect Email or Password");
			}

		} catch (SmileException e) {
			smile.message("Login Failed!");
			smile.eventFail(e);
		}

	}
}
