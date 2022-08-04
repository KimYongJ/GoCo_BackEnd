package com.pchr.goco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.pchr.api" , "com.pchr.service" , "com.pchr.service.impl","com.pchr.config" ,"com.pchr.jwt"})
@EntityScan(basePackages = {"com.pchr.entity"})
@EnableJpaRepositories(basePackages = {"com.pchr.repository"})
@EnableJpaAuditing
public class GocoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GocoApplication.class, args);
	}

}
