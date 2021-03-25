package com.smile.functions.service;

import com.smile.exception.SmileException;
import com.smile.model.ApproveAccount;

public interface ApproveAccountService {

	public int approveAccount(int ID, String account_type) throws SmileException;

	public int denyAccount(int ID, String account_type) throws SmileException;

	public int searchAccount(String account_type) throws SmileException;

}
