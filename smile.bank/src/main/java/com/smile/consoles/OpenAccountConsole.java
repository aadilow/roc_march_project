package com.smile.consoles;

import java.util.Scanner;

import com.smile.functions.Functions;
import com.smile.log.SmileLog;

public class OpenAccountConsole {

	public void openAccConsole(String email) {
		SmileLog smile = new SmileLog();
		Scanner scanner = new Scanner(System.in);
		Functions run= new Functions();
		int ch = 0;

		do {
			try {
				smile.openAcc();
				ch = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
			}
			switch (ch) {
			case 1:
				//open checking
				run.OpenCheckingMethod(email);
				ch=0;
				break;
			case 2:
				//open savings
				run.OpenSavingsMethod(email);
				ch=0;
				break;
			case 3:
				smile.message("Going back...");
				smile.message("");
				break;
			default:
				smile.error();
				break;
			}
		} while (ch != 3);
	}
}
