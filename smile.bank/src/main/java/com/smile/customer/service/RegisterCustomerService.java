package com.smile.customer.service;

import com.smile.exception.SmileException;
import com.smile.model.Customer;
import com.smile.model.Customer_Creds;

public interface RegisterCustomerService {

	
	  public int createCustomer(Customer customer) throws SmileException;
	  
	  public int createCustomerCreds(Customer_Creds customercreds) throws
	  SmileException;
	  
	  public int purge(int purgeme,int id) throws SmileException;
	
}
