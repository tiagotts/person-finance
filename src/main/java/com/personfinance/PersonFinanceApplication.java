package com.personfinance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.personfinance")
@EntityScan("com.personfinance.modules.user.infrastructure.persistence.entity")
@EnableJpaRepositories("com.personfinance.modules.user.infrastructure")
public class PersonFinanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonFinanceApplication.class, args);
    }
}
