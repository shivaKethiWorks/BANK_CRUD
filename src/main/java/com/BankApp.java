package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApp {

	public static void main(String[] args) {
		SpringApplication.run(BankApp.class, args);
		
		System.out.println("Hello World From Spring App");
	}

}

