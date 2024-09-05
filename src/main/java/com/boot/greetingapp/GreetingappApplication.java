package com.boot.greetingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class GreetingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingappApplication.class, args);
	}

	@GetMapping("/annie")
	public String welcome() {
		return "welcome annie";
	}
	@GetMapping("/anu")
	public String greeting() {
		return "welcome anu";
	}
	@GetMapping("/hema")
	public String hello() {
		return "welcome hema";
	}
	@GetMapping("/riya")
	public String hi() {
		return "welcome riya";
	}

}
