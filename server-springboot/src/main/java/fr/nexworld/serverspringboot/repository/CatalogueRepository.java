package fr.nexworld.serverspringboot.repository;

import fr.nexworld.serverspringboot.entities.Catalogue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogueRepository extends JpaRepository<Catalogue, Long>{
}
