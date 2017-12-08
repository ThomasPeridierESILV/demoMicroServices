package fr.nexworld.apipromotion.services;

import fr.nexworld.domain.entities.Promotion;

import java.util.List;

public interface MarketingService {

    Promotion get(Long id);

    List<Promotion> getAll();

    Promotion post(Promotion promotion);

    Promotion put(Promotion promotion, Long id);

}
