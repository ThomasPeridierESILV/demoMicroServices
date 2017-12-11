package fr.nexworld.apimarketing.repositories;

import fr.nexworld.apimarketing.entities.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionRepository extends JpaRepository<Promotion, Long> {
}
