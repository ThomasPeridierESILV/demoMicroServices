package fr.nexworld.commande.visu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "fr.nexworld.commande.visu")
public class CommandeVisuApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommandeVisuApplication.class, args);
    }
}