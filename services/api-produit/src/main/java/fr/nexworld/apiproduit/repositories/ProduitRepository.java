package fr.nexworld.apiproduit.repositories;

import fr.nexworld.domain.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
