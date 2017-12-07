package fr.nexworld.serverspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "fr.nexworld.serverspringboot.entities")
public class ServerSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerSpringbootApplication.class, args);
    }
}
