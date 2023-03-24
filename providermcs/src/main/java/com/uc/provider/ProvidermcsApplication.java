package com.uc.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@ComponentScan(basePackages = {"com.uc.controller","com.uc.service","com.uc.dao"})
@EntityScan(basePackages = {"com.uc.entity"} )
@EnableJpaRepositories(basePackages = {"com.uc.dao"})
public class ProvidermcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvidermcsApplication.class, args);
	}

}
