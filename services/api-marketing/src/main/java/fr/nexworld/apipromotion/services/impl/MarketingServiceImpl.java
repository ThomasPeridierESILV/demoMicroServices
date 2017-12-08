package fr.nexworld.apipromotion.services.impl;

import fr.nexworld.domain.entities.Promotion;
import fr.nexworld.apipromotion.repositories.MarketingRepository;
import fr.nexworld.apipromotion.services.MarketingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketingServiceImpl implements MarketingService {

    private MarketingRepository marketingRepository;

    @Autowired
    public MarketingServiceImpl(MarketingRepository marketingRepository) {
        this.marketingRepository = marketingRepository;
    }

    @Override
    public Promotion get(Long id) {
        return this.marketingRepository.findOne(id);
    }

    @Override
    public List<Promotion> getAll() {
        return this.marketingRepository.findAll();
    }

    @Override
    public Promotion post(Promotion promotion) {
        return this.marketingRepository.save(promotion);
    }

    @Override
    public Promotion put(Promotion promotion, Long id) {
        promotion.setId(id);
        return this.marketingRepository.save(promotion);
    }
}
