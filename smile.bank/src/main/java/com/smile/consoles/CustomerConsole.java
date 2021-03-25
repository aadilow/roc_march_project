package com.smile.consoles;

import com.smile.functions.Functions;
import com.smile.log.SmileLog;
import java.util.Scanner;

public class CustomerConsole {
	

	public void customerMainConsole(String email) {
		Scanner scanner = new Scanner(System.in);
		SmileLog smile = new SmileLog();
		Functions run= new Functions();
		
		int ch = 0;
		do {
			try {
				smile.message("User: "+email);
				smile.customerConsole();
				ch = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
			}
			switch (ch) {

			case 1:
				// Open checking or savings account
				run.OpenAccountMethod(email);
				ch = 0;
				break;
			case 2:
				// Withdraw
				ch = 0;
				break;
			case 3:
				// Deposit
				ch = 0;
				break;
			case 4:
				// Transfer
				ch = 0;
				break;
			case 5:
				// Send Money
				ch = 0;
				break;
			case 6:
				// Logout
				smile.message("Logging out...");
				smile.message("");
				break;
			default:
				smile.error();
				break;
			}
		} while (ch != 6);
	}
}
