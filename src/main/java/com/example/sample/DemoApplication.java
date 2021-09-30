package com.example.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.sample" )
@EnableJpaRepositories(basePackages = ("com.example.sample.repo"))
//@ComponentScan(basePackages = (" com.example.sample.controller","com.example.sample.model","com.example.sample.repo","com.example.sample.service","com.example.sample.config.copy","com.example.sample.serviceImpl"))
@ComponentScan({"com.example.sample","com.example.sample.controller","com.example.sample.model","com.example.sample.repo","com.example.sample.service","com.example.sample.config.copy","com.example.sample.serviceImpl"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
