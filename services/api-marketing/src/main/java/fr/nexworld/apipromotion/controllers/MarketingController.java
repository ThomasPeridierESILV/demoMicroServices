package fr.nexworld.apipromotion.controllers;

import fr.nexworld.domain.entities.Promotion;
import fr.nexworld.apipromotion.services.MarketingService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@RequestMapping("/promotions")
public class MarketingController {

    private MarketingService marketingService;

    @Autowired
    public MarketingController(MarketingService marketingService) {
        this.marketingService = marketingService;
    }

    @GetMapping("/{id}")
    Promotion get(@PathVariable Long id) {
        return this.marketingService.get(id);
    }

    @GetMapping
    List<Promotion> getAll() {
        return this.marketingService.getAll();
    }

    @PostMapping
    Promotion post(@RequestBody Promotion promotion) {
        return this.marketingService.post(promotion);
    }

    @PutMapping("/{id}")
    Promotion put(@RequestBody Promotion promotion, @PathVariable Long id) {
        return this.marketingService.put(promotion, id);
    }
}