package com.smile.functions.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import com.smile.bank.dao.dbutil.PostgresConnection;
import com.smile.exception.SmileException;
import com.smile.functions.dao.ViewAccountDAO;
import com.smile.log.SmileLog;
import com.smile.model.ViewAccount;

public class ViewAccountDAOImpl implements ViewAccountDAO {

	@Override
	public List<ViewAccount> viewAccount(int ID,String account_type) throws SmileException {
		List<ViewAccount> viewList = new ArrayList<>();
	

		Scanner scanner = new Scanner(System.in);
		SmileLog smile= new SmileLog();
		
		try (Connection connection = PostgresConnection.getConnection()) {
			String qry = null;
			if (account_type.equals("checking")) {
				qry = "select acc_num,balance,account_status from bank_schema.checking where customer_id =?";
			}
			if (account_type.equals("savings")) {
				qry = "select acc_num,balance,account_status from bank_schema.savings where customer_id =?";
			}
			PreparedStatement preparedStatement = null;
			preparedStatement = connection.prepareStatement(qry);
			preparedStatement.setInt(1, ID);

			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				ViewAccount view = new ViewAccount();
				view.setAcc_num(rs.getInt("acc_num"));
				view.setBalance(rs.getDouble("balance"));
				view.setAccount_status(rs.getString("account_status"));
				view.setAccount_type(account_type);
				view.setCustomer_id(ID);
				viewList.add(view);
			}
			if(viewList.size()==0) {
				throw new SmileException("No " +account_type +" accounts found for Customer ID " +ID);
			}
			else {
				smile.message(viewList.toString());
			}
				
		} catch (ClassNotFoundException | SQLException e) {
			smile.eventFail(e);
			e.printStackTrace();
			throw new SmileException("FUBAR");
		}

		return viewList;
	}
}
