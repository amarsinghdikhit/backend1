package com.personnal.backend1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.personnal.backend1")
public class Backend1Application {

	public static void main(String[] args) {
		SpringApplication.run(Backend1Application.class, args);
	}

}
