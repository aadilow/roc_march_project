package com.smile.functions.service.impl;

import java.util.List;

import com.smile.exception.SmileException;
import com.smile.functions.dao.ViewAccountDAO;
import com.smile.functions.dao.impl.ViewAccountDAOImpl;
import com.smile.functions.service.ViewAccountService;
import com.smile.model.ViewAccount;

public class ViewAccountServiceImpl implements ViewAccountService {
	ViewAccountDAO viewaccdao= new ViewAccountDAOImpl();
	
	@Override
	public List<ViewAccount> viewAccount(int ID, String account_type) throws SmileException {
		// TODO Auto-generated method stub
		return viewaccdao.viewAccount(ID, account_type);
	}

}
