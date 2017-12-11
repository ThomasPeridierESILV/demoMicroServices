package fr.nexworld.apicommande.repositories;

import fr.nexworld.apicommande.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
