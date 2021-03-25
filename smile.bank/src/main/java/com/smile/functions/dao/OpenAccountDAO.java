package com.smile.functions.dao;

import com.smile.exception.SmileException;
import com.smile.model.OpenAccount;

public interface OpenAccountDAO {
	public int openChecking(OpenAccount open) throws SmileException;

	public int openSavings(OpenAccount open) throws SmileException;
	
	public int quickfindID(String email) throws SmileException;
}
