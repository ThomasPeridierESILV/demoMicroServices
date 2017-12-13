package fr.nexworld.apistock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(value = "fr.nexworld.apistock.entities")
public class ApiStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiStockApplication.class, args);
    }
}
