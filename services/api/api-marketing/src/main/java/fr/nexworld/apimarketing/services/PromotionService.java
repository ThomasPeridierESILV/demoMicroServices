package fr.nexworld.apimarketing.services;

import fr.nexworld.apimarketing.entities.Promotion;

import java.util.List;

public interface PromotionService {

    Promotion get(Long id);

    List<Promotion> getAll();

    Promotion post(Promotion promotion);

    Promotion put(Promotion promotion, Long id);

}
