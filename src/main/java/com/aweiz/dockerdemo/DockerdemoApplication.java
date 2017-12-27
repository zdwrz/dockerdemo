package com.aweiz.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerdemoApplication.class, args);
	}
}
