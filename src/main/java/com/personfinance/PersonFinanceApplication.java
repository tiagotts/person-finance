package com.personfinance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.personfinance")
@ComponentScan("com.personfinance.infrastructure")
@EnableJpaRepositories("com.personfinance.modules.user.adaters.output.persistence")
public class PersonFinanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonFinanceApplication.class, args);
    }
}
