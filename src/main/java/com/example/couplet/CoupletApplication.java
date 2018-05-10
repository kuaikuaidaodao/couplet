package com.example.couplet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class CoupletApplication {
@RequestMapping("/")
String home(){
	return "index";
}
	public static void main(String[] args) {
		SpringApplication.run(CoupletApplication.class, args);
	}
}
