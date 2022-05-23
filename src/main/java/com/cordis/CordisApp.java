package com.cordis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CordisApp extends SpringBootServletInitializer {
	public static void main(String[] args) {
		System.out.println("Cordis v2 App");
		SpringApplication.run(CordisApp.class, args);
	}
}
