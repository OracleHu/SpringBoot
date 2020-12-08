package com.X.spring_boot_test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class RequestHandling {
	@RequestMapping("/")
	String home() {
		return "Hello World";
	}
}
