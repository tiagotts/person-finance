package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.personfinance.application", "com.personfinance.infrastructure.persistence", "com.personfinance.infrastructure.mapper",
		"com.personfinance.application.service", "com.personfinance.domain.port.output", "com.personfinance.adapter.output.persistence", 
	"com.personfinance.adapter.input.rest"})
@SpringBootApplication(scanBasePackages = "com.personfinance")
@EntityScan("com.personfinance.infrastructure.persistence.entity")
@EnableJpaRepositories("com.personfinance.infrastructure.persistence.repository")
public class PersonFinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonFinanceApplication.class, args);
	}

}
