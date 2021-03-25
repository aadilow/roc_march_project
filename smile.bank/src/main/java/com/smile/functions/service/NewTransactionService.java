package com.smile.functions.service;

import com.smile.exception.SmileException;

public interface NewTransactionService {
	public int withdrawAcc() throws SmileException;
	
	public int depositAcc() throws SmileException;
	
	public int transferAcc() throws SmileException;

}
