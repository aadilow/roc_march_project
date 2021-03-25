package com.smile.functions.service.impl;

import com.smile.exception.SmileException;
import com.smile.functions.dao.ApproveAccountDAO;
import com.smile.functions.dao.impl.ApproveAccountDAOImpl;
import com.smile.functions.service.ApproveAccountService;

public class ApproveAccountServiceImpl implements ApproveAccountService {
	private ApproveAccountDAO appaccdao = new ApproveAccountDAOImpl();

	@Override
	public int approveAccount(int ID, String account_type) throws SmileException {
		// TODO Auto-generated method stub
		return appaccdao.approveAccount(ID, account_type);
	}

	@Override
	public int denyAccount(int ID, String account_type) throws SmileException {
		// TODO Auto-generated method stub
		return appaccdao.denyAccount(ID, account_type);
	}

	@Override
	public int searchAccount(String account_type) throws SmileException {
		// TODO Auto-generated method stub
		return appaccdao.searchAccount(account_type);
	}
}
