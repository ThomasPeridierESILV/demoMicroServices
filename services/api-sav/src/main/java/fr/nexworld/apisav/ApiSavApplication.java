package fr.nexworld.apisav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(value = "fr.nexworld.domain.entities")
public class ApiSavApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiSavApplication.class, args);
    }
}
