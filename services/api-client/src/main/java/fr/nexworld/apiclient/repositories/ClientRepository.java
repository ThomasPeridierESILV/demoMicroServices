package fr.nexworld.apiclient.repositories;

import fr.nexworld.domain.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
