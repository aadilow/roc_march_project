package com.smile.functions.dao;

import com.smile.exception.SmileException;
import com.smile.model.ApproveAccount;

public interface ApproveAccountDAO {
	public int approveAccount(int ID, String account_type) throws SmileException;

	public int denyAccount(int ID, String account_type) throws SmileException;

	public int searchAccount(String account_type) throws SmileException;
}
