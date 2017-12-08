package fr.nexworld.apipromotion.repositories;

import fr.nexworld.domain.entities.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketingRepository extends JpaRepository<Promotion, Long> {
}
