package com.smile.functions.service;

import java.util.List;

import com.smile.exception.SmileException;
import com.smile.model.ViewAccount;

public interface ViewAccountService {
	public List<ViewAccount>viewAccount(int ID, String account_type) throws SmileException;
}
