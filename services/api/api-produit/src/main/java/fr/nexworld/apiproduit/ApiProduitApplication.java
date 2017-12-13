package fr.nexworld.apiproduit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(value = "fr.nexworld.apiproduit.entities")
public class ApiProduitApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiProduitApplication.class, args);
    }
}
