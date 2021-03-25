package com.smile.main;


import com.smile.consoles.SmileConsole;

//import java.util.Scanner;

//import org.apache.log4j.Logger;

import com.smile.log.SmileLog;

public class SmileMain {
	// private static Logger log = Logger.getLogger(SmileMain.class);

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);

		SmileLog smile = new SmileLog();
		SmileConsole menu = new SmileConsole();

		smile.hello();
		menu.consoleMain();
		smile.goodbye();
	}

}
