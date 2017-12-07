package fr.nexworld.serverspringboot.repository;

import fr.nexworld.serverspringboot.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long>{
}
