package com.smile.functions.dao;

import java.util.List;

import com.smile.exception.SmileException;
import com.smile.model.ViewAccount;

public interface ViewAccountDAO {
	public List<ViewAccount> viewAccount(int ID,String account_type) throws SmileException;

}
