package fr.nexworld.apicommande.repositories;

import fr.nexworld.domain.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
