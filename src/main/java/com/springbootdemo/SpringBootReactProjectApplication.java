package com.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.reactspring")
@EnableJpaRepositories(basePackages = "com.reactspring.Dao")
@EntityScan(basePackages = "com.reactspring.Model")
public class SpringBootReactProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactProjectApplication.class, args);
	}

}
