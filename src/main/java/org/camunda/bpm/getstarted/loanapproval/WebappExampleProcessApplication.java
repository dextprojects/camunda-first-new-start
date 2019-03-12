package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableProcessApplication("bpm")
@EntityScan(basePackages = { "com" })
@EnableAutoConfiguration
public class WebappExampleProcessApplication {
	
	public static void main(String... args) {
		SpringApplication.run(WebappExampleProcessApplication.class, args);
	}
	
}