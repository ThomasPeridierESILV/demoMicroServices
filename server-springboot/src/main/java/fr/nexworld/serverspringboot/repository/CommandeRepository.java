package fr.nexworld.serverspringboot.repository;

import fr.nexworld.serverspringboot.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long>{
}
