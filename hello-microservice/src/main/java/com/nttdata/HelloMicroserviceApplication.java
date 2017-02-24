package com.nttdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloMicroserviceApplication.class, args);
	}

	@RequestMapping("/hello")
	public String sayHello() {
		return ("Hello, SpringBoot on Wildfly created by Joby");
	}
}
