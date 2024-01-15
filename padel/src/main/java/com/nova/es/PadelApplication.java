package com.nova.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = PadelApplication.class)
public class PadelApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadelApplication.class, args);
	}
	
}
