package com.smile.model;

public class Transactions {
	private int customer_id;
	private String transaction_type;
	private String account_type;
	private double transaction_amount;
	
	
	
	public Transactions() {
		// TODO Auto-generated constructor stub
	}



	public Transactions(int customer_id, String transaction_type, String account_type, double transaction_amount) {
		super();
		this.customer_id = customer_id;
		this.transaction_type = transaction_type;
		this.account_type = account_type;
		this.transaction_amount = transaction_amount;
	}



	public int getCustomer_id() {
		return customer_id;
	}



	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}



	public String getTransaction_type() {
		return transaction_type;
	}



	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}



	public String getAccount_type() {
		return account_type;
	}



	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}



	public double getTransaction_amount() {
		return transaction_amount;
	}



	public void setTransaction_amount(double transaction_amount) {
		this.transaction_amount = transaction_amount;
	}



	@Override
	public String toString() {
		return "Transactions [customer_id=" + customer_id + ", transaction_type=" + transaction_type + ", account_type="
				+ account_type + ", transaction_amount=" + transaction_amount + "]";
	}
	

}
