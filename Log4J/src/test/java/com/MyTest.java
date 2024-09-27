package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyTest {
	
	private static final Logger log = LogManager.getLogger(MyTest.class);
	public static void main(String[] args) {
		
		
		//System.out.println("Hello...");
		log.info("This is information message");
		log.debug("This is debug message");
		log.error("This is error message");
	}
}
