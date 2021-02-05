package com.example.customerfeedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
@ComponentScan(basePackages = "com")

@EntityScan(basePackages = "com")
@EnableJpaRepositories(basePackages = "com")
public class CustomerfeedbackApplication {
	@GetMapping("/feedback")
	public String feedback() {
		return "feedback";
	}

	public static void main(String[] args) {
		SpringApplication.run(CustomerfeedbackApplication.class, args);
	}

}
