package fr.nexworld.apicatalogue.repositories;

import fr.nexworld.apicatalogue.entities.Catalogue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogueRepository extends JpaRepository<Catalogue, Long> {
}
