package com.CBSDemoBank.demoBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoBankApplication {
	/*

	develop a spring boot application and deploy that in open liberty.
	the application should have GET/POST and PUT APIs to update basic banks data like:
	1. Bank name
	2. Bank Branch
	3. Account holder name
	4. Account number
	5. Mobile number
	6. Account holder email id
	 */

	public static void main(String[] args) {
		SpringApplication.run(DemoBankApplication.class, args);
	}

}
