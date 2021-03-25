package com.smile.customer.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.smile.customer.service.RegisterCustomerService;
import com.smile.exception.SmileException;
import com.smile.model.Customer;

class RegisterCustomerServiceImplTest {
	private static RegisterCustomerService RCS;
	
	@BeforeAll
	public static void setUpRCS() {
	RCS= new RegisterCustomerServiceImpl();
	}
	
	@Test
	void testCreateCustomerForNull() {
		try {
			assertEquals(false,RCS.createCustomer(null));
		} catch (SmileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	void testCreateCustomerForShortName() {
		String name;
		Customer customer = null;
		try {
			assertEquals(false,RCS.createCustomer(customer));
		} catch (SmileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	void testCreateCustomerCreds() {
		fail("Not yet implemented");
	}

	@Test
	void testPurgeNegative() {
		try {
			assertEquals(false,RCS.purge(-3, -3));
		} catch (SmileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	void testPurgeZero() {
		try {
			assertEquals(true,RCS.purge(0, 0));
		} catch (SmileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	void testPurgePositive() {
		try {
			assertEquals(true,RCS.purge(1, 0));
		} catch (SmileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	void testPurgeTooPositive() {
		try {
			assertEquals(false,RCS.purge(2, 0));
		} catch (SmileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
