package fr.nexworld.apimarketing.services.impl;

import fr.nexworld.apimarketing.entities.Promotion;
import fr.nexworld.apimarketing.repositories.PromotionRepository;
import fr.nexworld.apimarketing.services.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionServiceImpl implements PromotionService {

    private PromotionRepository promotionRepository;

    @Autowired
    public PromotionServiceImpl(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    @Override
    public Promotion get(Long id) {
        return this.promotionRepository.findOne(id);
    }

    @Override
    public List<Promotion> getAll() {
        return this.promotionRepository.findAll();
    }

    @Override
    public Promotion post(Promotion promotion) {
        return this.promotionRepository.save(promotion);
    }

    @Override
    public Promotion put(Promotion promotion, Long id) {
        promotion.setId(id);
        return this.promotionRepository.save(promotion);
    }
}
