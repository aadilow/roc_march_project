package com.smile.functions.service;

import com.smile.exception.SmileException;
import com.smile.model.OpenAccount;

public interface OpenAccountService {
	public int openChecking(OpenAccount open) throws SmileException;

	public int openSavings(OpenAccount open) throws SmileException;

	public int quickfindID(String email) throws SmileException;

}
