package fr.nexworld.apimarketing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(value = "fr.nexworld.domain.entities")
public class ApiMarketingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiMarketingApplication.class, args);
    }
}
