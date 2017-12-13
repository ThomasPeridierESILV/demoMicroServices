package fr.nexworld.apicommande;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(value = "fr.nexworld.apicommande.entities")
public class ApiCommandeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiCommandeApplication.class, args);
    }
}
