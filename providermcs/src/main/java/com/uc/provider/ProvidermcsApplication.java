package com.uc.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan("com.uc.controller,com.uc.service")
public class ProvidermcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvidermcsApplication.class, args);
	}

}
