package com.smile.functions.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.smile.exception.SmileException;
import com.smile.functions.service.ApproveAccountService;

class ApproveAccountServiceImplTest {
	private static ApproveAccountService AAS;
	
	@BeforeAll
	public static void setUpAAS(){
		AAS= new ApproveAccountServiceImpl();
	}
	
	@Test
	void testApproveAccountForNull() {
		try {
			assertEquals(false,AAS.approveAccount(0, null));
		} catch (SmileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	void testApproveAccountForBadAccType() {
		try {
			assertEquals(false,AAS.approveAccount(0, "filet"));
		} catch (SmileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	void testApproveAccountForGoodAccType() {
		try {
			assertEquals(true,AAS.approveAccount(0, "checking"));
		} catch (SmileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	void testApproveAccountForGoodAccType2() {
		try {
			assertEquals(true,AAS.approveAccount(2, "savings"));
		} catch (SmileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	void testDenyAccountForBadAccType() {
		try {
			assertEquals(false,AAS.denyAccount(0, "flank"));
		} catch (SmileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testSearchAccountForBadAccType() {
		try {
			assertEquals(false,AAS.searchAccount("steak"));
		} catch (SmileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
