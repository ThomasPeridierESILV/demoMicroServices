package fr.nexworld.springbootserver.repository;

import fr.nexworld.springbootserver.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long>{
}
